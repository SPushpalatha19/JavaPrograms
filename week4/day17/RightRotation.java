import java.util.Scanner;
class RightRotation
  {
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
      System.out.println("before right shifting");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
      rightRotation(a,size);
    }
    public static void rightRotation(int a[],int size)
    {
      int temp=a[size-1];
      for(int i=size-1;i>0;i--)
        {
          a[i]=a[i-1];
        }
      a[0]=temp;
      System.out.println("after right shifting to 1 position");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
  }