//Write a JAVAprogram to find total number of alphabets, digits or special character in a string.
import java.util.Scanner;
class CharacterType
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      int alphabet=0,digit=0,speChar=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='0'&&str.charAt(i)<='9')
          {
            digit++;
          }
          else if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
          {
            alphabet++;
          }
         else {
           speChar++;
         }
     }
      System.out.println("Total alphabets:"+alphabet);
      System.out.println("Total digits:"+digit);
      System.out.println("Total special characters:"+speChar);
    }
  }