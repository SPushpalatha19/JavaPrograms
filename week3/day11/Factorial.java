import java.util.Scanner;
class Factorial
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to find out the factorial");
      int n=sc.nextInt();
      int result=1;
      for(int i=1;i<=n;i++)
        {
          result=result*i;
        }
      System.out.println("factorial of "+n+" is "+result);
    }
  }