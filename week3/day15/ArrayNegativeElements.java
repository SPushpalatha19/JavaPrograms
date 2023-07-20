import java.util.Scanner;
class ArrayNegativeElements
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[10];
      System.out.println("Enter the value");
      for(int i=0;i<10;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Negative array elements are");
      for(int j=0;j<10;j++)
        {
          if(a[j]<0)
          {
            System.out.println(a[j]);
          }
        }
    }
  }