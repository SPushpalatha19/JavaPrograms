/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a method named setStudentDetails that takes arguments for each variable and initializes the object. Display the student's details using a separate method.*/
class Student
  {
    String sname;
    int rno;
    char grade;
    public void setStudentDetails(String n,int r,char g)
    {
      sname=n;
      rno=r;
      grade=g;
    }
    public void display()
    {
      System.out.println("Name of the student is "+sname);
      System.out.println("student rollno is "+rno);
      System.out.println("Student Grade "+grade);
    }
    public static void main(String args[])
    {
      Student student1=new Student();
      Student student2=new Student();
      Student student3=new Student();
      student1.setStudentDetails("Ravi",1,'A');
      student2.setStudentDetails("Sravya",2,'A');
      student3.setStudentDetails("Lalitha",3,'B');
      student1.display();
      student2.display();
      student3.display();
    }
    
  }