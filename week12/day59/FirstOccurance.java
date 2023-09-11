//Write a JAVAprogram to find first occurrence of a character in a given string.
import java.util.Scanner;
class FirstOccurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      System.out.println("enter the character to find the occurance");
      char ch=sc.next().charAt(0);
      int pos=-1;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==ch)
          {
            pos=i;
            break;
          }
        }
      if(pos>=0)
      System.out.println("First occurance of "+ch+" is at "+pos+" index position");
      else
        System.out.println(ch+" is not found in the given string");
        }
  }