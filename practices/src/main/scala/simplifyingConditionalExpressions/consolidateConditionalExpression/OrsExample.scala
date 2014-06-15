package simplifyingConditionalExpressions.consolidateConditionalExpression

class OrsExample(seniority: Double, monthsDisabled: Double, isPartTime: Boolean) {
  private val disabilityamount = 10

  def disabilityAmount(): Double = {
    if (seniority < 2) return 0;
    if (monthsDisabled > 12) return 0;
    if (isPartTime) return 0;
    return disabilityamount;
  }
}
