///write a java program to remove the duplicate characters in a string.
import java.util.Scanner;
class Program
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.next();
    char ch[]=str.toCharArray();
boolean b[]=new boolean[ch.length];
for(int i=0;i<b.length;i++)
  {
    b[i]=false;
  }
for(int i=0;i<ch.length;i++)
  {
    if(b[i]==true)
      continue;
    for(int j=i+1;j<ch.length;j++)
      {
        if(ch[i]==ch[j])
        {
          b[j]=true;
        }
      }
  }
for(int i=0;i<ch.length;i++)
  {
    if(b[i]==false)
    {
      System.out.print(ch[i]);
    }
  }
}
  }
