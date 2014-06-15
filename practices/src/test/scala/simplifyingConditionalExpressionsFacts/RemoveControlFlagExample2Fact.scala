package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import simplifyingConditionalExpressions.introduceNullObject.Customer
import simplifyingConditionalExpressions.removeControlFlag.{UsingReturn, ReplacedWithBreak}

@RunWith(classOf[JUnitRunner])
class RemoveControlFlagExample2Fact extends FunSpec with Matchers {
  describe("RemoveControlFlagExample2Fact") {
    it("should_get_alert_message_if_people_names_include_don") {
      val peopleNames = Array("Don", "Kent")
      val usingReturn = new UsingReturn();
      val alertMessage = usingReturn.checkSecurity(peopleNames)
      alertMessage should be("AlertDon")
    }

    it("should_get_alert_message_if_people_names_include_john") {
      val peopleNames = Array("John", "Kent")
      val usingReturn = new UsingReturn();
      val alertMessage = usingReturn.checkSecurity(peopleNames)
      alertMessage should be("AlertJohn")
    }

    it("should_alert_first_matched_people") {
      val peopleNames = Array("John", "Don")
      val usingReturn = new UsingReturn();
      val alertMessage = usingReturn.checkSecurity(peopleNames)
      alertMessage should be("AlertJohn")
    }

    it("should_not_get_alert_message_if_people_names_does_include_don_and_john") {
      val peopleNames = Array("Martin", "Kent")
      val usingReturn = new UsingReturn();
      val alertMessage = usingReturn.checkSecurity(peopleNames)
      alertMessage should be("")
    }
  }
}
