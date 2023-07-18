//printing array elements with return type and with parameters
import java.util.Scanner;
class Arr4
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Arr4 arr=new Arr4();
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      int b[]=arr.printArrayElements(a,size);
      System.out.println("Array elements are");
      for(int i=0;i<size;i++)
        {
          System.out.println(b[i]);
        }
    }
    public int[] printArrayElements(int a[],int size)
    {
      return a;
    }
  }