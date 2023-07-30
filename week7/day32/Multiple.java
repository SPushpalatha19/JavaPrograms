interface Human
{
  public void insert(String name,String address);
  public void display();
  public void print();
}
interface Person
  {
    public void insert(String name,String address);
    public void print();
  }
class Student implements Human,Person{
  String name;
  String address;
  public void insert(String name,String address)
  {
    this.name=name;
    this.address=address;
  }
  public void display()
  {
    System.out.println("displaying all details");
  }
  public void print()
  {
    System.out.println(name+" "+address);
  }
}
class Multiple
  {
    public static void main(String args[])
    {
      Human human=new Student();
      Person person=new Student();
      human.insert("pushpa","vij");
      human.display();
      human.print();
   //  person.display();
      person.insert("latha","guntur");
     person.print();
    }
  }