import java.util.Scanner;
class ProductOfDigits
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int digit,result=1;
      while(n>0)
        {
          digit=n%10;
          n=n/10;
          result=result*digit;
        }
      System.out.println("Product of the digits in the number is "+result);
    }
  }