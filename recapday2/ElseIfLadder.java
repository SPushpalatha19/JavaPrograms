import java.util.Scanner;
class ElseIfLadder
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name");
      String name=sc.nextLine();
      //String name="karun";
      if(name.equals("pushpa"))
      {
        System.out.println("name is pushpa");
      }
      else if(name.equals("latha"))
      {
        System.out.println("name is latha");
      }
      else if(name.equals("Priya"))
      {
        System.out.println("name is priya");
      }
      else if(name.equals("Raju"))
      {
        System.out.println("name is raju");
      }
      else if(name.equals("karuna"))
      {
        System.out.println("name is karuna");
      }
      else
      {
        System.out.println("invalid name");
      }
  }
  }