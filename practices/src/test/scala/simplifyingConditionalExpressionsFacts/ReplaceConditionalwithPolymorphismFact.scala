package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import simplifyingConditionalExpressions.removeControlFlag.UsingReturn
import simplifyingConditionalExpressions.replaceConditionalwithPolymorphism.removeControlFlag.{Employee, EmployeeType}

@RunWith(classOf[JUnitRunner])
class ReplaceConditionalwithPolymorphismFact extends FunSpec with Matchers {
  describe("ReplaceConditionalwithPolymorphismFact") {
    it("should_get_pay_amount_for_engineer_given_type_is_engineer") {
      val employee = new Employee(EmployeeType.ENGINEER);
      employee.payAmount() should be(100)
    }

    it("should_get_pay_amount_for_sales_man_given_type_is_sales_man") {
      val employee = new Employee(EmployeeType.SALESMAN);
      employee.payAmount() should be(120)
    }

    it("should_get_pay_amount_for_manager_given_type_is_manager") {
      val employee = new Employee(EmployeeType.MANAGER);
      employee.payAmount() should be(150)
    }
  }
}
