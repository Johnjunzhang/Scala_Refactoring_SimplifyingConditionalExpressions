package simplifyingConditionalExpressions.replaceConditionalwithPolymorphism.removeControlFlag


private class SalesMan extends EmployeeType
{
  override def getEmployeeCode():Int = {
    EmployeeType.SALESMAN
  }
}


