import java.util.Scanner;
class ArrayEven
  {
      public static void evenElements(int a[])
        {
        System.out.println("even elements in an array are");
        for(int j=0;j<a.length;j++)
          {
            if(a[j]%2==0)
            {
              System.out.println(a[j]);
            }
          }
      }
    public static void main(String args[])
      {
      Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
      System.out.println("enter the value");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      evenElements(a);
      }
  }
  