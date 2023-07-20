import java.util.Scanner;
class ReadingOperandsAndOperator
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      System.out.println("Enter the operator for performing operation");
      char var=sc.next().charAt(0);
      if(var=='+')
      {
        double result=a+b;
        System.out.println(result);
      }
      else if(var=='-')
      {
        double result=a-b;
        System.out.println(result);
      }
       else if(var=='*')
      {
        double result=a*b;
        System.out.println(result);
      }
       else if(var=='/')
      {
        double result=a/b;
        System.out.println(result);
      }
       else if(var=='%')
      {
        double result=a%b;
        System.out.println(result);
      }
      else 
       {
       System.out.println("Invalid operator");
       }
    }
  }