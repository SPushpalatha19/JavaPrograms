import java.util.Scanner;
class SumOfFirstAndLastDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int last=n%10;
      int result=0;
      while(n>0)
        {
          result=n%10;
          n=n/10;
        }
      int first=result;
      System.out.println("First digit is "+first);
      System.out.println("Last digit is "+last);
      int sum=first+last;
      System.out.println("sum of first and last digits is "+sum);
    }
  }