import java.util.Scanner;
class Searching
  {
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
      System.out.println("enter the element to search");
      int value=sc.nextInt();
      int pos=-1;
      for(int i=0;i<size;i++)
        {
          if(a[i]==value)
          {
            pos=i;
            //System.out.println(value+" is found at "+i+" index position");
          }
        }
          if(pos==-1)
          {
            System.out.println("element is not found at any index position");
          }
          else
          {
            System.out.println(value+" is found at "+pos+" index position");
          } 
    }
  }