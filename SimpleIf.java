//checking the number whether it is greater than 10
import java.util.Scanner;
class SimpleIf
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      if(num>10)
      {
        System.out.println("Given number is greater than 10");
      }
      System.out.println("It is out of the loop");
    }
  }