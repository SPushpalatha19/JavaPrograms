import java.util.Scanner;
 public class Logical
  {
    public static void main(String args[])
    {
      Scanner n=new Scanner(System.in);
      System.out.println("Enter X as boolean value");
      boolean X=n.nextBoolean();
      System.out.println("Enter Y as boolean value");
      boolean Y=n.nextBoolean();
      System.out.println("X&&Y is "+(X&&Y));
      System.out.println("X||Y is "+(X||Y));
      System.out.println("!X is "+(!X));
      System.out.println("!Y is "+(!Y));
    }
 }