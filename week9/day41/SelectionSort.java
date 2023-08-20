import java.util.Scanner;
class SelectionSort
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
      System.out.println("after sorting");
      selectionSort(arr,size);
    }
    public static void selectionSort(int arr[],int size)
    {
      int i,j,temp=0;
      for(i=0;i<size;i++)
        {
          int min=i;
          for(j=i+1;j<size;j++)
            {
              if(arr[j]<arr[min])
              {
                min=j;
              }
            }
              temp=arr[min];
              arr[min]=arr[i];
              arr[i]=temp;
        }
      for(i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
    }
  