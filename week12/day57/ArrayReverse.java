//Write a java program to reverse the array elements.
import java.util.Scanner;
class ArrayReverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("array elements in reverse order");
      for(int i=arr.length-1;i>=0;i--)
        {
          System.out.println(arr[i]);
        }
    }
  }