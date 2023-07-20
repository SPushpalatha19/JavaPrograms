/*Create a class BankAccount with methods deposit and withdraw. Implement method overloading to handle different variations of deposit and withdraw methods:

deposit(amount): Deposits the given amount.
deposit(amount, description): Deposits the given amount with a provided description.
withdraw(amount): Withdraws the given amount.
withdraw(amount, description): Withdraws the given amount with a provided description.*/
class BankAccount {
  double initial_amount = 10000;

  void display() {
    System.out.println("current balnce in the account is " + initial_amount);
  }

  void deposit(double amount) {
    System.out.println("amount to deposit: " + amount);
    initial_amount = initial_amount + amount;
    System.out.println("after depositing account balance is " + initial_amount);
  }

  void deposit(double amount, String message) {
    System.out.println("amount to deposit " + amount);
    initial_amount = initial_amount + amount;
    System.out.println(message);
    System.out.println("after depositing account balance is " + initial_amount);
  }

  void withDraw(double amount) {
    System.out.println("amount to withdraw" + amount);
    if (amount < initial_amount) {
      initial_amount = initial_amount - amount;
      System.out.println("after withdraw account balance is " + initial_amount);
    } else {
      System.out.println("enter sufficient balnace");
    }
  }

  void withDraw(double amount, String descryption) {
    System.out.println("amount to withdraw " + amount);
    if (amount < initial_amount) {
      initial_amount = initial_amount - amount;
      System.out.println(descryption);
      System.out.println("after withdraw account balance is " + initial_amount);
    } else {
      System.out.println("enter sufficient balnace");
    }
  }
}

class Program6 {
  public static void main(String args[]) {
    BankAccount ac = new BankAccount();
    ac.display();
    // ac.deposit(1000);
    // ac.withDraw(10000);
    ac.deposit(1000, "deposit successful");
    ac.withDraw(1000, "withdraw successful");
  }
}
