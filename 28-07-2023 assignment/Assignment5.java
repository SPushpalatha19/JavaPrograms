/*Assignment 5: Custom Unchecked Exception Build a simple calculator program in Java. Create a custom unchecked exception called CalculatorException. This exception should be thrown when any invalid mathematical operation or input is provided to the calculator (e.g., division by zero, invalid operator, etc.). Implement the calculator's functionality and handle the CalculatorException in a way that displays an appropriate error message*/
import java.util.Scanner;
class CalculatorException extends Exception{
  CalculatorException(String message)
  {
    super(message);
  }
}
class Operations
  {
    double num1; 
    double num2;
    Operations(double num1,double num2)
    {
      this.num1=num1;
      this.num2=num2;
    }
    public void addition()
    {
      System.out.println("sum of two numbers is "+(num1+num2));
    }
    public void subtraction()
    {
      System.out.println("Difference between two numbers is "+(num1-num2));
    }
    public void multiplication()
    {
      System.out.println("Multiplication of two numbers is "+(num1*num2));
    }
    public void division() throws CalculatorException
    {
      if(num2==0)
      {
        throw new CalculatorException("we can not divide any number by 0");
      }
      else{
        System.out.println("quotient value is "+(num1/num2));
      }
    }
  }
class Assignment5
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number");
      double num1=sc.nextDouble();
      System.out.println("enter second number");
      double num2=sc.nextDouble();
      Operations obj=new Operations(num1,num2);
      obj.addition();
      obj.subtraction();
      obj.multiplication();
      try{
        obj.division();
      }
      catch(Exception e)
        {
          System.out.println(e);
        }
      System.out.println("Exception handled");
    }
  }