/*Create a base class called Animal with a method make_sound that prints a generic sound made by an animal. Create two derived classes, Dog and Cat, that override the make_sound method to print "Woof" and "Meow" respectively.*/
class Animal
  {
    void makeSound()
    {
      System.out.println("Generic sound made by an animal");
    }
  }
class Dog extends Animal{
  void makeSound()
  {
    System.out.println(" dog sounds like woof");
  }
}
class Cat extends Animal{
  void makeSound()
  {
    System.out.println("cat sounds like Meow");
  }
}
class Program4
  {
    public static void main(String args[])
    {
      Animal a=new Animal();
      Animal dog=new Dog();
      Animal cat=new Cat();
      a.makeSound();
      dog.makeSound();
      cat.makeSound();
    }
  }