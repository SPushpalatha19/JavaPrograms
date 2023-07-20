import java.util.Scanner;
class SumOfDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int digit,sum=0;
      while(n>0)
        {
          digit=n%10;
          n=n/10;
          sum=sum+digit;
        }
      System.out.println("Sum of the digits of the number is "+sum);
    }
  }