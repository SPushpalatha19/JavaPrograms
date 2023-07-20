import java.util.Scanner;
class ArrayAverage
  {
    public static void average(int a[],int size)
    {
      int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
        }
      int avg=sum/size;
      System.out.println("average of the given array elements is "+avg);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      average(a,size);
    }
  }