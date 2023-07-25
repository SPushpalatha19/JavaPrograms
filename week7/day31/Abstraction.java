/*Assignment 3: Animal Hierarchy
Create an abstract class called "Animal" with the following abstract methods:
speak(): Outputs the sound that the animal makes.
move(): Describes how the animal moves.
Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.
Write a program to:
Create instances of Dog, Cat, and Bird.
Display the sound and movement of each animal.*/
abstract class Animal {
  abstract void speak();

  abstract void move();
}

class Dog extends Animal {
  public void speak() {
    System.out.println("Dog is barking");
  }

  public void move() {
    System.out.println("Dog is running");
  }
}

class Cat extends Animal {
  public void speak() {
    System.out.println("cat sounds like meow");
  }

  public void move() {
    System.out.println("cat is running");
  }
}

class Bird extends Animal {
  public void speak() {
    System.out.println("birds makes different sounds");
  }

  public void move() {
    System.out.println("Birds are flying");
  }
}

class Abstraction {
  public static void main(String args[]) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    Bird bird = new Bird();
    dog.speak();
    dog.move();
    cat.speak();
    cat.move();
    bird.speak();
    bird.move();
  }
}