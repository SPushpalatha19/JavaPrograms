//WAP to calculate sum of digits of a number.
//WAP to calculate product of digits of a number.
import java.util.Scanner;
class DigitSumProduct
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int sum=0;
      int product=1;
      while(num>0)
        {
         int digit=num%10;
          sum=sum+digit;
          product=product*digit;
          num=num/10;
        }
      System.out.println("sum of digits is:"+sum);
      System.out.println("product of digits is:"+product);
    }
  }
