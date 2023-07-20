/*Create a class called "CarDetails" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
class CarDetails {
  String car_name;
  String model;
  int year;

  public void setCarDetails(String n, String m, int y) {
    car_name = n;
    model = m;
    year = y;
  }

  public void displayCarDetails() {
    System.out.println("car name is " + car_name);
    System.out.println("model is " + model);
    System.out.println("making year is " + year);
  }

  public static void main(String args[]) {
    CarDetails c1 = new CarDetails();
    CarDetails c2 = new CarDetails();
    CarDetails c3 = new CarDetails();
    c1.setCarDetails("BMW", "abc20", 2022);
    c2.setCarDetails("Audi", "xyz22", 2020);
    c3.setCarDetails("Maruthi", "jkl90", 2010);
    c1.displayCarDetails();
    c2.displayCarDetails();
    c3.displayCarDetails();
  }
}