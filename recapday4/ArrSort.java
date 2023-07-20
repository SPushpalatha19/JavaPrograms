import java.util.Scanner;
class ArrSort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("before sorting");
      for(int i:a)
        {
          System.out.println(i);
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
      System.out.println("after sorting");
      for(int i:a)
        {
          System.out.println(i);
        }
    }
  }