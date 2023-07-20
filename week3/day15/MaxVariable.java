import java.util.Scanner;
class MaxVariable
  {
    public static void maximum(int a[],int size)
    {
      int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("The maximum element in the given array is "+max);
      }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      maximum(a,size);
    }
  }