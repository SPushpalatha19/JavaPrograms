import java.util.Scanner;
class ArrEven
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
      System.out.println("even numbers in the array are");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
    }
  }