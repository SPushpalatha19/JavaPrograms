import java.util.Scanner;
class SimpleIf
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value");
      int b=sc.nextInt();
      int sum=a+b;
      if(sum>20)
      {
        System.out.println("sum of two variables is greater than 20");
      }
    }
  }