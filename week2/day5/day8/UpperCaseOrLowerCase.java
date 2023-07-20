import java.util.Scanner;
class UpperCaseOrLowerCase
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
       if((ch<='z')&&(ch>='a'))
       {
         System.out.println("Given character is a lowercase character");
       }
       else if((ch<='Z')&&(ch>='A'))
       {
         System.out.println("Given character is a uppercase character");
       }
      else 
       {
        System.out.println("Given character is not a alphabet");
       }
   }
 }