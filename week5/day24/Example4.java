//with return type with parameters
import java.util.Scanner;
class Example4
  {
    public int add(int a,int b)
    {
      int result=a+b;
      return result;
    }
    public float diff(float a,float b)
    {
      float result1=a-b;
      return result1;
    }
    public char character(char ch)
    {
     return ch; 
    }
    public static void main(String args[])
    {
      Example4 e=new Example4();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a and b values");
      int a=sc.nextInt();
     int b=sc.nextInt();
      int sum=e.add(a,b);
      System.out.println("sum is "+sum);
      float sub=e.diff(a,b);
      System.out.println("difference is "+sub);
      System.out.println("enter the character");
      char ch=sc.next().charAt(0);
      char ch1=e.character(ch);
      System.out.println("character is "+ch1);
    }
  }