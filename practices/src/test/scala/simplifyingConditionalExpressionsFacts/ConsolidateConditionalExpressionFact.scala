package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.extractClass.AndsExample
import simplifyingConditionalExpressions.consolidateConditionalExpression.OrsExample

@RunWith(classOf[JUnitRunner])
class ConsolidateConditionalExpressionFact extends FunSpec with Matchers {
  describe("ConsolidateConditionalExpressionFact") {
    it("should_get_zero_disability_amount_given_seniority_less_than_two") {
      val orsExample = new OrsExample(1, 0, false)
      orsExample.disabilityAmount() should be(0)
    }

    it("should_get_zero_disability_amount_given_month_disabled_more_than_12") {
      val orsExample = new OrsExample(2, 13, false);
      orsExample.disabilityAmount() should be(0)
    }

    it("should_get_ten_disability_amount_given_seniority_greater_than_one_and_disalbed_less_than_13_and_is_not_part_time") {
      val orsExample = new OrsExample(2, 1, false);
      orsExample.disabilityAmount() should be(10)
    }

    it("should_get_1_given_is_on_vacation_and_length_of_service_greater_than_10") {
      val andsExample = new AndsExample(11, true);
      andsExample.getCharge() should be(1)
    }

    it("should_get_point_5_given_is_not_on_vacation") {
      val andsExample = new AndsExample(11, false);
      andsExample.getCharge() should be(0.5)
    }

    it("should_get_point_5_given_length_of_service_not_greater_than_10") {
      val andsExample = new AndsExample(5, false);
      andsExample.getCharge() should be(0.5)
    }
  }
}
