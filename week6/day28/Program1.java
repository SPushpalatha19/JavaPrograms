/*In this assignment, you are required to create a class called Calculator that implements method overloading for addition. The Calculator class should have three different methods named add, each with a different number of parameters:

add(a, b): This method should take two integer parameters and return their sum.
add(a, b, c): This method should take three integer parameters and return their sum.
add(a, b, c, d): This method should take four integer parameters and return their sum.

Your task is to write the Calculator class and demonstrate the use of these methods by calling each of them with appropriate arguments and printing the results.*/

class Calculator
  {
    void add(int a,int b)
    {
      System.out.println("addition of two integers is "+(a+b));
    }
    void add(int a,int b,int c)
    {
      System.out.println("addition of three integers is "+(a+b+c));
    }
    void add(int a,int b,int c,int d)
    {
      System.out.println("addition of four integers is "+(a+b+c+d));
    }
  }
class Program1
  {
    public static void main(String args[])
    {
      Calculator cal=new Calculator();
      cal.add(29,30);
      cal.add(67,10,20);
      cal.add(29,47,79,10);   
    }
  }