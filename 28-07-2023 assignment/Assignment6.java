
/*Assignment 6: Custom Exception in Banking Application Build a simple banking application in Java. Create a custom checked exception named InsufficientFundsException, which will be thrown when a user tries to withdraw an amount that exceeds their account balance. Implement classes for bank accounts, and provide methods for depositing and withdrawing money. Throw the InsufficientFundsException when a withdrawal amount is greater than the available balance. Handle this exception in an appropriate way and display a user-friendly error message.*/
import java.util.Scanner;

class InsufficientFundsException extends Exception {
  InsufficientFundsException(String message) {
    super(message);
  }
}

class Transactions {
  double balance;

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance = balance + amount;
    System.out.println("deposit successful");
    System.out.println("current balance is " + balance);
  }

  public void withDraw(double amount) throws InsufficientFundsException {
    if (amount >= balance) {
      throw new InsufficientFundsException("Insufficient balance");
    } else {
      balance = balance - amount;
      System.out.println("withdraw successful");
      System.out.println("current balance is " + balance);
    }
  }
}

class Assignment6 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Transactions trans = new Transactions();
    System.out.println("enter initial balance in the account");
    trans.setBalance(sc.nextDouble());
    System.out.println("enter amount to deposit");
    trans.deposit(sc.nextDouble());
    System.out.println("enter amount to withdraw");
    try {
      trans.withDraw(sc.nextDouble());
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Exception handled");
  }
}
