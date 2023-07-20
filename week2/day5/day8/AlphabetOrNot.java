import java.util.Scanner;
class AlphabetOrNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
      if(((ch<='Z')&&(ch>='A'))||((ch<='z')&&(ch>='a')))
      {
        System.out.println("Given character is a alphabet");
      }
      else
      {
        System.out.println("Given character is not alphabet");
      }
    }
  }