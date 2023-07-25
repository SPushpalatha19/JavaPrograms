/*Assignment 2: Bank Account Hierarchy
Create an abstract class called "BankAccount" that has the following abstract methods:
deposit(amount): Adds the given amount to the account balance.
withdraw(amount): Deducts the given amount from the account balance.
get_balance(): Returns the current account balance.
Create concrete classes CheckingAccount and SavingsAccount that inherit from the abstract class "BankAccount." Implement the required methods for each class.
Write a program to:
Create instances of CheckingAccount and SavingsAccount.
Prompt the user to make deposits and withdrawals from each account.
Display the current balance of each account after each transaction.*/
abstract class BankAccount
  {
    float balance=10000.0f;
    abstract void deposit(float amount);
    abstract void withDraw(float amount);
    abstract void getBalance();
  }
class CheckingAccount extends BankAccount
  {
    public void deposit(float amount)
    {
      System.out.println("deposit amount is "+amount);
      balance=balance+amount;
      System.out.println("deposit successful");
      System.out.println("current balance is "+balance);
    }
    public void withDraw(float amount)
    {
      System.out.println("withdraw amount is "+amount);
      if(amount<balance)
      {
        balance=balance-amount;
        System.out.println("withdraw successful");
        System.out.println("current balance is "+balance);
      }
      else{
        System.out.println("enter sufficient balance");
      }
    }
    public void getBalance()
    {
      System.out.println("current balance in the account is "+balance);
    }
  }
class SavingsAccount extends BankAccount{
  public void deposit(float amount)
  {
    System.out.println("deposit amount is "+amount);
      balance=balance+amount;
      System.out.println("deposit successful");
      System.out.println("current balance is "+balance);
    }
    public void withDraw(float amount)
    {
      System.out.println("withdraw amount is "+amount);
      if(amount<balance)
      {
        balance=balance-amount;
        System.out.println("withdraw successful");
        System.out.println("current balance is "+balance);
      }
      else{
        System.out.println("enter sufficient balance");
      }
    }
    public void getBalance()
    {
      System.out.println("current balance in the account is "+balance);
    }
  }
class Transactions
  {
    public static void main(String args[])
    {
      CheckingAccount ca=new CheckingAccount();
      SavingsAccount sa=new SavingsAccount();
      ca.deposit(1000.0f);
      ca.withDraw(500.0f);
      ca.getBalance();
     sa.deposit(1000);
      sa.withDraw(500);
      sa.getBalance();
    }
  }