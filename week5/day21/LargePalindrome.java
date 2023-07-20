import java.util.Scanner;
class LargePalindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the sentence");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      largePal(s);
    }
    public static void largePal(String s[])
    {
      int max;
      int pos=-1;
      for(int i=0;i<s.length;i++)
        {
           String temp=s[i];
          String rev="";
          for(int j=(s[i].length()-1);j>=0;j--)
            {
              rev=rev+temp.charAt(j);
            }
          if(temp.equals(rev))
          {
            max=temp.length();
          }
          if(max<temp.length())
          {
           max=temp.length();
            pos=i;
          }
        }
    System.out.println("largest palindrome is "+s[pos]);
  }
}