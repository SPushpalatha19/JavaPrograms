import java.util.Scanner;
class OddOrEven
  {
    public static void evenOrOdd(int num)
    {
      if(num%2==0)
      {
        System.out.println(" Given number is an even number");
      }
      else
      {
        System.out.println("Given number is an odd number");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      evenOrOdd(num);
    }
  }