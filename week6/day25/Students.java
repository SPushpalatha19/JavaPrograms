/*Create a class called "Students" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Students
  {
    String s_name;
    int s_rollno;
    char s_grade;
    public Students(String name,int rollno,char grade)
    {
      s_name=name;
      s_rollno=rollno;
      s_grade=grade;
    }
    public void display()
    {
      System.out.println("Student name is "+s_name);
      System.out.println("Student rollno is "+s_rollno);
      System.out.println("Student grade is "+s_grade);
    }
    public static void main(String args[])
    {
      Students student1=new Students("vamsi",101,'B');
       Students student2=new Students("Srinu",102,'A');
       Students student3=new Students("Komali",103,'C');
      student1.display();
      student2.display();
      student3.display();
    }
  }