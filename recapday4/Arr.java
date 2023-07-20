import java.util.Scanner;
class Arr
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
      System.out.println("enter array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("array elements are");
      for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
    }
  }