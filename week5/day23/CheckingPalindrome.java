import java.util.Scanner;
class CheckingPalindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to check whether it is a palindrome or not");
      int num=sc.nextInt();
      int rev=0,temp=num,remainder=0;
      while(num>0)
        {
          remainder=num%10;
          num=num/10;
          rev=(rev*10)+remainder;
        }
      //System.out.println(rev);
      if(rev==temp)
      {
        System.out.println("given number is a palindrome");
      }
      else
      {
        System.out.println("given number is not a palindrome");
      }
    }
  }