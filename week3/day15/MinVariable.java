import java.util.Scanner;
class MinVariable
  {
    public static void minimum(int a[],int size)
    {
      int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("Minimum element of an array is "+min);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      minimum(a,size);
    }
  }