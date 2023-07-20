import java.util.Scanner;
class Factors
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number for finding the factors");
      int n=sc.nextInt();
      System.out.println("Factors of "+ n + " are");
      int i=1;
      while(i<=n)
        {
          if(n%i==0)
          {
            System.out.println(i);
          }
          i++;
        }
    }
  }