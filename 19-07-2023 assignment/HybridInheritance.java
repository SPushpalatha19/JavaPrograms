/*Create a superclass called "Person" with the following attributes:
String name
int age
double salary
String major
double gpa
String company*/
class Person
  {
  String name;
  int age;
  double salary;
  double gpa;
  String company;
  
  }
class Student extends Person{
  void display(String n,int i,double g)
  {
    System.out.println(n+" "+i+" "+g);
  }
}
class Child extends Student{
  void display(String n,int i)
  {
    System.out.println(n+" "+i);
  }
}
class Employee extends Person{
  void display(String n,int i,double s,String c)
  {
    System.out.println(n+" "+i+" "+s+" "+c);
  }
} 
class HybridInheritance
  {
    public static void main(String args[])
    {
      Student s=new Student();
      Child c=new Child();
      Employee e=new Employee();
      s.display("pushpa",22,8.8);
      c.display("latha",10);
      e.display("Priya",40,25500,"Bitlabs");
    }
  }
