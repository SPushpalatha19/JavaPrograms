import java.util.Scanner;
class Factors
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number to print factors of that number");
      int num=sc.nextInt();
      System.out.println("factors are ");
      for(int i=1;i<=num;i++)
        {
          if(num%i==0)
          {
           System.out.println(i); 
          }
        }
    }
  }