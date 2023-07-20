import java.util.Scanner;
class SumOfNaturalNumbers
  {
    public static void main(String args[])
    {
      int sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto where we have to calculate sum"); 
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
         sum=sum+i; 
        }
      System.out.println("sum of "+ n +" natural numbers is "+sum);
    }
  }