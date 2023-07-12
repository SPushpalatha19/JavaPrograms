import java.util.Scanner;
public class Relational
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      int x=sc.nextInt();
      System.out.println("enter the second number");
      int y=sc.nextInt();
      System.out.println(x+ " equal to "+y+ " is " +""+(x==y));
      }
  }