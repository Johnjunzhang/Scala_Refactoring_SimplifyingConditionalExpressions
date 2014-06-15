package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import movingFeatures.extractClass.AndsExample
import simplifyingConditionalExpressions.consolidateConditionalExpression.OrsExample
import simplifyingConditionalExpressions.consolidateDuplicateConditionalFragments.consolidateConditionalExpression.ConsolidateDuplicateConditionalFragments

@RunWith(classOf[JUnitRunner])
class ConsolidateDuplicateConditionalFragmentsFact extends FunSpec with Matchers {
  describe("ConsolidateDuplicateConditionalFragmentsFact") {
    it("should_get_disability_amount_given_is_special_deal") {
      val consolidateDuplicateConditionalFragments = new ConsolidateDuplicateConditionalFragments(true, 10)
      consolidateDuplicateConditionalFragments.disabilityAmount() should be(10.5)
    }

    it("should_get_disability_amount_given_is_not_special_deal") {
      val consolidateDuplicateConditionalFragments = new ConsolidateDuplicateConditionalFragments(false, 10)
      consolidateDuplicateConditionalFragments.disabilityAmount() should be(10.8)
    }
  }
}
