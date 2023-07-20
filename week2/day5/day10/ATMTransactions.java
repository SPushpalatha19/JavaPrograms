import java.util.Scanner;
class ATMTransactions
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      double balance=15000,pin=1234,amount;
      System.out.println("ATM Transactions");
      System.out.println("1.Deposit \n 2.Withdrawl \n 3.Balance enquiry");
      System.out.println("Enter the option to perform that particular task");
      int var=sc.nextInt();
      System.out.println("enter the pin");
      int pin1=sc.nextInt();
      if(pin==pin1)
      {
      switch(var)
        {
          case 1:
            System.out.println("Enter the amount to deposit");
           amount=sc.nextDouble();
            balance=balance+amount;
            System.out.println("deposit successful");
            System.out.println("Balance in the account "+balance);
            break;
          case 2:
            System.out.println("enter the amount to withdraw");
            amount=sc.nextDouble();
            if(amount<=balance)
            {
              System.out.println("withdraw successful");
              balance=balance-amount;
              System.out.println("Balance in the account "+balance);
            }
            else
            {
              System.out.println("Please enter sufficient amount");
            }
            break;
          case 3:
            System.out.println("balance amount is "+balance);
            break;
          default:
            System.out.println("Please enter valid option");
            break;
        }
      }
      else
      {
        System.out.println("Please enter the valid pin");
      }
    }
  }