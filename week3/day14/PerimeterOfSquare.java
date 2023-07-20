import java.util.*;
class PerimeterOfSquare
  {
    public static void perimeter(double side)
    {
      double result=4*side;
      System.out.println("The perimeter of the square is "+result);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the side value");
      double side=sc.nextDouble();
      perimeter(side);
    }
  }