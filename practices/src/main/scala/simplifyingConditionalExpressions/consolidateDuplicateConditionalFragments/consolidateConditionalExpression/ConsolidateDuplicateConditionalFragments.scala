package simplifyingConditionalExpressions.consolidateDuplicateConditionalFragments.consolidateConditionalExpression

class ConsolidateDuplicateConditionalFragments(isSpecialDeal: Boolean, price: Double) {
  private var total:Double = 0;

  def disabilityAmount():Double = {
    if (isSpecialDeal)
    {
      total = price * 0.95;
      send();
    }
    else
    {
      total = price * 0.98;
      send();
    }
    return total;
  }

  private def send() = {
    total += 1;
  }
}
