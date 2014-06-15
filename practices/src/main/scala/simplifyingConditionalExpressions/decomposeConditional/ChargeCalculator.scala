package simplifyingConditionalExpressions.decomposeConditional

import java.util.Calendar

class ChargeCalculator() {
  private val SummerStartMonth = 6;
  private val SummerEndMonth = 9;
  private val WinterServiceCharge = 100;
  private val WinterRate = 3;
  private val SummerRate = 2;

  def getCharge(date: Calendar, quantity: Double): Double = {
    var charge:Double = 0;
    if (date.get(Calendar.MONTH) < SummerStartMonth || date.get(Calendar.MONTH) > SummerEndMonth)
      charge = quantity * WinterRate + WinterServiceCharge;
    else charge = quantity * SummerRate;
    return charge;
  }
}
