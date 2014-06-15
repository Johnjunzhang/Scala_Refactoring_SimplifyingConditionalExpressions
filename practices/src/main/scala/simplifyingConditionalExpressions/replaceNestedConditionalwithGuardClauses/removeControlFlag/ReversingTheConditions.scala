package simplifyingConditionalExpressions.replaceNestedConditionalwithGuardClauses.removeControlFlag

class ReversingTheConditions(capital: Double, intRate: Double, duration: Double, income: Double) {
  private val AdjFactor:Double = 2;

  def getAdjustedCapital(): Double = {
    var result:Double = 0.0;
    if (capital > 0.0) {
      if (intRate > 0.0 && duration > 0.0) {
        result = (income / duration) * AdjFactor;
      }
    }
    return result;
  }
}
