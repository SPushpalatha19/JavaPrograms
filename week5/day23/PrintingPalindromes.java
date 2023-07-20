import java.util.Scanner;
class PrintingPalindromes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the range upto where we have to print the palindrome numbers");
      System.out.println("enter starting point");
      int start=sc.nextInt();
      System.out.println("enter ending point");
      int end=sc.nextInt();
      for(int i=start;i<=end;i++)
        {
          int temp=i;
          int digit=0,rev=0;
          while(temp>0)
            {
              digit=temp%10;
              temp=temp/10;
              rev=(rev*10)+digit;
            }
          if(rev==i)
          {
            System.out.println(i);
          }
          else
          {
            continue;
          }
        }
    }
  }