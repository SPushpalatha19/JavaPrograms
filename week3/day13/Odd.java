import java.util.Scanner;
class Odd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter start point");
      int start=sc.nextInt();
      System.out.println("Enter end point");
      int end=sc.nextInt();
      for(int i=start;i<=end;i++)
        {
          if(i%2!=0)
          {
            System.out.println(i);
          }
        }
    }
  }