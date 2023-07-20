import java.util.Scanner;
class StudentDetails1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the student details");
      System.out.println("Enter student name");
      String name=sc.nextLine();
      System.out.println("Enter student roll no");
      int rollno=sc.nextInt();
      System.out.println("Enter student grade");
      char grade=sc.next().charAt(0);
      System.out.println("Enter student percentage");
      double percentage=sc.nextDouble();
      System.out.println("Enter student mobile no");
      long mobileno=sc.nextLong();
      System.out.println("Enter student marital status");
      boolean marital_status=sc.nextBoolean();
      System.out.println("Student name is "+name);
      System.out.println("Student roll no is "+rollno);
      System.out.println("Student grade is "+grade);
      System.out.println("Student percentage is "+percentage);
      System.out.println("Student mobile no is "+mobileno);
      System.out.println("Student marital_status is "+marital_status);
      
    }
  }