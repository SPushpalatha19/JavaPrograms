class Shapes {
  void display() {
    System.out.println("Different shapes");
  }

  void area(int side1, int side2) {
    System.out.println("area of the square is " + (side1 * side2));
  }
}

class Rectangle extends Shapes {
  void display() {
    System.out.println("Rectangle");
  }

  void area(int len, int bre) {
    System.out.println("area of the rectangle is " + (len * bre));
  }
}

class Triangle extends Shapes {
  void display() {
    System.out.println("Triangle");
  }

  void area(int base, int height) {
    System.out.println("area of the triangle is " + (0.5 * base * height));
  }
}

class MethodOverriding {
  public static void main(String args[]) {
    Shapes s = new Shapes();
    // Shapes r=new Rectangle();
    // Shapes t=new Triangle();
    Rectangle r = new Rectangle();
    Triangle t = new Triangle();
    s.display();
    s.area(15, 15);
    r.display();
    r.area(19, 10);
    t.display();
    t.area(20, 5);

  }
}