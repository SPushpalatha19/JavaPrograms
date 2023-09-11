//Write a JAVAprogram to count total number of vowels and consonants in a string.
import java.util.Scanner;
class VowelConsonantCount
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      int vowel=0,consonant=0;
      for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')||(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'))
          {
            vowel++;
          }
          else
          {
            consonant++;
          }
        }
      System.out.println("Total vowels:"+vowel);
      System.out.println("Total consonants:"+consonant);
    }
  }