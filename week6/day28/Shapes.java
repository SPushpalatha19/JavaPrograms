//calculating areas of the different shpaes using method overloading.
class Areas 
{
  void area()
  {
    System.out.println("displaying areas of all the shapes");
  }

  void area(float side)
  {
    System.out.println("Area of the square is " + (side * side));
  }

  void area(float length, float breadth)
  {
    System.out.println("Area of the rectangle is " + (length * breadth));
  }

  void area(int base, int height)
  {
    System.out.println("Area of the triangle is " + (0.5 * base * height));
  }

  void area(int radius)
  {
    System.out.println("Area of the circle is " + (3.14 * radius * radius));
  }
}

class Shapes 
{
  public static void main(String args[])
  {
    Areas ar = new Areas();
    ar.area();
    ar.area(20.0f);
    ar.area(10.5f, 18.9f);
    ar.area(14, 20);
    ar.area(29);
  }
}