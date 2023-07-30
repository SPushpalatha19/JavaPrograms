interface Animal
  {
    public void eat();
    public void run();
  }
interface Dog
  {
    public void eat();
    public void bark();
  }
class BabyDog implements Animal,Dog{
  public void eat()
  {
    System.out.println("eating");
  }
public void run()
  {
    System.out.println("running");
  }
  public void bark()
  {
    System.out.println("barking");
  }
}
class MultipleInheritance
  {
    public static void main(String args[])
    {
      Animal bd1=new BabyDog();
      Dog bd2=new BabyDog();
      bd1.eat();
      bd1.run();
      bd2.eat();
      bd2.bark();
    }
  }