import java.util.Scanner;
class StrongNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check whether it is a strong number or not");
      int n=sc.nextInt();
      int temp=n;
      int sum=0,fact;
      while(n>0)
        {
          int digit=n%10;
          fact=1;
          for(int i=1;i<=digit;i++)
            {
             fact=fact*i;
            }
          sum=sum+fact;
          n=n/10;
        }
      if(temp==sum)
      {
        System.out.println("Given number is a strong number");
      }
      else
      {
       System.out.println("Given number is not a strong number");
      }
    }
  }