import java.util.Scanner;
class Example5
  {
    public String sentence(String str,String str1)
    {
      String s=str.concat(str1);
      return s;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Example5 e=new Example5();
      System.out.println("enter the first string");
      String str=sc.nextLine();
      System.out.println("enter the second string");
      String str1=sc.nextLine();
      String result=e.sentence(str,str1);
      System.out.println(result);
    }
  }