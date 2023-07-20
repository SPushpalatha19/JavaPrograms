import java.util.Scanner;
class Rectangle
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter length");
      double len=sc.nextDouble();
      System.out.println("enter breadth");
      double bre=sc.nextDouble();
      double area=len*bre;
      System.out.println("area of the rectangle is "+area);
      double peri=2*(len+bre);
      System.out.println("perimeter of the rectangle is "+peri);
    }
  }