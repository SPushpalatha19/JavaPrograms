import java.util.Scanner;
class ArrOdd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("odd numbers in the given array are");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2!=0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }