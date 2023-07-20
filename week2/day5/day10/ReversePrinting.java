import java.util.Scanner;
class ReversePrinting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number from where we have to print");
      int num=sc.nextInt();
      for(int i=num;i>=1;i--)
        {
          System.out.println(i);
        }
    }
  }