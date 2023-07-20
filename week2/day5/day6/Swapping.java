import java.util.Scanner;
public class Swapping
  {
    public static void main(String args[])
    {
      int c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number");
      int a=sc.nextInt();
      System.out.println("Enter the second number");
      int b=sc.nextInt();
      System.out.println("Before swapping");
      System.out.println(a + "\n" + b);
      c=a;
      a=b;
      b=c;
      System.out.println("After swapping");
      System.out.println(a + "\n" + b);
    }
}