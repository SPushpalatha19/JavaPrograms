/*Assignment 1: Shape Interface Create an interface called Shape with the following methods:
calculateArea(): Abstract method that calculates and returns the area of the shape.
calculatePerimeter(): Abstract method that calculates and returns the perimeter of the shape.
getDescription(): Abstract method that returns a String describing the shape.
Now, create classes Circle, Rectangle, and Triangle, implementing the Shape interface. Write appropriate code to calculate the area and perimeter for each shape and provide a description.*/
import java.util.Scanner;
interface Shape
  {
    public void calculateArea();
    public void calculatePerimeter();
    public void getDescription();
  }
class Circle implements Shape
  {
    int radius;
    public void setDetails(int radius)
    {
      this.radius=radius;
    }
    public void getDescription()
    {
      System.out.println("Finding area and perimeter of the circle");
    }
    public void calculateArea()
    {
      System.out.println("Area of the circle is "+(3.14*radius*radius));
    }
    public void calculatePerimeter()
    {
      System.out.println("Perimeter of the circle is "+(2*3.14*radius));
    }
  }
class Rectangle implements Shape
  {
    float length;
    float breadth;
    public void setDetails(float length,float breadth)
    {
      this.length=length;
      this.breadth=breadth;
    }
    public void getDescription()
    {
      System.out.println("Finding area and perimeter of the rectangle");
    }
    public void calculateArea()
    {
      System.out.println("Area of the rectangle is "+(length*breadth));
    }
    public void calculatePerimeter()
    {
      System.out.println("Perimeter of the rectangle is "+(2*(length+breadth)));
    }
  }
class Triangle implements Shape{
  float base;
  float height;
  float side1;
  float side2;
  float side3;
  public void setDetails(float base,float height,float side1,float side2,float side3)
  {
    this.base=base;
    this.height=height;
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;
  }
  public void getDescription()
  {
    System.out.println("Finding area and perimeter of the triangle");
  }
  public void calculateArea()
  {
    System.out.println("Area of the triangle is "+(0.5*base*height));
  }
  public void calculatePerimeter()
  {
    System.out.println("Perimeter of the triangle is "+(side1+side2+side3));
  }
}
class Program1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Circle circle=new Circle();
      Rectangle rectangle=new Rectangle();
      Triangle triangle=new Triangle();
      System.out.println("enter radius of the circle");
      circle.setDetails(sc.nextInt());
      circle.getDescription();
      circle.calculateArea();
      circle.calculatePerimeter();
      System.out.println("enter length and breadth of the rectangle");
      rectangle.setDetails(sc.nextFloat(),sc.nextFloat());
      rectangle.getDescription();
      rectangle.calculateArea();
      rectangle.calculatePerimeter();
      System.out.println("enter base and height values of the triangle");
      System.out.println("etner 3 side values of the triangle");
triangle.setDetails(sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
      triangle.getDescription();
      triangle.calculateArea();
      triangle.calculatePerimeter();
      
    }
  }