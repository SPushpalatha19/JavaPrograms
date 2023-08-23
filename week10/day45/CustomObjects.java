/*Set of Custom Objects:
Create a class called Person with attributes such as name and age.
Create a HashSet of Person objects and add several Person objects to it.
Check if the set contains a specific Person based on their attributes (e.g., name and age).*/
import java.util.HashSet;
import java.util.Scanner;
class Person
  {
    String name;
    int age;
    Person(String name,int age)
    {
      this.name=name;
      this.age=age;
    }
  }
class CustomObjects
  {
    HashSet<Person> hs=new HashSet<Person>();
     Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
      CustomObjects co=new CustomObjects();
      co.addPerson();
      co.personChecking();
    }
    public void addPerson()
    {
      System.out.println("how many person details you want to store");
      int length=sc.nextInt();
      for(int i=0;i<length;i++)
        {
          System.out.println("enter person"+(i+1)+" details");
          System.out.println("enter name");
          String name=sc.next();
          System.out.println("enter age");
          int age=sc.nextInt();
          Person person=new Person(name,age);
          hs.add(person);
        }
    }
      public void personChecking()
        {
          System.out.println("enter the person name to check");
          String name=sc.next();
          System.out.println("enter the person age to check");
          int age=sc.nextInt();
          boolean result=false;
          for(Person value:hs)
            {
              String pname=value.name;
              if(value.age==age && name.equals(pname))
              {
                result=true;
                //System.out.println(result);
              }
            }
          if(result==true)
          {
            System.out.println("set contains "+name+" "+age);
          }
          else{
            System.out.println("set does not contains "+name+" "+age);
          }
        }
    }
  