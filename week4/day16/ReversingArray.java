import java.util.Scanner;
class ReversingArray
  {
    public static void reverse(int a[],int size)
    {
     System.out.println("reverse printing of an array");
      for(int i=size-1;i>=0;i--)
        {
          System.out.println(a[i]);
        }
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
      reverse(a,size);
    }
  }