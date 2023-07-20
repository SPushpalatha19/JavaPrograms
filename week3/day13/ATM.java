import java.util.Scanner;
class ATM
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      do
        {
      System.out.println("*************ATM Transactions**************");
      System.out.println("1 for deposit"+"\n"+"2 for withdrawl"+"\n"+"3 for balance enquiry"+"\n"+"4 for exit");
      System.out.println("Enter the previous balance");
      double balance=sc.nextDouble();
          System.out.println("enter the amount");
         double amount=sc.nextDouble();
      System.out.println("enter the option");
      int option=sc.nextInt();
          switch(option)
            {
              case 1:
                balance=balance+amount;
                System.out.println("present balance "+balance);
                System.out.println("Deposit successful");
                break;
              case 2:
                if(amount<balance)
                {
                 balance=balance-amount;
                  System.out.println("present balance "+balance);
                  System.out.println("transaction successful");
                }
              else 
                {
                  System.out.println("Insufficient balance");
                }
                break;
              case 3:
                System.out.println("present balance "+balance);
                break;
              case 4:
                System.exit(0);
                break;
              default:
                System.out.println("Enter valid option");
                break;
            }
                  }while(true);           
    }
  }