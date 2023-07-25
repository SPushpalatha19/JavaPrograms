abstract class Shape
  {
    abstract void calculateArea();
  }
class Rectangle extends Shape{
  public void calculateArea()
  {
    int length=10;
    int breadth=20;
    System.out.println("Area of the rectangle is "+(length*breadth));
  }
}
class Square extends Shape{
  public void calculateArea()
  {
    int side=20;
    System.out.println("Area of the square is "+(side*side));
  }
}
class Circle extends Shape{
  public void calculateArea()
  {
    float radius=19.0f;
    System.out.println("Area of the circle is "+(3.14*radius*radius));
  }
}
class Triangle extends Shape{
  public void calculateArea()
  {
    int base=20;
    int height=15;
    System.out.println("Area of the triangle is "+(0.5*base*height));
  }
}
class Area
  {
    public static void main(String args[])
    {
      Rectangle rec=new Rectangle();
      Square sq=new Square();
      Circle cr=new Circle();
      Triangle tri=new Triangle();
      rec.calculateArea();
      sq.calculateArea();
      cr.calculateArea();
      tri.calculateArea();
    }
  }