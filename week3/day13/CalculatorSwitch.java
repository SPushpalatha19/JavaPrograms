import java.util.*;
class CalculatorSwitch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char option;
      do
        {
          System.out.println("Select the operator");
          System.out.print("+ for addition"+"\n"+"- for subtraction"+"\n"+"* for multiplication"+"\n"+"/ for division"+"\n"+"% for modulo division");
          char ch=sc.next().charAt(0);
          System.out.println("enter a value");
          int a=sc.nextInt();
          System.out.println("enter b value");
          int b=sc.nextInt();
          switch(ch)
            {
              case '+':
                System.out.println("Addition of two numbers is "+(a+b));
                break;
              case '-':
                System.out.println("Subtraction of two numbers is "+(a-b));
                 break;
              case '*':
                System.out.println("Multiplication of two numbers is "+(a*b));
                break;
              case '/':
                System.out.println("Division of two numbers is "+(a/b));
                break;
              case '%':
                System.out.println("Modulo division of two numbers is "+(a%b));
                break;
              default:
                System.out.println("Invalid operator");
                break;
            }
          System.out.println("If you want to continue press y otherwise press n");
          option=sc.next().charAt(0);
            }while(option=='y'||option=='Y');
        }
  }
