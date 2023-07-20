//display the employee details by initializing the object using methods and company name as a static variable
class Employee
  {
    String name;
    int id;
static String company_name="Bitlabs";
    public void display()
    {
      System.out.println(name+" "+id+" "+company_name);
    }
    public void setDetails(String n,int i)
    {
      name=n;
      id=i;
    }
    public static void main(String args[])
    {
      Employee emp1=new Employee();
      Employee emp2=new Employee();
      emp1.setDetails("Pushpa",106);
      emp2.setDetails("latha",100);
      emp1.display();
      emp2.display();
    }
  }