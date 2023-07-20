import java.util.Scanner;
class Equal
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number");
      int n1=sc.nextInt();
      System.out.println("enter second number");
      int n2=sc.nextInt();
      System.out.println("enter third number");
      int n3=sc.nextInt();
      System.out.println("enter fourth number");
      int n4=sc.nextInt();
      if((n1==n2)&&(n1==n3)&&(n1==n4))
      {
        System.out.println("given numbers are equal");
      }
      else
      {
        System.out.println("given numbers are not equal");
      }
    }
  }