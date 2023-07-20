/*String Validation: Password Strength Checker Write a program that takes a string as input and checks its strength as a password. The password should meet the following criteria:

At least 8 characters long
Contains a combination of uppercase and lowercase letters
Contains at least one digit
Contains at least one special character (e.g., @, #, $, etc.) Print "Strong" if the password meets all the criteria, otherwise print "Weak".*/
import java.util.Scanner;
class Password
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the password");
      String pass=sc.nextLine();
      int ucount=0,lcount=0,dcount=0,scount=0;
      if(pass.length()>=8)
      {
        for(int i=0;i<pass.length();i++)
          {
            if(pass.charAt(i)>='a'&&pass.charAt(i)<='z')
            {
              lcount++;
            }
            else if(pass.charAt(i)>='A'&& pass.charAt(i)<='Z')
            {
              ucount++;
            }
            else if(pass.charAt(i)>='0'&& pass.charAt(i)<='9')
            {
              dcount++;
            }
            else
            {
              scount++;
            }
          } 
      }
        else
      {
        System.out.println("password must contains 8 characters");
      }
        if(lcount>0&&ucount>0&&dcount>0&&scount>0)
        {
          System.out.println("strong password");
        }
        else
        {
          System.out.println("weak password");
        }
    }
  }