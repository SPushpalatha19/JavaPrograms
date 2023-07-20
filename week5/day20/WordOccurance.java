import java.util.Scanner;
class WordOccurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      System.out.println("enter the word to find the number of occurances");
      String s1=sc.nextLine();
      int count=0;
      String s[]=str.split(" ");
      for(int i=0;i<s.length;i++)
        {
          if(s[i].equals(s1))
          {
            count++;
          }
        }
      if(count>0)
      {
        System.out.println(s1+" is occured for "+count+" times "+"in the given string");
      }
      else
      {
        System.out.println(s1+" is not found in the given string");
      }   
    }
  }