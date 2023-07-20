/*Create a class called "Employees" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Employees
  {
    String name;
    String designation;
    double salary;
    public Employees(String e_name,String e_designation,double e_salary)
    {
      name=e_name;
      designation=e_designation;
      salary=e_salary;
    }
      public void display()
        {
      System.out.println("name of the employee is "+name);
      System.out.println("designation of the employee is "+designation);
      System.out.println("salary of the employee is "+salary);
    }
    public static void main(String args[])
    {
      Employees emp1=new Employees("james","clerk",20000);
      Employees emp2=new Employees("john","clerk",20000);
      Employees emp3=new Employees("Alia","manager",35000);
      emp1.display();
      emp2.display();
      emp3.display();
    }
    
  }
