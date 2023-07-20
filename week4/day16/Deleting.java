import java.util.Scanner;
class Deleting
  {
    public static void deleting(int a[],int size,int pos)
    {
    System.out.println("after deleting");
      for(int i=pos;i<size-1;i++)//i=5//5<7//6<7//7<7
        {
            a[i]=a[i+1];//a[5]=a[5+1]//a[6]=a[6+1]
          }
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
      System.out.println("enter the position at where we want to delete the element");
      int pos=sc.nextInt();
      System.out.println("before deleting");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
      deleting(a,size,pos);
    }
  }