/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that initializes these variables and display the employee's details.*/
class Employee {
  String name;
  String designation;
  int salary;

  public static void main(String args[]) {
    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
    emp1.name = "Raghu";
    emp1.designation = "clerk";
    emp1.salary = 20000;
    // System.out.println("employee id is "+emp.id);
    // System.out.println("employee name is "+emp.name);
    emp2.name = "Ram";
    emp2.designation = "Assistant manager";
    emp2.salary = 30000;
    // System.out.println("employee id is "+emp1.id);
    // System.out.println("employee name is "+emp1.name);
    emp3.name = "Kumar";
    emp3.designation = "Manager";
    emp3.salary = 40000;
    emp1.display();
    emp2.display();
    emp3.display();
  }

  public void display() {
    System.out.println("Name of the employee is " + name);
    System.out.println("Designation of the employee is " + designation);
    System.out.println("Salary of the employee is " + salary);
  }
}