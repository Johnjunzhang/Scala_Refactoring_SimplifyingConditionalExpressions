package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import simplifyingConditionalExpressions.replaceConditionalwithPolymorphism.removeControlFlag.{Employee, EmployeeType}
import simplifyingConditionalExpressions.replaceNestedConditionalwithGuardClauses.removeControlFlag.ReplaceNestedConditionalwithGuardClauses

@RunWith(classOf[JUnitRunner])
class ReplaceNestedConditionalwithGuardClausesFact extends FunSpec with Matchers {
  describe("ReplaceNestedConditionalwithGuardClausesFact") {
    it("should_get_dead_amount_pay_given_is_dead") {
      val replaceNestedConditionalwithGuardClauses = new ReplaceNestedConditionalwithGuardClauses(true, false, false);
      replaceNestedConditionalwithGuardClauses.getPayAmount() should be(400)
    }

    it("should_get_separated_amount_pay_given_is_separated_and_not_dead") {
      val replaceNestedConditionalwithGuardClauses = new ReplaceNestedConditionalwithGuardClauses(false, true, false);
      replaceNestedConditionalwithGuardClauses.getPayAmount() should be(300)
    }

    it("should_get_separated_amount_pay_given_is_retired_and_not_dead_and_not_seperated") {
      val replaceNestedConditionalwithGuardClauses = new ReplaceNestedConditionalwithGuardClauses(false, false, true);
      replaceNestedConditionalwithGuardClauses.getPayAmount() should be(200)
    }

    it("should_get_normal_amount_pay_given_is_not_retired_and_not_dead_and_not_seperated") {
      val replaceNestedConditionalwithGuardClauses = new ReplaceNestedConditionalwithGuardClauses(false, false, false);
      replaceNestedConditionalwithGuardClauses.getPayAmount() should be(100)
    }
  }
}
