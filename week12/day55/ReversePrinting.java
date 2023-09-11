//WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
class ReversePrinting
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number where we have to start the reverse printing");
      int num=sc.nextInt();
      while(num>0)
        {
          System.out.println(num);
          num--;
        }
    }
  }