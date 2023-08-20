import java.util.Scanner;
class QuickSort
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
      int lb=0;
      int ub=arr.length-1;
      quickSort(arr,lb,ub);
      System.out.println("After sorting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
    }
    public static void quickSort(int arr[],int lb,int ub)
    {
      if(lb<ub)
      {
        int loc=partition(arr,lb,ub);
        quickSort(arr,lb,loc-1);
        quickSort(arr,loc+1,ub);
      }
    }
    public static int partition(int arr[],int lb,int ub)
    {
      int pivot=arr[lb];
      int start=lb;
      int end=ub;
      while(start<end)
        {
          while(start<ub && arr[start]<=pivot)
            {
              start++;
            }
          while(arr[end]>pivot)
            {
              end--;
            }
          if(start<end)
          {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
          }
        }
      arr[lb]=arr[end];
      arr[end]=pivot;
      return end;
    }
  }