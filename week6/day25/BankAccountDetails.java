/*Create a class called "BankAccountDetails" with instance variables for storing the account holder's name and account balance. Implement a method named initializeAccount that takes arguments for each variable and initializes the object. Implement another method named displayAccountDetails to display the account holder's name and balance.*/
class BankAccountDetails {
  String name;
  float balance;

  public void initializeAccount(String n, float b) {
    name = n;
    balance = b;
  }

  public void displayAccount() {
    System.out.println("name of the account holder is " + name);
    System.out.println("balance amount " + balance);
  }

  public static void main(String args[]) {
    BankAccountDetails holder1 = new BankAccountDetails();
    BankAccountDetails holder2 = new BankAccountDetails();
    holder1.initializeAccount("Priya", 30000);
    holder2.initializeAccount("Sowmya", 25000);
    holder1.displayAccount();
    holder2.displayAccount();
  }
}