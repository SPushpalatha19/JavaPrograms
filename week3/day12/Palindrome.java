import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check whether the number is palindrome or not");
      int n=sc.nextInt();
      int temp=n;
      int reverse=0,digit;
      while(n>0)
        {
          digit=n%10;
          reverse=(reverse*10)+digit;
          n=n/10;
        }
      if(temp==reverse)
      {
        System.out.println(temp +" is a palindrome");
      }
      else
      {
        System.out.println(temp +" is not a palindrome");
      }
    }
  }