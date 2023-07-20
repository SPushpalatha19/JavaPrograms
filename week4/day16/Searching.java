import java.util.Scanner;
class Searching
  {
    public static void searchingElement(int a[],int size,int value)
    {
      int count=0,i;
      for(i=0;i<size;i++)
        {
          if(a[i]==value)
          {
           count++;
            break;
          }
        }
          if(count>0)
          {
            System.out.println(value+" is found at "+i+" index position");
          }
          else
          {
            System.out.println(value+" is not found in the given array");
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
      System.out.println("enter the value to find the index number in the given array");
      int value=sc.nextInt();
      searchingElement(a,size,value);
    }
  }