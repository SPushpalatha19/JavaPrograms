import java.util.Scanner;
class Occurance
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      char ch=sc.next().charAt(0);
      int count=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==ch)
          {
            count++;
          }
        }
      if(count>0)
      {
        System.out.println(ch+" is occured for "+count+" times");
      }
      else
      {
        System.out.println(ch+" is not in the given string");
      }
    }
  }