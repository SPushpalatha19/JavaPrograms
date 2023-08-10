/*You are tasked with developing a banking solution that allows customers to create accounts, deposit and withdraw money, check their balance, and view their account information. 
As a software developer, your task is to create a program that can perform these operations using object-oriented programming concepts.
Task: Write a Java program that implements a Bank class and an Account class. The Bank class should contain methods for creating new accounts, depositing and withdrawing money, and checking daily withdrawal limits. 
The Account class should store information about individual customer accounts, such as the account number, account holder name, and current balance.

Instructions:
Create an Account class with the following instance variables:
1. accountNumber (String)
2. accountHolderName (String)
3. balance (double)
Create a Bank class that contains an Object Array of Account objects, which will be used to store the account information.
Add a method called createAccount() to the Bank class that takes the account holder name and initial balance as parameters and creates a new Account object with a unique account number.
Add a method called deposit() to the Account class that takes an amount parameter and adds it to the account balance.
Add a method called withdraw() to the Account class that takes an amount parameter and subtracts it from the account balance. The method should also check if the withdrawal amount exceeds the daily withdrawal limit, 
which should be set to a default value of $500.

Add a method called checkBalance() to the Account class that returns the current balance of the account.
Add a method called displayInfo() to the Account class that displays the account number, account holder name, and current balance of the account.
In the main method of the program, prompt the user to select an operation:
1 to create a new account
2 to deposit money
3 to withdraw money
4 to check the balance
5 to display account information
6 to exit the program
Based on the user's selection, call the appropriate method in the Bank or Account class.

Repeat steps 6 until the user chooses to exit the program.*/
import java.util.Scanner;
class Bank
  {
    public void createAccount()
    {
      
    }
  }
class Account
  {
    
    Scanner sc=new Scanner(System.in);
     public void deposit()
    {
      System.out.println("enter amount to deposit");
    }
    public void withdraw()
    {
      
    }
    public void checkBalance()
    {
      
    }
    public void displayInfo()
    {
      
    }
  }
class Program5 implements Bank,Account{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    Bank bank[]=new Bank[];
    
  }
}
