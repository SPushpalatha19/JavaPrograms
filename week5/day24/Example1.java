import java.util.Scanner;
class Example1
  {
    public void subtraction(int a,int b)
    {
      System.out.println("difference between two numbers is "+(a-b));
    }
    public static void main(String args[])
    {
      Example1 e=new Example1();
      //int a=10,b=5;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      e.subtraction(a,b);
    }
  }