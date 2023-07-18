//printing minimum array element without return type and without parameters
/*import java.util.Scanner;
class ArrayMin
  {
    public static void main(String args[])
    {
      ArrayMin arr=new ArrayMin();
      arr.printingMin();
    }
    public void printingMin()
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
      int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("minimum element is "+min);
    }
  }*/
//printing minimum array element without return type and with parameters
/*import java.util.Scanner;
class ArrayMin
  {
    public static void main(String args[])
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
      ArrayMin arr=new ArrayMin();
      arr.printingMin(a,size);
    }
    public void printingMin(int a[],int size)
    {
      
      int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min<a[i])
          {
            min=a[i];
          }
        }
      System.out.println("minimum element is "+min);
    }
  }*/
//printing minimum array element with return type and with parameters
/*import java.util.Scanner;
class ArrayMin
  {
    public static void main(String args[])
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
      ArrayMin arr=new ArrayMin();
      System.out.println("minimum element is "+arr.printingMin(a,size));
    }
    public int printingMin(int a[],int size)
    {
      
      int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min<a[i])
          {
            min=a[i];
          }
        }
      return min;
    }
  }*/
//printing minimum array element with return type and without parameters
import java.util.Scanner;
class ArrayMin
  {
    public static void main(String args[])
    {
      ArrayMin arr=new ArrayMin();
      System.out.println("minimum element is "+arr.printingMin());
    }
    public int printingMin()
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
      int min=a[0];
      for(int i=0;i<size;i++)
        {
          if(min<a[i])
          {
            min=a[i];
          }
        }
      return min;
    }
  }