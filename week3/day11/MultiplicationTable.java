import java.util.Scanner;
class MultiplicationTable
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number for which we have to calculate multiplication table");
      int n=sc.nextInt();
      System.out.println("Enter the number for printing that number of multiples");
      int s=sc.nextInt();
      for(int i=1;i<=s;i++)
        {
          int result=i*n;
          System.out.println(n + "*" + i +"=" +result);
        }
    }
  }