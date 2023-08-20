import java.util.Scanner;
class BubbleSort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      BubbleSort obj=new BubbleSort();
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Before sorting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      System.out.println();
      obj.bubbleSort(arr,size);
    }
    public void bubbleSort(int arr[],int size)
    {
      int temp=0;
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("After Sorting");
      for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }
      
    }
  }