//checking vote eligiblity
import java.util.Scanner;
class IfElse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the age");
      int age=sc.nextInt();
      if(age>=18)
      {
        System.out.println("eligible for vote");
      }
      else{
        System.out.println("not eligible for vote");
      }
    }
  }