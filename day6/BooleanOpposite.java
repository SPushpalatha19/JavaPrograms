import java.util.Scanner;
 public class BooleanOpposite
  {
    public static void main(String args[])
    {
      Scanner n=new Scanner(System.in);
      System.out.println("Enter X as boolean value");
      boolean X=n.nextBoolean();
      System.out.println(!X);
    }
  }