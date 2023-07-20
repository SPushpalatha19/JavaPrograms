import java.util.Scanner;
class EvenOddIndex
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    String s="";
    evenOdd(str,s);
  }
  public static void evenOdd(String str,String s)
  {
    for(int i=0;i<str.length();i++)
      {
        if(i%2==0)
        {
          s=s+str.charAt(i);
        }
      }
    for(int i=0;i<str.length();i++)
      {
        if(i%2!=0)
        {
          s=s+str.charAt(i);
        }
      }
    System.out.println(s);
  }
}