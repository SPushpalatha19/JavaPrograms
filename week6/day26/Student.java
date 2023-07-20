//display the student details by initializing the object using instance variables and college name as a static variable
class Student
  {
    String name;
    static String clg_name="kbn";
    int roll_no;
    public static void main(String args[])
    {
      Student s1=new Student();
      s1.name="Lakshmi";
      s1.roll_no=35;
       Student s2=new Student();
      s2.name="kumari";
      s2.roll_no=90;
      s1.display();
      s2.display();
    }
    public void display()
    {
      System.out.println(name+" "+roll_no+" "+clg_name);
    }
  }