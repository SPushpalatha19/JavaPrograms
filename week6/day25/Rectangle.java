/*Create a class called "Rectangle" with instance variables for storing the length and width of a rectangle. Implement methods to calculate and return the area and perimeter of the rectangle.*/
import java.util.Scanner;
class Rectangle
  {
    float length;
    float breadth;
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Rectangle rectangle=new Rectangle();
    //rectangle.length=12.20f;
     // rectangle.breadth=14.00f;
      System.out.println("enter the length");
      rectangle.length=sc.nextFloat();
      System.out.println("enter the breadth");
       rectangle.breadth=sc.nextFloat();
      rectangle.display();
      //System.out.println("length is "+rectangle.length);
    //System.out.println("breadth is "+rectangle.breadth);
     System.out.println("Area of the rectangle is "+ rectangle.area());
      System.out.println("Perimeter of the rectangle is "+rectangle.perimeter());
    }
    public void display()
    {
      System.out.println("length is "+length);
      System.out.println("breadth is "+breadth);
    }
    public float area()
    {
      float area=length*breadth;
      return area;
    }
    public float perimeter()
    {
      float perimeter=2*(length+breadth);
      return perimeter;
    }
  }