class EmployeeDetails {
  String name;
  String designation;
  int salary;

  public void setEmployeeDetails(String n, String d, int s)
  {
    name = n;
    designation = d;
    salary = s;
  }

  public void displayEmployeeDetails() {
    System.out.println("Name of the employee is " + name);
    System.out.println("Designation of the employee is " + designation);
    System.out.println("salary of the employee is " + salary);
  }

  public static void main(String args[]) {
    EmployeeDetails emp1 = new EmployeeDetails();
    EmployeeDetails emp2 = new EmployeeDetails();
    EmployeeDetails emp3 = new EmployeeDetails();
    emp1.setEmployeeDetails("Pushpa", "Manager", 25000);
    emp2.setEmployeeDetails("latha", "Asst manager", 20000);
    emp3.setEmployeeDetails("santhi", "clerk", 15000);
    emp1.displayEmployeeDetails();
    emp2.displayEmployeeDetails();
    emp3.displayEmployeeDetails();
  }
}