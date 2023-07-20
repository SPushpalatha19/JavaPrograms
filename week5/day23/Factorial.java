import java.util.Scanner;
class Factorial
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to find the factorial");
      int num=sc.nextInt();
      float fact=1f;
      for(int i=num;i>0;i--)
        {
        fact=fact*i;
        }
      System.out.println("factorial of "+num+" is "+fact);
    }
  }