//displaying ATM transactions after checking account number and pin number
import java.util.Scanner;
class NestedIf
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter account number");
      double acno=sc.nextDouble();
      System.out.println("enter pin");
      int pin=sc.nextInt();
      if(acno==12345678)
      {
        if(pin==4567)
        {
          System.out.println("*********ATM Transactions**********");
          System.out.println("balance checking");
          System.out.println("withdraw");
          System.out.println("deposit");
        }
      }
        else
        {
          System.out.println("enter valid card details");
        }
      }
    }
  