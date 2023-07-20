import java.util.Scanner;
class CalculatorElseIf
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char option;
      do{
        System.out.println("Select the operator");
        System.out.println("+ for addition"+"\n"+"- for subtraction"+"\n"+"* for multiplication"+"\n"+"/ for division"+"\n"+"% for modulo division");
        char ch=sc.next().charAt(0);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        if(ch=='+')
        {
          System.out.println("sum is "+(a+b));
        }
        else if(ch=='-')
        {
          System.out.println("difference is "+(a-b));
        }
        else if(ch=='*')
        {
          System.out.println("product is "+(a*b));
        }
        else if(ch=='/')
        {
          System.out.println("division is "+(a/b));
        }
        else if(ch=='%')
        {
          System.out.println("modulo division is "+(a%b));
        }
        else
        {
          System.out.println("Enter valid operator");
        }
      System.out.println("If you want to continue press y otherwise pree n");
        option=sc.next().charAt(0);
      }while(ch=='y'||ch=='Y');
    }
  }