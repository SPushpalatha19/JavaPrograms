//printing even elements in an array
//printing even elements using without return type and without parameters.
import java.util.Scanner;
/*class ArrayEven
  {
    public static void main(String args[])
    {
      ArrayEven arr=new ArrayEven();
      arr.printArrayElements();
    }
    public void printArrayElements()
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
      System.out.println("even array elements are");
      for(int i=0;i<size;i++)
        {
        if(a[i]%2==0)
        {
          System.out.println(a[i]);
        }
        }
    }
  }*/
//printing even elements using without return type and with parameters.
/*class ArrayEven
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayEven arr=new ArrayEven();
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      System.out.println("enter array elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      arr.printEvenElements(a,size);
    }
    public void printEvenElements(int a[],int size)
    {
      System.out.println("array even elements are");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2==0)
          {
          System.out.println(a[i]);
        }
        }
    }
  }*/
//printing even elements using with return type and without parameters.
class ArrEven
  {
    public static void main(String args[])
    {
      ArrEven arr=new ArrEven();
      int b[]=arr.printEvenElements();
      System.out.println("Array even elements are");
      for(int i=0;i<b.length;i++)
        {
          System.out.println(b[i]);
        }
    }
    public int[] printEvenElements()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
       System.out.println("enter array elements");
      int a[]=new int[size];
      int result[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<size;i++)
        {
          if(a[i]%2==0)
          {
           result[i]=a[i];
          }
        }
      return result;
    }
    }
//printing even elements using with return type and with parameters.
/*class ArrEven
  {
    public static void main(String args[])
    {
      ArrEven arr=new ArrEven();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
       System.out.println("enter array elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      int b[]=arr.printEvenElements(a,size);
      System.out.println("Array even elements are");
      for(int i=0;i<b.length;i++)
        {
          System.out.println(b[i]);
        }
    }
    public int[] printEvenElements(int a[],int size)
    {
      int result[]=new int[size];
      for(int i=0;i<size;i++)
        {
          if(a[i]%2==0)
          {
           result[i]=a[i];
          }
        }
      return result;
    }
    }*/