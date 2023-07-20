import java.util.Scanner;
class StudentDetails
  {
    public static void studentDetails(String name,int roll_no)
    {
      System.out.println("Student name is "+name);
      System.out.println("Student roll number is "+roll_no);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter student name");
      String sname=sc.next();
      System.out.println("Enter student roll number");
      int sno=sc.nextInt();
      studentDetails("Pushpa",106);
      studentDetails(sname,sno);
    }
  }