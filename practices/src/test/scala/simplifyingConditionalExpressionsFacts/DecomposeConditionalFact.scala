package simplifyingConditionalExpressionsFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import simplifyingConditionalExpressions.consolidateDuplicateConditionalFragments.consolidateConditionalExpression.ConsolidateDuplicateConditionalFragments
import simplifyingConditionalExpressions.decomposeConditional.ChargeCalculator
import java.util.Calendar

@RunWith(classOf[JUnitRunner])
class DecomposeConditionalFact extends FunSpec with Matchers {
  describe("DecomposeConditionalFact") {
    it("should_get_summer_charge_given_date_is_in_summer") {
      val chargeCalculator = new ChargeCalculator();
      val date = getDate(2011, 7, 1)
      val charge = chargeCalculator.getCharge(date, 100);
      charge should be(200)
    }

    it("should_get_winter_charge_given_date_is_not_in_summer") {
      val chargeCalculator = new ChargeCalculator();
      val date = getDate(2011, 11, 1)
      val charge = chargeCalculator.getCharge(date, 100);
      charge should be(400)
    }
  }

  def getDate (year: Int, month: Int, day: Int):Calendar = {
    val date = Calendar.getInstance()
    date.set(Calendar.YEAR, year)
    date.set(Calendar.MONTH, month)
    date.set(Calendar.DAY_OF_MONTH, day)
    date
  }
}
