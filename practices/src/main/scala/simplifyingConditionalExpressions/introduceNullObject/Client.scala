package simplifyingConditionalExpressions.introduceNullObject

class Client(site:Site) {
  val customer = site.customer

  def getStatement():String = {
    val plan = if (customer == null) "Basic Plan" else customer.getPlan()
    val customerName = if (customer == null) "occupant" else customer.getName ()
    val weeksDelinquent = if (customer == null) 0 else customer.getWeeksDelinquentInLastYear ()

    f"$plan $customerName $weeksDelinquent";
  }
}
