class GrandParents
  {
    void surname()
    {
      System.out.println("surname will be same");
    }
  }
class Parents extends GrandParents
  {
    void features()
    {
       System.out.println("similar features like his parents");
    }
  }
class Children extends Parents
{
  void property()
  {
    System.out.println("Having same features like parents and grand parents");
  }
}
class MultiLevelInheritance
  {
    public static void main(String args[])
    {
      Children ch=new Children();
      ch.property();
      ch.features();
      ch.surname();
    }
  }