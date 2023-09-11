//Write a JAVAprogram to count total number of even and odd elements in an array.
import java.util.Scanner;
class ArrayEvenOdd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayEvenOdd obj=new ArrayEvenOdd();
      System.out.println("enter the array size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      obj.evenElements(arr);
      obj.oddElements(arr);
    }
    public void evenElements(int arr[])
    {
      int count=0,sum=0;
      System.out.println("Even elements in the array");
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2==0)
          {
            System.out.println(arr[i]);
            count++;
            sum=sum+arr[i];
          }
        }
      System.out.println("total even numbers are:"+count);
      System.out.println("sum of the even numbers is:"+sum);
    }
    public void oddElements(int arr[])
    {
     int count=0,sum=0;
      System.out.println("Odd elements in the array");
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2!=0)
          {
            System.out.println(arr[i]);
            count++;
            sum=sum+arr[i];
          }
        }
      System.out.println("total odd elements are:"+count);
      System.out.println("sum of odd elements are:"+sum);
    }
  }