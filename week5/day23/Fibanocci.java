import java.util.Scanner;
class Fibanocci
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number how many numbers we have to print the series");
      int n=sc.nextInt();
      int first=0,second=1;
      System.out.print(first+" ");
      System.out.print(second+" ");
      for(int i=1;i<n;i++)
        {
          int third=first+second;
          System.out.print(third+" ");
          first=second;
          second=third;
        }
    }
  }