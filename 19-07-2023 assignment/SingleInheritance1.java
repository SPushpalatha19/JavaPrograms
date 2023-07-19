/*Create a superclass called "Animal" with the following attributes:
String name
int age
String breed*/
/*class Animal
  {
    void features()
    {
    String name="Oscar";
    int age=50;
      String breed="pug";
      System.out.println(name+" "+age+" "+breed);
    }
  }
class dog extends Animal
  {
    void display()
    {
      System.out.println("describing the dog");
    }
  }
class SingleInheritance1
  {
    public static void main(String args[])
    {
      dog d=new dog();
      d.display();
      d.features();
    }
  }*/
class Animal
  {
    String name;
    int age;
    String breed;
  }
class dog extends Animal
  {
    void show()
    {
    System.out.println(name+" "+age+" "+breed);
    }
  }
class SingleInheritance1
  {
    public static void main(String args[])
    {
      dog d=new dog();
      d.name="Oscar";
      d.age=9;
      d.breed="pug";
      d.show();
    }
  }
  
      
    
  