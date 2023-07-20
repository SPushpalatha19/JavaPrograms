import java.util.Scanner;
class Replace
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner (System.in);
   System.out.println("enter the string");
String str=sc.nextLine();
System.out.println("enter the string which one is to replace");
String ch=sc.nextLine();
System.out.println("enter the string to be replaced with ");
String ch1=sc.nextLine();
      String s=str.replaceAll(ch,ch1);
      System.out.println(s);
     /*String str1="";
      for(int i=0;i<str.length();i++)
        {
          if((str.charAt(i)).equals(ch))
          {
      str1=str.replaceAll(ch,ch1);
        }
        }
      System.out.println(str1);
     /* if(str.contains("[()]"))
      {
String str1=str.replaceAll(ch,ch1);
System.out.println(str1);
      }*/
      /*String str="bit(labs)";
      System.out.println(str.replaceAll("[()]",""));*/
  }
  }