import java.util.Scanner;
class CountingDigits
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int digit,count=0;
      while(n>0)
        {
          digit=n%10;
          n=n/10;
          count=count+1;
        }
      System.out.println("The number of digits in the number are "+count);
    }
  }