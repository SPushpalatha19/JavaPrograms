/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a constructor that initializes these variables and display the car's details.*/
class Car
  {
    String model;
    int year;
    public static void main(String args[])
    {
     Car car1=new Car();
      Car car2=new Car();
      Car car3=new Car();
      car1.model="Maruthi";
      car1.year=2000;
      car2.model="BMW";
      car2.year=2002;
      car3.model="Audi";
      car3.year=2005;
      car1.display();
      car2.display();
      car3.display();
    }
    public void display()
    {
      System.out.println("model is "+model);
      System.out.println("year is "+year);
    }
  }