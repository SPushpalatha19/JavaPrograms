//checking the number whether it is positive or negative or zero
import java.util.Scanner;
class ElseIfLadder
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      if(num>0)
      {
        System.out.println(num+" is a positive number");
      }
      else if(num<0)
      {
        System.out.println(num+" is a negative number");
      }
      else
      {
        System.out.println("entered number is a zero");
      }
    }
  }