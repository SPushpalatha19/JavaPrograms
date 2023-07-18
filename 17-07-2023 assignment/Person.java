/*Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Person
  {
    String p_name;
    int p_age;
    String p_address;
    public static void main(String args[])
    {
      Person person1=new Person("James",20,"Sydney");
      Person person2=new Person("Ayan",10,"India");
      Person person3=new Person("Charlie",30,"USA");
      person1.display();
      person2.display();
      person3.display();
    }
    public Person(String name,int age,String address)
    {
      p_name=name;
      p_age=age;
      p_address=address;
    }
    public void display()
    {
      System.out.println("person name is "+p_name);
    System.out.println("person age is "+p_age);
System.out.println("person from "+p_address);    
    }
  }