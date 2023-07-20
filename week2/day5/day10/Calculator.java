import java.util.Scanner;
class Calculator
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double result;
      System.out.println("Enter a value");
      double a=sc.nextDouble();
      System.out.println("Enter b value");
      double b=sc.nextDouble();
      System.out.println("Please enter the operator to perform particular operation(+ or - or * or / or %");
      char ch=sc.next().charAt(0);
      switch(ch)
        {
          case '+':
           result=a+b;
            System.out.println("Addition of two values is "+result);
          break;
          case '-':
           result=a-b;
            System.out.println("Difference between two numbers is "+result);
            break;
          case '*':
          result=a*b;
            System.out.println("Multiplication of two numbers is "+result);
            break;
          case '/':
           result=a/b;
            System.out.println("Division of two numbers is "+result);
            break;
          case '%':
           result=a%b;
            System.out.println("Modular division of two numbers is "+result);
            break;
          default:
            System.out.println("Please enter the valid operator");
            break;
        }
    }
  }