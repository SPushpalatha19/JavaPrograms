/*Assignment 2: Animal Interface Create an interface called Animal with the following methods:
sound(): Abstract method that returns a String representing the sound the animal makes.
eat(String food): Abstract method that takes a String parameter food representing the food the animal eats.
Now, create classes Dog, Cat, and Duck, implementing the Animal interface. Write appropriate code for each animal's sound and eating habit*/
interface Animal
  {
    public String sound();
    public void eat(String food);
  }
class Dog implements Animal{
  String dog_sound;
  public Dog(String dog_sound)
  {
    this.dog_sound=dog_sound;
  }
  public String sound()
  {
    return dog_sound;
  }
  public void eat(String food)
  {
    System.out.println("dog eats "+food);
  }
}
class Cat implements Animal{
  String cat_sound;
  public Cat(String cat_sound)
  {
    this.cat_sound=cat_sound;
  }
  public String sound()
  {
    return cat_sound;
  }
  public void eat(String food)
  {
    System.out.println("cat drinks "+food);
  }
}
class Duck implements Animal{
  String duck_sound;
  public Duck(String duck_sound)
  {
    this.duck_sound=duck_sound;
  }
  public String sound()
  {
    return duck_sound;
  }
  public void eat(String food)
  {
    System.out.println("duck eats "+food);
  }
}
class Program2
  {
    public static void main(String args[])
    {
      Dog dog=new Dog("bow bow!");
      System.out.println("dog sounds like "+dog.sound());
      dog.eat("biscuits");
      Cat cat=new Cat("meow meow!");
      System.out.println("cat sounds like "+cat.sound());
      cat.eat("milk");
      Duck duck=new Duck("quack quack!");
      System.out.println("duck sounds like "+duck.sound());
      duck.eat("grains");
    }
  }