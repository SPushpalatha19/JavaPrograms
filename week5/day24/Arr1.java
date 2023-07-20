// printing array elements without return type and without parameters
import java.util.Scanner;
class Arr1
  {
    public void printArrayElements()
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
      System.out.println("array elements are");
      for(int i=0;i<size;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
      Arr1 arr=new Arr1();
      arr.printArrayElements();
    }
    }
  