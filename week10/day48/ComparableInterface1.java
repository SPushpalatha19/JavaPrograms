import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;
class Student implements Comparable<Student>
  {
    int rno;
    String name;
    int age;
    Student(int rno,String name,int age)
    {
      this.rno=rno;
      this.name=name;
      this.age=age;
    }
  /* public int compareTo(Student s)
    {
      if(name==s.name)
      {
        return 0;
      }
     else if(name > s.name)
      return 1;
      else 
      {
        return -1;
      }
    }*/
    public int compareTo(Student s) 
    {
      return this.name.compareTo(s.name);
    }
    
    public String toString()
    {
    return (rno+" "+name+" "+age);
    }
  }
class ComparableInterface1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayList<Student> al=new ArrayList<Student>();
      System.out.println("enter how many student details you want to store");
      int length=sc.nextInt();
      for(int i=0;i<length;i++)
        {
      System.out.println("enter student"+(i+1)+" details");
          System.out.println("enter rollno");
          int rno=sc.nextInt();
          System.out.println("enter name");
          String name=sc.next();
          System.out.println("enter age");
          int age=sc.nextInt();
          Student student=new Student(rno,name,age);
          al.add(student);
        }
      Collections.sort(al);
      System.out.println("Sorting the student details based on their names");
      for(Student s:al)
        {
          System.out.println(s);
        }
    }
  }
  