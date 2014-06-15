package simplifyingConditionalExpressions.replaceConditionalwithPolymorphism.removeControlFlag

class Employee(personType:Int)
{
  private val MonthlySalary = 100
  private val Commission = 20
  private val Bonus = 50
  val employeeType = EmployeeType.GetEmployeeType(personType);

  def payAmount():Int ={
    employeeType.getEmployeeCode() match
    {
      case EmployeeType.ENGINEER => MonthlySalary;
      case EmployeeType.SALESMAN => MonthlySalary + Commission;
      case EmployeeType.MANAGER => MonthlySalary + Bonus;
      case _ => throw new Exception
    }
  }
}




