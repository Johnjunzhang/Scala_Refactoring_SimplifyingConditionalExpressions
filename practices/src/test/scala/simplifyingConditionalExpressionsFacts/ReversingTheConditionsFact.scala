package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import simplifyingConditionalExpressions.replaceConditionalwithPolymorphism.removeControlFlag.Employee
import simplifyingConditionalExpressions.replaceNestedConditionalwithGuardClauses.removeControlFlag.{ReversingTheConditions, ReplaceNestedConditionalwithGuardClauses}

@RunWith(classOf[JUnitRunner])
class ReversingTheConditionsFact extends FunSpec with Matchers {
  describe("ReversingTheConditionsFact") {
    it("should_get_zero_adjusted_capital_given_capital_is_less_than_zero") {
      val reversingTheConditions = new ReversingTheConditions(-1, 10, 10, 10);
      reversingTheConditions.getAdjustedCapital() should be(0)
    }

    it("should_get_zero_adjusted_capital_given_init_rate_is_less_than_zero") {
      val reversingTheConditions = new ReversingTheConditions(10, -1, 10, 10);
      reversingTheConditions.getAdjustedCapital() should be(0)
    }

    it("should_get_zero_adjusted_capital_given_duration_is_less_than_zero") {
      val reversingTheConditions = new ReversingTheConditions(10, 10, -1, 10);
      reversingTheConditions.getAdjustedCapital() should be(0)
    }

    it("should_get_adjusted_capital_given_duration_and_capital_and_init_rate_all_are_greater_than_zero") {
      val reversingTheConditions = new ReversingTheConditions(10, 10, 5, 10);
      reversingTheConditions.getAdjustedCapital() should be(4)
    }
  }
}
