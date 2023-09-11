//print perfect and strong numbers in the array.
import java.util.Scanner;
class PerfectStrongNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      PerfectStrongNumbers obj=new PerfectStrongNumbers();
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      obj.perfectNumber(arr);
      obj.strongNumber(arr);
    }
    public void perfectNumber(int arr[])
    {
      System.out.println("perfect numbers in the array:");
      int perfectCount=0;
      for(int i=0;i<arr.length;i++)
        {
          int sum=0;
          for(int j=1;j<arr[i];j++)
            {
              if(arr[i]%j==0)
              {
                sum=sum+j;
              }
            }
          if(sum==arr[i])
          {
            System.out.println(arr[i]);
             perfectCount++;
          }
        }
    if(perfectCount==0)
      {
        System.out.println("There are no perfect numbers in the given array");
      }
    }
    public void strongNumber(int arr[])
    {
       int strongCount=0;
      System.out.println("strong numbers in the array:");
      for(int i=0;i<arr.length;i++)
        {
          int num=arr[i];
          int sum=0;
          while(num>0)
            {
              int digit=num%10;
              int fact=1;
              for(int j=1;j<=digit;j++)
                {
                  fact=fact*j;
                }
              sum=sum+fact;
              num=num/10;
            }
         if(sum==arr[i])
          {
            System.out.println(arr[i]);
            strongCount++;
          }
        }
      if(strongCount==0)
      {
        System.out.println("There are no strong numbers in the given array");
      }
    }
  }