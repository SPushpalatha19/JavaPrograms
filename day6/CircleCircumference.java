import java.util.Scanner;
public class CircleCircumference
  {
    public static void main(String args[])
    {
      float pie=3.14f;
      float Circumference;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the radius value");
      int r=sc.nextInt();
      Circumference=2*pie*r;
      System.out.println("The circumference of the circle is "+ Circumference);
    }
  }