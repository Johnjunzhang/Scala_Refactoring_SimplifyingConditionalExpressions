package simplifyingConditionalExpressions.replaceNestedConditionalwithGuardClauses.removeControlFlag

class ReplaceNestedConditionalwithGuardClauses(isDead: Boolean, isSeparated: Boolean, isRetired: Boolean) {
  def getPayAmount(): Double = {
    var result:Double = 0;
    if (isDead) result = deadAmount();
    else {
      if (isSeparated) result = separatedAmount();
      else {
        if (isRetired) result = retiredAmount();
        else result = normalPayAmount();
      }
    }
    return result;
  }

  private def normalPayAmount(): Double = {
    return 100;
  }

  private def retiredAmount(): Double = {
    return 200;
  }

  private def separatedAmount(): Double = {
    return 300;
  }

  private def deadAmount(): Double = {
    return 400;
  }
}
