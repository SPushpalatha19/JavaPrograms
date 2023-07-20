//performing operations based on operator
import java.util.Scanner;
class Switch
  {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("+ for addition");
      System.out.println("- for subtraction");
      System.out.println("* for multiplication");
      System.out.println("/ for division");
      System.out.println("% for modulo division");
      System.out.println("select any of the operator");
      char ch=sc.next().charAt(0);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      switch(ch)
        {
          case '+':
            System.out.println("result is "+(a+b));
            break;
          case '-':
            System.out.println("result is "+(a-b));
            break;
          case '*':
            System.out.println("result is "+(a*b));
            break;
          case '/':
            System.out.println("result is "+(a/b));
            break;
          case '%':
            System.out.println("result is "+(a%b));
            break;
          default:
            System.out.println("enter valid operator");
            }
    }
  }