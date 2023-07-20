class Humans {
  void sleep() {
    System.out.println("all humans can sleep");
  }

  void eat() {
    System.out.println("all humans can eat");
  }

  void walk() {
    System.out.println("all humans can walk");
  }
}

class Person1 extends Humans {
  void person1() {
    System.out.println("person1 name is ravi");
  }
}

class Person2 extends Humans {
  void person2() {
    System.out.println("person2 name is raju");
  }
}

class Person3 extends Humans {
  void person3() {
    System.out.println("person3 name is priya");
  }
}

class Hierarchical {
  public static void main(String args[]) {
    Person1 p1 = new Person1();
    Person2 p2 = new Person2();
    Person3 p3 = new Person3();
    p1.sleep();
    p1.eat();
    p1.walk();
    p1.person1();
    /*
     * p2.sleep();
     * p2.eat();
     * p2.walk();
     */
    p2.person2();
    /*
     * p3.sleep();
     * p3.eat();
     * p3.walk();
     */
    p3.person3();
  }
}