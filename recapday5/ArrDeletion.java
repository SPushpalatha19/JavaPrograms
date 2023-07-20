import java.util.Scanner;
class ArrDeletion
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
      System.out.println("enter the position at which we have to delete the element");
      int pos=sc.nextInt();
      for(int i=pos;i<size-1;i++)
        {
     a[i]=a[i+1];
        }
      System.out.println("Array after deletion");
      for(int i=0;i<size-1;i++)
        {
          System.out.println(a[i]);
        }
    }
  }