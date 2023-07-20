import java.util.Scanner;
class CountingEven
  {
    public static void countingEven(int a[])
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2==0)
          {
            count++;
          }
        }
      System.out.println("The no.of even numbers in an array are "+count);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[10];
      System.out.println("enter the array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      countingEven(a);
    }
  }