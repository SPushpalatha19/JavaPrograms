/*Create a superclass called "Shape" with the following attributes:

String color
double radius
double length
double width*/
class Shape
  {
    String color;
    double radius;
    double length;
    double width;
    void display(String c,double r,double l,double w)
    {
    System.out.println("color "+c);
      System.out.println("radius is "+r);
      System.out.println("length is "+l);
      System.out.println("width is "+w);
  }
  }
class Circle extends Shape{
  void shape()
  {
    System.out.println("It is Circle class");
  }
}
class Sphere extends Shape{
  void shape()
  {
   System.out.println("It is Sphere class");
  }
}
class HierarchicalInheritance
  {
    public static void main(String args[])
    {
      Circle circle=new Circle();
      Sphere sphere=new Sphere();
      circle.shape();
      circle.display("white",10,25,15);
      sphere.shape();
      sphere.display("Gray",17,20,10);
    }
  }