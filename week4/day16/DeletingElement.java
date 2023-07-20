import java.util.Scanner;
class DeletingElement
  {
    public static void deletingElement(int a[],int size,int position)
    {
     for(int i=0;i<size-1;i++)
       {
         if(i==position)
         {
           a[i]=a[i+1];
         }
           else if(i>position)
           {
             a[i]=a[i+1];
           }
         else
           {
             continue;
           }
       }
      System.out.println("after deleting");
      for(int i=0;i<size-1;i++)
        {
          System.out.println(a[i]);
        }
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
      System.out.println("enter the position at where we have to delete the element");
      int position=sc.nextInt();
      System.out.println("before deleting");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
      deletingElement(a,size,position);
  }
  }