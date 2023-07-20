import java.util.Scanner;
class SplittingNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int digit;
      while(n>0)
        {
          digit=n%10;
          n=n/10;
          System.out.println(digit);
        }
    }
  }