import java.util.Scanner;
class PerfectNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to check whether it is a perfect number of not");
      int n=sc.nextInt();
      int temp=n;
      int sum=0;
     for(int i=1;i<n;i++)
       {
         if(n%i==0)
         {
          sum=sum+i;
         }
       }
      if(temp==sum)
      {
        System.out.println("Given number is a perfect number");
      }
      else
      {
        System.out.println("Given number is not a perfect number");
      }
    }
  }