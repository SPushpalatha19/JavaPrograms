import java.util.Scanner;
class ReverseNumber
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
       int num=sc.nextInt();
      int temp=num;
      int digit=0;
      int reverse=0;
      while(num>0)
        {
          digit=num%10;
          reverse=(reverse*10)+digit;
          num=num/10;
        }
      //System.out.println(reverse);
      if(temp==reverse)
      {
        System.out.println("Given number is a palindrome");
      }
      else{
        System.out.println("Given number is not a palindrome");
      }
    }
  }