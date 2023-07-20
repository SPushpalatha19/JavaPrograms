import java.util.Scanner;
class ArrDuplicate
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
      System.out.println("duplicate elements in the array are");
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
              if(a[i]==a[j])
              {
                System.out.println(a[i]);
              }
            }
        }
    }
  }