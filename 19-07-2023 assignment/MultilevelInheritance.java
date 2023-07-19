/*Create a class called "Vehicle" with the following attributes:

String make
String model
int numDoors
boolean isConvertible*/
class Vehicle
  {
    String make;
    void make()
    {
      make="BMW";
      System.out.println("Car name is "+make);
    }
  }
class Version extends Vehicle
  {
    String model;
    void model()
    {
      model="123AB";
      System.out.println("model "+model);
    }
  }
class Doors extends Version
     {
     int numDoors;
    void numberOfDoors()
     {
    numDoors=4;
    System.out.println(numDoors+" doors");
    }
  }
class Convertible extends Doors
{
  boolean isConvertible;
  void convertible()
  {
    isConvertible=true;
    System.out.println("isConvertible "+isConvertible);
  }
}
class MultilevelInheritance
  {
public static void main(String args[])
    {
      Convertible c=new Convertible();
      c.make();
      c.model();
      c.numberOfDoors();
      c.convertible();
    }
  }