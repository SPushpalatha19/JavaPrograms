//print even, odd, prime and palindrome numbers in the array.
import java.util.Scanner;
class EvenOddPrimePalindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      EvenOddPrimePalindrome obj=new EvenOddPrimePalindrome();
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      obj.evenNumber(arr);
      obj.oddNumber(arr);
      obj.primeNumber(arr);
      obj.palindrome(arr);
    }
    public void evenNumber(int arr[])
    {
      System.out.println("even numbers in the given array");
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2==0)
          {
            System.out.println(arr[i]);
          }
        }
    }
    public void oddNumber(int arr[])
    {
      System.out.println("odd numbers in the given array");
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]%2!=0)
          {
            System.out.println(arr[i]);
          }
        }
    }
    public void primeNumber(int arr[])
    {
      System.out.println("prime numbers in the given array");
      for(int i=0;i<arr.length;i++)
        {
          int num=arr[i];
          int factors=0;
          for(int j=1;j<=num;j++)
            {
              if(num%j==0)
              {
                factors++;
              }
            }
          if(factors==2)
          {
            System.out.println(arr[i]);
          }
        }
    }
    public void palindrome(int arr[])
    {
      System.out.println("palindrome numbers in the given array");
      for(int i=0;i<arr.length;i++)
        {
          int digit=0;
          int reverse=0;
          int temp=arr[i];
          while(temp>0)
            {
              digit=temp%10;
              reverse=(reverse*10)+digit;
              temp=temp/10;
            }
          if(reverse==arr[i])
          {
            System.out.println(arr[i]);
          }
        }
    }
  }