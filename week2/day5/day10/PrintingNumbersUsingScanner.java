import java.util.Scanner;
class PrintingNumbersUsingScanner
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto where we want to print");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          System.out.println(i);
        }
    }
  }