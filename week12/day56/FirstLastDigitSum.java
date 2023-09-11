//WAP to find first and last digit of a number.
//WAP to find sum of first and last digit of a number.
import java.util.Scanner;
class FirstLastDigitSum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int last=num%10;
      int digit=0;
      while(num>0)
        {
          digit=num%10;
          num=num/10;
        }
      int first=digit;
      System.out.println("first digit is:"+first);
      System.out.println("last digit is:"+last);
      System.out.println("sum of first and last digits is:"+(first+last));
    }
  }