package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import simplifyingConditionalExpressions.introduceNullObject.{Customer, Site, Client}
import simplifyingConditionalExpressions.removeControlFlag.ReplacedWithBreak

@RunWith(classOf[JUnitRunner])
class RemoveControlFlagExample1Fact extends FunSpec with Matchers {
  describe("RemoveControlFlagExample1Fact") {
    it("should_get_alert_message_if_people_names_include_don") {
      val peopleNames = Array("Don", "Kent")
      val replacedWithBreak = new ReplacedWithBreak();
      replacedWithBreak.checkSecurity(peopleNames);
      replacedWithBreak.alertedMessage should be("Alert")
    }

    it("should_get_alert_message_if_people_names_include_john") {
      val peopleNames = Array("John", "Kent")
      val replacedWithBreak = new ReplacedWithBreak();
      replacedWithBreak.checkSecurity(peopleNames);
      replacedWithBreak.alertedMessage should be("Alert")
    }

    it("should_not_get_alert_message_if_people_names_does_include_don_and_john") {
      val peopleNames = Array("Martin", "Kent")
      val replacedWithBreak = new ReplacedWithBreak();
      replacedWithBreak.checkSecurity(peopleNames);
      replacedWithBreak.alertedMessage should be("")
    }
  }
}
