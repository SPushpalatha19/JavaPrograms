/*Assignment 2: Bank Account Class

Create a class named "BankAccount" with private attributes: accountNumber, accountHolderName, balance, and pin.
Implement getter and setter methods for all attributes.
Ensure that the balance attribute can only be accessed through getter and setter methods, not directly.
Add a method named deposit() that takes an amount as input and adds it to the account balance.
Add a method named withdraw() that takes an amount as input and deducts it from the account balance if sufficient funds are available.
Implement proper validation in the withdraw() method to prevent negative balances or overdraft.
In the main method, create an object of the class and demonstrate the deposit and withdrawal operations.*/
import java.util.Scanner;
class BankAccount
  {
    Scanner sc=new Scanner(System.in);
    private long accountNumber;
    private String acHolderName;
    private float balance;
    private int pin;
    float bal;
    public void setAccountNumber(long accountNumber)
    {
      this.accountNumber=accountNumber;
    }
    public long getAccountNumber()
    {
      return accountNumber;
    }
    public void setAcHolderName(String acHolderName)
    {
      this.acHolderName=acHolderName;
    }
    public String getAcHolderName()
    {
      return acHolderName;
    }
    public void setBalance(float balance)
    {
      this.balance=balance;
    }
    public float getBalance()
    {
      return balance;
    }
    public void setPin(int pin)
    {
      this.pin=pin;
    }
    public int getPin()
    {
      return pin;
    }
    public void displayDetails()
    {
      System.out.println("Account number is "+getAccountNumber());
      System.out.println("Pin number is "+getPin());
      System.out.println("Name of the account holder "+getAcHolderName());
      System.out.println("Initial balance is "+getBalance());
    }
    public void deposit()
    {
      System.out.println("enter amount to deposit");
      float amount=sc.nextFloat();
      bal=getBalance()+amount;
      System.out.println("deposit successful");
      System.out.println("current balance is "+bal);
      }
    public void withDraw()
    {
      System.out.println("enter amount to withdraw");
      float amount=sc.nextFloat();
      if(amount<bal)
      {
        bal=bal-amount;
        System.out.println("withdraw successful");
        System.out.println("current balance is "+bal);
      }
      else{
        System.out.println("enter sufficient amount to withdraw");
      }
    }
  }
class DataEncap3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      BankAccount ac=new BankAccount();
      System.out.println("enter the account number");
      ac.setAccountNumber(sc.nextLong());
      System.out.println("enter the account holder name");
      ac.setAcHolderName(sc.next());
      System.out.println("enter the pin number");
      ac.setPin(sc.nextInt());
      System.out.println("enter the initial balance in the account");
      ac.setBalance(sc.nextFloat());
      ac.displayDetails();
      ac.deposit();
      ac.withDraw();
    }
  }