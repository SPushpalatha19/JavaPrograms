/*Assignment 1: Create a Class with Encapsulation

Create a class named "Person" with private attributes: name, age, and email.
Provide public getter and setter methods for each attribute.
Write a displayInfo() method within the class to display all the details of the person.
In the main method, create an object of the class and set values for the attributes using setter methods. Then, call the displayInfo() method to show the details of the person.*/
class Person {
  private String name;
  private int age;
  private String email;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void displayInfo() {
    System.out.println(getName());
    System.out.println(getAge());
    System.out.println(getEmail());
  }
}

class DataEncap1 {
  public static void main(String args[]) {
    Person person = new Person();
    person.setName("Harry");
    person.setAge(35);
    person.setEmail("harry2134@gmail.com");
    person.displayInfo();
  }
}