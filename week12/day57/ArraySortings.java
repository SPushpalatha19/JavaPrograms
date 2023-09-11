//Write a java program to sort array elements in ascending and descending order.
import java.util.Scanner;
class ArraySortings
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArraySortings obj=new ArraySortings();
      System.out.println("enter the size");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int arr[]=new int[size];
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      obj.ascendingOrder(arr);
      obj.descendingOrder(arr);
    }
    public void ascendingOrder(int arr[])
    {
      for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[i]>arr[j])
              {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("array in ascending order");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    }
    public void descendingOrder(int arr[])
    {
      for(int i=0;i<arr.length;i++)
        {
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[i]<arr[j])
              {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("array in descending order");
      for(int i=0;i<arr.length;i++)
        {
          System.out.println(arr[i]);
        }
    }
  }