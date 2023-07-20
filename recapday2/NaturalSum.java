import java.util.Scanner;
class NaturalSum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the range");
    int n=sc.nextInt();
      int sum=0;
      System.out.println("natural numbers are");
      for(int i=1;i<=n;i++)
        {
          System.out.println(i);
          sum=sum+i;
        }
      System.out.println("sum of these natural numbers is "+sum);
    }
  }