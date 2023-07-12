/*Email Validation:
Write a program that takes an email address as input and validates whether it is a valid email format. The email should meet the following criteria:
It should contain an "@" and "." symbol.
It should end with ".com" or ".org".
Write a program that prompts the user to enter an email address and performs the validation. Print "Valid email" if the email address is valid, otherwise print "Invalid email".*/
import java.util.Scanner;
class Email
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the email address");
      String str=sc.nextLine();
      if(str.contains("@") && str.contains("."))
      {
        if(str.endsWith(".com")|| str.endsWith(".org"))
        {
          System.out.println("valid email");
        }
        else
        {
          System.out.println("mail id should be ends with either .com or .org");     
          System.out.println("invalid email");
        }
      }
      else
      {
        System.out.println("Invalid email");
      }
    }
  }