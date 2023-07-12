import java.util.Scanner;
class MaxWord
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      int max=s[0].length();
      String word="";
      for(int i=0;i<s.length;i++)
        {
         if(max<s[i].length())
         {
           max=s[i].length();
           word=s[i];
         }
        }
      System.out.println("largest word in the given sentence is "+word);
    }
  }