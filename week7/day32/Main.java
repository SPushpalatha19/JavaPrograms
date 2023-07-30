import java.util.*;
class Student
{
private int rollno;
private String name;
private String address;
public void setRollno(int rollno){
this.rollno=rollno;
}
public int getRollno(){
return this.rollno;
}
public void setName(String name){
this.name=name;
}
public String getName(){
return this.name;
}
public void setAddress(String address){
this.address=address;
}
public String getAddress()
{
return this.address;
}
}

class StudentManager

  {

    Scanner sc=new Scanner(System.in);

    int size=sc.nextInt();

    Student student[]=new Student[size];

    public void createStudent()

    {

      for(int i=0;i<size;i++)

    {

      student[i]=new Student();

      System.out.println("enter rollno");

      int rno=sc.nextInt();

      student[i].setRollno(rno);

      System.out.println("enter name");

      String name=sc.next();

      student[i].setName(name);

      System.out.println("enter address");

      String address=sc.next();

      student[i].setAddress(address);


    }

    }

      public void display()

        {

        for(int i=0;i<size;i++)

          {

        System.out.println(student[i].getRollno()+" "+student[i].getName()+" "+student[i].getAddress());

        }

      }

    public void updateByRollno(int rollno){
      for(int i=0;i<size;i++)
          {
        if(rollno==student[i].getRollno())
        {
           student[i].setAddress("hyd");
          System.out.println("student is updated");
          display();
             }
          }
    }
    public void updateByName(String name)
    {
      for(int i=0;i<size;i++)
        {
          if(name.equals(student[i].getName()))
          {
            student[i].setAddress("vijayawada");
            System.out.println("student record is updated");
            display();
          }
        }
    }
    public void deleteByName(int rollno){
      int pos;
      for(int i=0;i<size;i++)
        {
          if(rollno==student[i].getRollno())
          {
            pos=i;
          }
        }
      for(int i=pos;i<size-1;i++)
        {
          student[i].setRollno()=student[i+1].setRollno();
          
        }
    }

  }

class Main

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      StudentManager st=new StudentManager();

      st.createStudent();

      System.out.println("All Student details are");

      st.display();

      System.out.println("enter the rollno that you want to update the student's address");

      int rollno=sc.nextInt();

      st.updateByRollno(rollno);


    }

  }