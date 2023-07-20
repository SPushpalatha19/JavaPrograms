/*Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.*/
class Circle
  {
    double radius;
    public Circle(double circle_radius)
    {
      radius=circle_radius;
    }
      public void display()
        {
      System.out.println("Radius of the circle is "+radius);
    }
    public static void main(String args[])
    {
      Circle circle1=new Circle(12.20);
      Circle circle2=new Circle(29);
      Circle circle3=new Circle(33.00);
      circle1.display();
      circle2.display();
      circle3.display();
   }
  }