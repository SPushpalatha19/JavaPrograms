import java.util.Scanner;
class PerimeterOfRect
  {
    public static void perimeter(double length,double breadth)
    {
      double sum=length+breadth;
      double result=2*sum;
      System.out.println("Perimeter of the rectangle is "+result);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter length");
      double length=sc.nextDouble();
      System.out.println("Enter breadth");
      double breadth=sc.nextDouble();
      perimeter(length,breadth);
    }
  }