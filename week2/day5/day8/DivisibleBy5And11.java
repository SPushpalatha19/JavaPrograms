import java.util.Scanner;
class DivisibleBy5And11
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int num=sc.nextInt();
      if((num%5==0)&&(num%11==0))
      {
        System.out.println("Given number is divisible by both 5 and 11");
      }
      else
      {
        System.out.println("Given number is not divisible by 5 and 11");
      }
    }
  }