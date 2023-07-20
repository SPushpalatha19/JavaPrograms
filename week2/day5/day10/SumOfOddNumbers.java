import java.util.Scanner;
class SumOfOddNumbers
  {
    public static void main(String args[])
    {
      int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto where we have to calculate sum");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          if(i%2!=0)
          {
            sum=sum+i;
          }
        }
      System.out.println("sum of odd numbers upto "+ n +" is "+sum);
    }
  }