import java.util.Scanner;
class ArraySum
  {
    public static void sum(int a[],int size)
    {
     int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("sum of all array elements is "+sum);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      sum(a,size);
    }
  }
