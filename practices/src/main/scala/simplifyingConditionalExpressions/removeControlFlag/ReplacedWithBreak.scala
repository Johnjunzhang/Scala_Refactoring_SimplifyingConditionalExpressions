package simplifyingConditionalExpressions.removeControlFlag

class ReplacedWithBreak()
{
  var alertedMessage:String = "";

  def checkSecurity(people:Array[String]) = {
    var found = false;
    people.foreach(name => {
      if (!found) {
        if (name == "Don") {
          sendAlert();
          found = true;
        }
        if (name == "John") {
          sendAlert();
          found = true;
        }
      }
    })
  }

  private def sendAlert() = {
    alertedMessage = "Alert";
  }
}
