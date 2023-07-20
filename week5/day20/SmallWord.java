import java.util.Scanner;
class SmallWord
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      int min=s[0].length();
      String word="";
      for(int i=0;i<s.length;i++)
        {
          if(min>s[i].length())
          {
            min=s[i].length();
            word=s[i];
          }
        }
      System.out.println("smallest word in the given sentence is "+word);
    }
  }