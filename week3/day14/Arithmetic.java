import java.util.Scanner;
class Arithmetic
  {
    public static void addition(double num1,double num2)
    {
      double result1=num1+num2;
      System.out.println(result1);
    }
    public static void subtraction(double num1,double num2)
    {
      double result2=num1-num2;
      System.out.println(result2);
    }
    public static void multiplication(double num1,double num2)
    {
      double result3=num1*num2;
      System.out.println(result3);
    }
    public static void division(double num1,double num2)
    {
      double result4=num1/num2;
      System.out.println(result4);
    }
    public static void modulo(double num1,double num2)
    {
      double result5=num1%num2;
      System.out.println(result5);
    }
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
     double a=sc.nextDouble();
      System.out.println("Enter b value");
     double b=sc.nextDouble();
      addition(a,b);
      subtraction(a,b);
      multiplication(a,b);
      division(a,b);
      modulo(a,b);
    }
  }
    