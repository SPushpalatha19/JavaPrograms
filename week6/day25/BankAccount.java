/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement methods to deposit and withdraw money from the account, and display the current balance.*/
import java.util.Scanner;
class BankAccount
  {
    String name;
    float balance_amount;
    //float deposit_amount;
    //float withdraw_amount;
    public static void main(String args[])
    {
      BankAccount ac=new BankAccount();
      ac.name="Pushpa latha";
      ac.balance_amount=25000f;
      ac.display();
      ac.deposit();
      ac.withdraw();
    }
    public void deposit()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount to deposit");
      float deposit_amount=sc.nextFloat();
      balance_amount=balance_amount+deposit_amount;
      System.out.println("after depositing the amount the balance amount is "+balance_amount);
    }
    public void withdraw()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount to withdrawl");
      float withdraw_amount=sc.nextFloat();
      if(withdraw_amount<balance_amount)
      {
        balance_amount=balance_amount-withdraw_amount;
        System.out.println("after withdraw the amount the balance amount is "+balance_amount);
      }
      else
      {
        System.out.println("enter the sufficient amount for withdraw");
      }
    }
    public void display()
    {
      System.out.println("name of the account holder is "+name);
      System.out.println("balance amount is "+balance_amount);
    }
  }