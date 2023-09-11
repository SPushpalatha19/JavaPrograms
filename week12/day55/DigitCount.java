//WAP to count number of digits in a number.
import java.util.Scanner;
class DigitCount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to count the digits");
      int num=sc.nextInt();
      int count=0;
      while(num>0)
        {
          int digit=num%10;
          count++;
          num=num/10;
        }
      System.out.println("number of digits in the given number are:"+count);
    }
  }