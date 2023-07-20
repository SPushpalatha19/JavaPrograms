//displaying different messages using method overloading.
class Main
  {
    void display()
    {
      System.out.println("welcome");
    }
    void display(int rollno,String name)
    {
      System.out.println(rollno+" "+name);
    }
    void display(String name,int age)
    {
      System.out.println(name+" "+age);
    }
    void display(String company,float salary)
    {
      System.out.println(company+" "+salary);
    }
    void display(String address)
    {
      System.out.println(address);
    }
  }
class Messages
  {
    public static void main(String args[])
    {
      Main m=new Main();
      m.display();
      m.display(106,"pushpa");
      m.display("latha",22);
      m.display("bitlabs",25500);
      m.display("vijayawada");
    }
  }

    
  