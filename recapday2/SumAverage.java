import java.util.Scanner;
class SumAverage
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number");
      int a=sc.nextInt();
      System.out.println("enter second number");
      int b=sc.nextInt();
      System.out.println("enter third number");
      int c=sc.nextInt();
      System.out.println("enter fourth number");
      int d=sc.nextInt();
      System.out.println("enter fifth number");
      int e=sc.nextInt();
      int sum=a+b+c+d+e;
      System.out.println("sum of five numbers is "+sum);
      System.out.println("average of five numbers is "+(sum/5));
    }
  }