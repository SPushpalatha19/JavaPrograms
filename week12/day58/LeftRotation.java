//write a java program to shift the array elements to the left position based on the user required times.
import java.util.Scanner;
class LeftRotation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter number of positions for shifting");
      int count=sc.nextInt();
      System.out.println("Array elements before shifting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
      for(int i=1;i<=count;i++)
        {
          int temp=arr[0];
          for(int j=0;j<size-1;j++)
            {
              arr[j]=arr[j+1];
            }
          arr[size-1]=temp;
        }
       System.out.println("Array elements after shifting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
    }
  }