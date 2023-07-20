//print the numbers  from 1 to 50 only those are divisible by 3
import java.util.Scanner;
class DivisibleBy3
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto where we have to calculate the multiples");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          if(i%3==0)
          {
            System.out.println(i);
          }
        }
    }
  }