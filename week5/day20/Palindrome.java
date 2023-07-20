import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      String rev="";
      for(int i=(str.length()-1);i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
      System.out.println("reverse of the given string is "+rev);
      if(str.equals(rev))
      {
        System.out.println("given string is a palindrome");
      }
      else{
        System.out.println("given string is not a palidrome");
      }
    }
  }