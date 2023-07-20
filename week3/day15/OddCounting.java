import java.util.Scanner;
class OddCounting
  {
    public static void countingOdd(int a[])
    {
      int count=0;
      for(int i=1;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            count++;
          }
        }
      System.out.println("the no.of odd numbers are "+count);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("enter the array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      countingOdd(a);
    }
  }