import java.util.Scanner;
class Character
  {
    public static void main(String args [])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      int alpha_count=0,digit_count=0,spe_count=0;
      for(int i=0;i<str.length();i++)//i=0//i=1//i=2//i=3//i=4//i=5
        {
          if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
            alpha_count++;//1//2//3//4//5
          }
          else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
          {
            digit_count++;
          }
          else
          {
            spe_count++;
          }
        }
      System.out.println("number of characters in the given string are "+alpha_count);
      System.out.println("number of digits in the given string are "+digit_count);
      System.out.println("number of special characters in the given string are "+spe_count);
    } 

        }
  