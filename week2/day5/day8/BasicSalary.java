import java.util.Scanner;
class BasicSalary
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the basic salary of an employee");
      double Salary=sc.nextDouble();
      if(Salary<=10000)
      {
      double HRA=(Salary*20)/100;
       double DA=(Salary*80)/100;
      double Gross_salary=(Salary+HRA+DA);
        System.out.println("Gross_salary"+Gross_salary);
      }
      else if(Salary<=20000)
      {
       double HRA=(Salary*25)/100;
       double DA=(Salary*90)/100;
       double Gross_salary=(Salary+HRA+DA);
        System.out.println("Gross_salary"+Gross_salary); 
      }
      else
      {
        double HRA=(Salary*30)/100;
      double DA=(Salary*95)/100;
       double Gross_salary=(Salary+HRA+DA);
        System.out.println("Gross_salary "+Gross_salary);
      }
    }
  }