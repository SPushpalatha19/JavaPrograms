import java.util.Scanner;
class ArrMax
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter array elements");
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
      System.out.println("maximum element in the array is "+max);
    }
  }