//printing maximum array element without return type and without parameters
/*import java.util.Scanner;
class ArrayMax
  {
    public static void main(String args[])
    {
      ArrayMax arr=new ArrayMax();
      arr.printingMax();
    }
    public void printingMax()
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
      int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("maximum element is "+max);
    }
  }*/
//printing maximum array element without return type and with parameters
/*import java.util.Scanner;
class ArrayMax
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
      ArrayMax arr=new ArrayMax();
      arr.printingMax(a,size);
    }
    public void printingMax(int a[],int size)
    {
      
      int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("maximum element is "+max);
    }
  }*/
//printing maximum array element with return type and with parameters
/*import java.util.Scanner;
class ArrayMax
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
      ArrayMax arr=new ArrayMax();
      System.out.println("maximum element is "+arr.printingMax(a,size));
    }
    public int printingMax(int a[],int size)
    {
      
      int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      return max;
    }
  }*/
//printing maximum array element with return type and without parameters
import java.util.Scanner;
class ArrayMax
  {
    public static void main(String args[])
    {
      ArrayMax arr=new ArrayMax();
      System.out.println("maximum element is "+arr.printingMax());
    }
    public int printingMax()
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
      int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      return max;
    }
  }