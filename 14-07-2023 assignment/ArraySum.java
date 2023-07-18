//printing sum of the array elements without return type and without parameters
/*import java.util.Scanner;
class ArraySum
  {
    public static void main(String args[])
    {
      ArraySum arr=new ArraySum();
      arr.printingSum();
    }
    public void printingSum()
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
      int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("sum of the array elements is "+sum);
    }
  }*/
//printing sum of the array elements without return type and with parameters
/*import java.util.Scanner;
class ArraySum
  {
    public static void main(String args[])
    {
      ArraySum arr=new ArraySum();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      arr.printingSum(a,size);
    }
    public void printingSum(int a[],int size)
    {
      int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("sum of the array elements is "+sum);
    }
  }*/
//printing sum of the array elements with return type and with parameters
/*import java.util.Scanner;
class ArraySum
  {
    public static void main(String args[])
    {
      ArraySum arr=new ArraySum();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
     // int result=arr.printingSum(a,size);
      System.out.println("sum of the array elements is "+arr.printingSum(a,size));
    }
    public int printingSum(int a[],int size)
    {
      int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
        }
      return sum;
    }
  }*/
//printing sum of the array elements with return type and without parameters
import java.util.Scanner;
class ArraySum
  {
    public static void main(String args[])
    {
      ArraySum arr=new ArraySum();
     // int result=arr.printingSum(a,size);
      System.out.println("sum of the array elements is "+arr.printingSum());
    }
    public int printingSum()
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
      int sum=0;
      for(int i=0;i<size;i++)
        {
          sum=sum+a[i];
        }
      return sum;
    }
  }