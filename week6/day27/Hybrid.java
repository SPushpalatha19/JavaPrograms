class GrandFather
  {
    void features()
    {
      System.out.println("Grande father");
    }
  }
class Father extends GrandFather{
  void attitude()
  {
    System.out.println("same as his father");
  }
}
class Son extends Father{
  void son()
  {
    System.out.println("son is like his father");
  }
}
class Daughter extends Father{
  void daughter()
  {
    System.out.println("daughter is like her father");
  }
}
class Hybrid
  {
    public static void main(String args[])
    {
      Son s=new Son();
      Daughter d=new Daughter();
      s.son();
      s.attitude();
      d.daughter();
      d.attitude();
    }
  }