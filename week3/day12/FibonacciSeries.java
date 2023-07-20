import java.util.Scanner;
class FibonacciSeries
  {
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto how many we want to print fibonacci series");
      int n=sc.nextInt();
      int first=0,second=1;
      System.out.print(first+" ");
      System.out.print(second+" ");
      for(int i=1;i<=n;i++)
        {
          int third=first+second;
          System.out.print(third+" ");
          first=second;
          second=third;
        }
    }
  }
  