//printing odd elements in an array
//printing odd elements using with return type and without parameters.
import java.util.Scanner;
/*class ArrayOdd
  {
    public int[] printOddElements()
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
      int result[]=new int[size];
      System.out.println("array odd elements are");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2!=0)
          {
           result[i]=a[i];
           // System.out.println(result[i]);
          }
        }
      return result;
    }
    public static void main(String args[])
    {
      ArrayOdd arr=new ArrayOdd();
      int result[]=arr.printOddElements();
      for(int i=0;i<result.length;i++)
        {
          System.out.println(result[i]);
        }
    }
  }*/
//printing odd elements using with return type and with parameters
/*class ArrayOdd
  {
    public int[] printOddElements(int a[],int size)
    {
      int result[]=new int[size];
      System.out.println("array odd elements are");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2!=0)
          {
           result[i]=a[i];
          // System.out.println(result[i]);
          }
        }
      return result;
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
      ArrayOdd arr=new ArrayOdd();
      int result[]=arr.printOddElements(a,size);
      for(int i=0;i<result.length;i++)
        {
          System.out.println(result[i]);
        }
    }
  }*/
//printing odd elements using without return type and without parameters.
/*class ArrayOdd
  {
     public static void main(String args[])
    {
      ArrayOdd arr=new ArrayOdd();
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
      System.out.println("odd array elements are");
      for(int i=0;i<size;i++)
        {
        if(a[i]%2!=0)
        {
          System.out.println(a[i]);
        }
        }
    }
  }*/
//printing odd elements using without return type and with parameters.
class ArrayOdd
  {
     public static void main(String args[])
    {
      ArrayOdd arr=new ArrayOdd();
      Scanner sc=new Scanner(System.in);
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
    public void printArrayElements(int a[],int size)
    {
      
      System.out.println("odd array elements are");
      for(int i=0;i<size;i++)
        {
        if(a[i]%2!=0)
        {
          System.out.println(a[i]);
        }
        }
    }
  }
    
  