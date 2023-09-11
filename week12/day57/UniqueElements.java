//print unique elements in an array.
import java.util.Scanner;
class UniqueElements
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      boolean b[]=new boolean[size];
      for(int i=0;i<size;i++)
        {
          b[i]=false;
        }
      System.out.println("Unique elements in the array are");
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
          if(count==1)
          {
            System.out.println(arr[i]);
          }
        }
    }
  }