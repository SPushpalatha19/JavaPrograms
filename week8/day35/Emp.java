/*Create a Java program that manages an array of Employee objects. Each Employee object should have the following attributes:
employeeId: A unique 4-digit identifier for the employee.
employeeName: The name of the employee (between 3 and 40 characters).
mobileNumber: The employee's mobile number, a 10-digit string that starts with 9, 8, 7, or 6.
salary: The employee's salary, a positive integer not exceeding 1,000,000.
The program should allow the user to input data for each employee dynamically with the following validations:
employeeId: Ensure it's a unique 4-digit identifier.
employeeName: Validate that it contains only letters and is between 3 and 40 characters.
mobileNumber: Confirm that it's a 10-digit number starting with 9, 8, 7, or 6.
salary: Validate that it's a positive integer and doesn't exceed 1,000,000.
 After collecting the data for five employees, display the details for all five employees.
Your program should implement these requirements and ensure that the data collected is accurate and follows the provided validation rules.*/
import java.util.Scanner;
class Employees
  {
    int eid;
    String ename;
    long mobileno;
    double salary;
    public void insertDetails(int eid,String ename,long mobileno,double salary)
    {
      this.eid=eid;
      this.ename=ename;
      this.mobileno=mobileno;
      this.salary=salary;
    }
    public void display()
    {
      System.out.println(eid+" "+ename+" "+mobileno+" "+salary);
    }
  }
class Emp
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter how many employee details you have to store");
      int count=sc.nextInt();
      Employees[] employee=new Employees[count];
      for(int i=0;i<count;i++)
        {
          employee[i]=new Employees();
          int id;
          while(true)
            {
              System.out.println("enter the id");
              id=sc.nextInt();
              if(id<=999&&id>=9999)
              {
                System.out.println("id must be 4 digits");
              }
              else{
                boolean isUnique=true;
                for(int j=0;j<i;j++)
                  {
                    if(employee[j].eid==id){
                      System.out.println("enter unique id");
                      isUnique=false;
                      break;
                    }
                  }
                if(isUnique)
                {
                  System.out.println("id is valid");
                  break;
                }
              }
            }
          String name;
          while(true)
            {
              System.out.println("enter name");
              name=sc.next();
              if(name.length()>=3&&name.length()<=40)
              {
                System.out.println("name is valid");
                break;
              }
              else{
                System.out.println("enter valid name");
              }
            }
          long mobile;
          while(true)
            {
              System.out.println("enter mobile no");
              mobile=sc.nextLong();
              String phno=Long.toString(mobile);
              if(phno.length()==10&&(phno.startsWith("9")||phno.startsWith("8")||phno.startsWith("7")||phno.startsWith("6")))
              {
                System.out.println("mobileno is valid");
                break;
              }
              else{
                System.out.println("enter valid mobile no");
              }
            }
          double salary;
          while(true)
            {
              System.out.println("enter salary");
              salary=sc.nextDouble();
              if(salary>0&&salary<=1000000)
              {
                System.out.println("salary is valid");
                break;
              }
              else{
                System.out.println("enter valid salary");
              }
            }
          employee[i].insertDetails(id,name,mobile,salary);              
            }
      for(int i=0;i<count;i++)
        {
          employee[i].display();
        }
        }
    }
  