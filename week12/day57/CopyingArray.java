//Write a java program to copy all elements from one array to another array.
import java.util.Scanner;
class CopyingArray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int arr1[]=new int[size];
      int arr2[]=new int[size];
      System.out.println("enter the elements into first array");
      for(int i=0;i<arr1.length;i++)
        {
          arr1[i]=sc.nextInt();
        }
      System.out.println("first array elements");
      for(int i=0;i<arr1.length;i++)
        {
          System.out.print(arr1[i]+" ");
        }
      for(int i=0;i<arr2.length;i++)
        {
          arr2[i]=arr1[i];
        }
      System.out.println();
      System.out.println("Second array elements are");
      for(int i=0;i<arr2.length;i++)
        {
          System.out.print(arr2[i]+" ");
        }
      
    }
  }