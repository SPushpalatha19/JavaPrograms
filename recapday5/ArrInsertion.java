import java.util.Scanner;
class ArrInsertion
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("enter the position at where we have to insert the new element");
      int pos=sc.nextInt();
      System.out.println("enter the element which is to be inserted");
      int value=sc.nextInt();
      int b[]=new int[size+1];
      for(int i=0;i<size+1;i++)
        {
          if(i==pos)
          {
            b[i]=value;
          }
          else if(i>pos)
          {
            b[i]=a[i-1];
          }
          else 
          {
            b[i]=a[i];
          }
        }
      System.out.println("new array is ");
      for(int i=0;i<b.length;i++)
        {
          System.out.println(b[i]);
        }
      }
  }