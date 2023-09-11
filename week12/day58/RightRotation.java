//write a java program to shift the array elements to the right position based on the user required times.
import java.util.Scanner;
class RightRotation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter number of positions to right shift");
      int count=sc.nextInt();
      System.out.println("Array elements before shifting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
      for(int i=1;i<=count;i++)
        {
          int temp=arr[size-1];
          for(int j=size-1;j>0;j--)
            {
              arr[j]=arr[j-1];
            }
          arr[0]=temp;
        }
      System.out.println("Array elements after shifting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
    }
  }