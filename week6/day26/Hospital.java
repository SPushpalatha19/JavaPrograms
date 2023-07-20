//displaying patient details with automatic increment of id's by using static variable and constructor
import java.util.Scanner;
class Hospital
  {
   static int id=1;
    String name;
    String disease;
    public Hospital(String n,String d)
    {
    id++; 
      name=n;
      disease=d;
    }
    public void display()
    {
      System.out.println(id+" "+name+" "+disease);
    }
    /*public void setDetails(String n,String d)
    {
      name=n;
      disease=d;
    }*/
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Hospital hospital[]=new Hospital[2];
      for(int i=0;i<hospital.length;i++)
        {
          //hospital[i]=new Hospital();
          System.out.println("enter patient"+(i+1)+"details");
          System.out.println("enter name");
          String pname=sc.nextLine();
          System.out.println("enter disease");
          String pdisease=sc.nextLine();
          //hospital[i].setDetails(pname,pdisease);
          hospital[i]=new Hospital(pname,pdisease);
        }
      for(int i=0;i<hospital.length;i++)
        {
          hospital[i].display();
        }
           }
    
  }