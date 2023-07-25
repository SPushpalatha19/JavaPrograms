/*Assignment 1: Shape Hierarchy

Create an abstract class called "Shape" that has the following abstract methods:

get_area(): Returns the area of the shape.
get_perimeter(): Returns the perimeter of the shape.

Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.

Write a program to:

Create instances of Circle, Rectangle, and Triangle.
Prompt the user to enter dimensions for each shape.
Calculate and display the area and perimeter of each shape.*/
import java.util.Scanner;
abstract class Shape
  {
     Scanner sc=new Scanner(System.in);
    abstract void getArea();
    abstract void getPerimeter();
  }
class Circle extends Shape{
public void getArea()
  {
    System.out.println("enter radius of the circle");
float radius=sc.nextFloat();
  System.out.println("Area of the circle is "+(3.14*radius*radius));
  }
public void getPerimeter()
  {
    System.out.println("enter radius of the circle");
float radius=sc.nextFloat();
  System.out.println("Perimeter of the circle is "+(2*3.14*radius));
  }
}
class Rectangle extends Shape{
  //Scanner sc=new Scanner(System.in)
public void getArea()
  {
    System.out.println("enter length of the rectangle");
float length=sc.nextFloat();
System.out.println("enter breadth of the rectangle");
float breadth=sc.nextFloat();
  System.out.println("Area of the rectangle is "+ (length*breadth));
  }
public void getPerimeter()
  {
   System.out.println("enter length of the rectangle");
float length=sc.nextFloat();
System.out.println("enter breadth of the rectangle");
float breadth=sc.nextFloat();
  System.out.println("Perimeter of the rectangle is "+(2*(length+breadth)));
  }
}
class Triangle extends Shape{
  //Scanner sc=new Scanner(System.in);
  public void getArea()
    {
      System.out.println("enter base of the triangle");
    float base=sc.nextFloat();
  System.out.println("enter height of the triangle");
    float height=sc.nextFloat();
    System.out.println("Area of the triangle is "+(0.5*base*height));
    }
 
  public void getPerimeter()
  {
    System.out.println("enter the lengths of three sides");
    float side1=sc.nextFloat();
    float side2=sc.nextFloat();
    float side3=sc.nextFloat();
    System.out.println("Perimeter of the triangle is "+(side1+side2+side3));
  }
  }
class AreaPerimeter
  {
    public static void main(String args[])
    {
     // Scanner sc=new Scanner(System.in);
      Circle circle=new Circle();
      Rectangle rectangle=new Rectangle();
      Triangle triangle=new Triangle();
      circle.getArea();
      circle.getPerimeter();
      rectangle.getArea();
      rectangle.getPerimeter();
      triangle.getArea();
      triangle.getPerimeter();
    }
  }
