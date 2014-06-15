package simplifyingConditionalExpressions.removeControlFlag

class UsingReturn()
{
  private var alertedMessage:String = "";

  def checkSecurity(people:Array[String]):String =
  {
    var found = "";
    people.foreach(name =>
    {
      if (found == "")
      {
        if (name == "Don")
        {
          sendAlert();
          found = "Don";
        }
        if (name == "John")
        {
          sendAlert();
          found = "John";
        }
      }
    })
    someLaterCode(found)
  }

  private def someLaterCode(found:String):String = {
      alertedMessage + found;
  }

  private def sendAlert() = {
    alertedMessage = "Alert";
  }
}
