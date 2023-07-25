//printing employee deatils using toString method.
class Employee
  {
    String name;
    int id;
    String company;
    String designation;
    float salary;
    long phno;
public String toString()
  {
  return id+" "+name+" "+company+" "+designation+" "+salary+" "+phno;
  }
    public static void main(String args[])
    {
    Employee emp=new Employee();
      emp.name="John";
      emp.id=106;
      emp.company="bitlabs";
      emp.designation="Technical Mentor";
      emp.salary=25000f;
      emp.phno=7898203457l;
      System.out.println(emp);
    }
  }
