import java.util.Scanner;
class AreaOfSquare
  {
    public static void area(double side)
    {
      double area=side*side;
      System.out.println("Area of square is "+area);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter side value");
      double side=sc.nextDouble();
      area(side);
    }
  }