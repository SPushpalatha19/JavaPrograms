/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting."*/
class Vehicle
  {
    void startEngine()
    {
      System.out.println("Engine Starting");
    }
  }
class Car extends Vehicle{
  void startEngine()
  {
    System.out.println("Car engine starting");
  }
}
class MotorCycle extends Vehicle
  {
    void startEngine()
    {
      System.out.println("Motorcycle engine starting");
    }
  }
class Program5
  {
    public static void main(String args[])
    {
      Vehicle v=new Vehicle();
      Vehicle car=new Car();
      Vehicle mc=new MotorCycle();
      v.startEngine();
      car.startEngine();
      mc.startEngine();
    }
  }