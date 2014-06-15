package movingFeatures.extractClass

class AndsExample(lengthOfService: Double, onVacation: Boolean) {
  def getCharge():Double = {
    if (onVacation)
      if (lengthOfService > 10)
        return 1;
    return 0.5;
  }
}
