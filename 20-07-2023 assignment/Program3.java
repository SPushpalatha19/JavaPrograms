/*Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:

Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.*/
class MathOperations {
  void calculate(int a, int b) {
    System.out.println("sum is " + (a + b));
  }

  void calculate(double a, double b) {
    System.out.println("difference is " + (a - b));
  }

  void calculate(float a, float b) {
    System.out.println("product is " + (a * b));
  }

  void calculate(double a, int b) {
    System.out.println("division result is " + (a / b));
  }
}

class Program3 {
  public static void main(String args[]) {
    MathOperations mo = new MathOperations();
    mo.calculate(45, 67);
    mo.calculate(67.8, 45.0);
    mo.calculate(10f, 45f);
    mo.calculate(39.0, 3);
  }
}