//Write a JAVAprogram to find maximum and minimum element in an array.
import java.util.Scanner;
class ArrayMaxMin
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayMaxMin obj=new ArrayMaxMin();
      System.out.println("enter the size");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      obj.arrayMax(arr);
      obj.arrayMin(arr);
    }
    public void arrayMax(int arr[])
    {
      int max=arr[0];
      for(int i=1;i<arr.length;i++)
        {
          if(max<arr[i])
          {
            max=arr[i];
          }
        }
      System.out.println("Maximum element in the array is:"+max);
    }
    public void arrayMin(int arr[])
    {
      int min=arr[0];
      for(int i=0;i<arr.length;i++)
        {
          if(min>arr[i])
          {
            min=arr[i];
          }
        }
      System.out.println("Minimum element in the array is:"+min);
    }
  }