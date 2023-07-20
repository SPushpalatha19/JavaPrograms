import java.util.Scanner;
class CopyingArray
  {
    public static void copying(int a[],int b[],int size)
    {
      for(int i=0;i<size;i++)
        {
          b[i]=a[i];
        }
      System.out.println("The newly created array elements are");
      for(int i=0;i<size;i++)
        {
          System.out.println("b["+i+"]"+" is "+b[i]);
        }
    }
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
      int a[]=new int[size];
    int b[]=new int[size];
      System.out.println("Enter the array elements");
    for(int i=0;i<size;i++)
      {
        a[i]=sc.nextInt();
      }
    copying(a,b,size);
    }
}