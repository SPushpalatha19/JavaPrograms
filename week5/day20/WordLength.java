import java.util.Scanner;
class WordLength
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      for(int i=0;i<s.length;i++)
        {
          System.out.println("length of "+s[i]+" is "+s[i].length());
        }
    }
  }