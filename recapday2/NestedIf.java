import java.util.Scanner;
class NestedIf
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the country");
      String country=sc.nextLine();
      if(country.equals("India"))
      {
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age>=18)
           {
          System.out.println("eligible for vote");
           }
        else
        {
          System.out.println("not eligible for vote");
        }
      }
      else
      {
        System.out.println("enter valid country name");
      }
    }
  }