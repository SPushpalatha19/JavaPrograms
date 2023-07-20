import java.util.Scanner;
class CountingNegative
  {
   public static void countingNegative(int a[])
        {
        int count=0;
        for(int i=0;i<a.length;i++)
          {
            if(a[i]<0)
            {
              count++;
            }
          }
        System.out.println("No.of negative elements in an array is "+count);
        }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
          int a[]=new int[10];
          System.out.println("enter the array elements");
          for(int i=0;i<a.length;i++)
            {
              a[i]=sc.nextInt();
            }
          countingNegative(a);
        }
    }
  