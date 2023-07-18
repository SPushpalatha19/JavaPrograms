//printing array elements with return type and with out parameters
import java.util.Scanner;
class Arr3
  {
    public int[] printArrayElements()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("array elements are");
      return a;
        
    }
    public static void main(String args[])
    {
      Arr3 arr=new Arr3();
      int a[]=arr.printArrayElements();
      for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
    }
  }