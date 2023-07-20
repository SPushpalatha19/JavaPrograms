import java.util.Scanner;
class SecondLarge
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      int temp=0;
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(a[i]>a[j])
              {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
              }
            }
        }
      System.out.println("second largest element in the sorted array is "+a[size-2]);
    }
  }