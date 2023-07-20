class Bird
  {
    void fly()
    {
      System.out.println("flying");
    }
  }
class Peacock extends Bird
  {
    void dance()
    {
      System.out.println("dancing");
    }
  }
class SingleInheritance
  {
    public static void main(String args[])
    {
      Peacock p=new Peacock();
      p.dance();
      p.fly();
    }
  }