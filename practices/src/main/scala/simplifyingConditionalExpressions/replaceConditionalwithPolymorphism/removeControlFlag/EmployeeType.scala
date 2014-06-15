package simplifyingConditionalExpressions.replaceConditionalwithPolymorphism.removeControlFlag

abstract class EmployeeType
{
  def getEmployeeCode():Int
}

object EmployeeType {
  val ENGINEER = 0;
  val SALESMAN = 1;
  val MANAGER = 2;

  def GetEmployeeType(value: Int): EmployeeType = {
    value match {
      case ENGINEER => new Engineer();
      case SALESMAN => new SalesMan();
      case MANAGER => new Manager();
      case _ => throw new Exception();
    }
  }
}
