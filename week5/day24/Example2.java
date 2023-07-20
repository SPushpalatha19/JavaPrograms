import java.util.Scanner;
class Example2
  {
    public void subtraction()
    {
      //int a=10,b=5;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("difference between two numbers "+(a-b));
    }
    public static void main(String args[])
    {
      Example2 e=new Example2();
      e.subtraction();
    }
  }