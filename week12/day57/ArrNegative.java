//Write a java program to count the total number of negative elements in an array.
import java.util.Scanner;
class ArrNegative
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
      System.out.println("negative elements in the array:");
      int count=0;
      for(int i=0;i<size;i++)
        {
          if(arr[i]<0)
          {
            System.out.println(arr[i]);
            count++;
          }
        }
      System.out.println("total number of negative elements are:"+count);
    }
  }