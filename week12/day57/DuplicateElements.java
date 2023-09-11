//print duplicate elements in an array
import java.util.Scanner;
class DuplicateElements
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      System.out.println("enter the array elements");
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      boolean b[]=new boolean[size];
      for(int i=0;i<size;i++)
        {
          b[i]=false;
        }
      System.out.println("duplicate elements in an array are");
      for(int i=0;i<size;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<size;j++)
            {
              if(arr[i]==arr[j])
                 {
                count++;
                b[j]=true;
                 }
            }
          if(count>1)
          {
            System.out.println(arr[i]);
          }
        }
    }
  }