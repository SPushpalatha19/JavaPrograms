import java.util.Scanner;
class ArrayOdd
  {
    public static void oddElements(int a[])
    {
      System.out.println("odd element are");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            System.out.println(a[i]);
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("Enter the value");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      oddElements(a);
    }
  }