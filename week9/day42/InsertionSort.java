import java.util.Scanner;
class InsertionSort
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
      System.out.println("before sorting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
      insertionSort(arr,size);
    }
    public static void insertionSort(int arr[],int size)
    {
      int i,j,key;
      for(i=1;i<size;i++)
        {
          key=arr[i];
          j=i-1;
          while(j>=0 && key<=arr[j])
          {
           arr[j+1]=arr[j];
            j=j-1;
          }
          arr[j+1]=key;
        }
      System.out.println("after sorting");
      for(i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
    }
  }