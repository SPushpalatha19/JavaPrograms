import java.util.Scanner;
class Constructor
  {
    String name;
    String address;
    Constructor(String n,String a)
    {
      name=n;
      address=a;
    }
    public void display()
    {
      System.out.println(name+" "+address);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name");
      System.out.println("enter address");
      Constructor con1=new Constructor(sc.nextLine(),sc.nextLine());
      System.out.println("enter name");
      System.out.println("enter address");
      Constructor con2=new Constructor(sc.nextLine(),sc.nextLine());
      System.out.println("enter name");
      System.out.println("enter address");
      Constructor con3=new Constructor(sc.nextLine(),sc.nextLine());
      System.out.println("enter name");
      System.out.println("enter address");
      Constructor con4=new Constructor(sc.nextLine(),sc.nextLine());
      con1.display();
      con2.display();
      con3.display();
      con4.display();
    }
  }