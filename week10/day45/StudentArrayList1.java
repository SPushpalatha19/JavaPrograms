import java.util.*;
class Student{
  int rollno;
  String name;
  String address;
  long mobileno;
  Student(int rollno,String name,String address,long mobileno)
  {
    this.rollno=rollno;
    this.name=name;
    this.address=address;
    this.mobileno=mobileno;
  }
  public String toString()
  {
    return (rollno+" "+name+" "+address+" "+mobileno);
  }
}
class StudentArrayList1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> al=new ArrayList<Student>();
      System.out.println("enter how many students details want to store");
      int length=sc.nextInt();
      for(int i=0;i<length;i++)
        {
          System.out.println("enter student"+(i+1)+" details");
          System.out.println("enter rollno");
          int rno=sc.nextInt();
          System.out.println("enter name");
          String name=sc.next();
          System.out.println("enter address");
          String address=sc.next();
          System.out.println("enter mobileno");
          long mobile=sc.nextLong();
          Student student=new Student(rno,name,address,mobile);
          al.add(student);
        }
      System.out.println("All student details are");
      for(Student data:al)
        {
          System.out.println(data);
        }
    }
  }