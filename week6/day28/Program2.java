/*Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:

Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.*/
import java.util.Scanner;
class StringHelper
  {
    void concatenate(String s1,String s2)
    {
      System.out.println("New String is "+s1.concat(s2));
    }
    void concatenate(String s1,String s2,String s3)
    {
      String s=s1.concat(s2);
      System.out.println("New String is "+s.concat(s3));
    }
    void concatenate()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of strings to concatenate");
      int count=sc.nextInt();
      String str[]=new String[count];
      System.out.println("enter list of strings");
      for(int i=0;i<count;i++)
        {
          str[i]=sc.next();
        }
      System.out.println("concated string is ");
      //String result="";
      for(int i=0;i<count;i++)
        {
          //result=result+str[i];
          System.out.print(str[i]+" ");
        }
      //System.out.println(result);
    }
  }
class Program2
  {
    public static void main(String args[])
    {
      StringHelper sh=new StringHelper();
      sh.concatenate("pushpa"," latha");
      sh.concatenate("pushpa"," latha"," santati");
      sh.concatenate();
    }
  }