import java.util.Scanner;
class LeftRotation
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
      System.out.println("enter the number for how many position we have to shift left");
      int n=sc.nextInt();
      for(int j=1;j<=n;j++)
        {
          int temp=a[0];
      for(int i=0;i<size-1;i++)
        {
          a[i]=a[i+1];
        }
         a[size-1]=temp;
        }
     // a[size-1]=temp;
      System.out.println("after performing left rotation");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    }
  }