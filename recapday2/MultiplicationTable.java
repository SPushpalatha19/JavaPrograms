import java.util.Scanner;
class MultiplicationTable
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to calculate multipliction table");
      int n=sc.nextInt();
      for(int i=0;i<=20;i++)
        {
          System.out.println(n+" * "+i+" = "+ (n*i));
        }
    }
  }