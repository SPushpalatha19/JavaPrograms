//print frequency of each number in an array
import java.util.Scanner;
class Frequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      boolean b[]=new boolean[size];
      for(int i=0;i<size;i++)
        {
          b[i]=false;
        }
      System.out.println("frequency of an each number is");
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
         System.out.println("frequency of "+arr[i]+" is:"+count);
        }
    }
  }