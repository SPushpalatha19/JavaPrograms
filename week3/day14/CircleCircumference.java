import java.util.Scanner;
class CircleCircumference
  {
    public static void circumference(float radius,float pie)
    {
    float result=2*pie*radius;
      System.out.println("Circumference of the circle is "+result);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius");
      float radius=sc.nextFloat();
      System.out.println("Enter pie value as 3.14");
      float pie=sc.nextFloat();
      circumference(radius,pie);
    }
  }