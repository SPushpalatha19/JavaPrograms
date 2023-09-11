//Write a JAVAprogram to count total number of words in a string.
import java.util.Scanner;
class WordsCount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      System.out.println("Total number of words in the given string:"+s.length);
    }
  }