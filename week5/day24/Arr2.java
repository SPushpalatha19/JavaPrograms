//printing array elements with out return type and with parameters
import java.util.Scanner;
class Arr2
  {
    public void printArrayElements(int a[],int size)
    {
      System.out.println("array elements are");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]+" ");
        }
    }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        Arr2 arr=new Arr2();
        System.out.println("enter the size of an array");
        int size=sc.nextInt();
        System.out.println("enter the array elements");
        int a[]=new int[size];
        for(int i=0;i<size;i++)
          {
            a[i]=sc.nextInt();
          }
        arr.printArrayElements(a,size);
        }
  }