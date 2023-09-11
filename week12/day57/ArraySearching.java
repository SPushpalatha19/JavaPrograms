//Write a Java program to find the index of an array element.
import java.util.Scanner;
class ArraySearching
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
      System.out.println("enter the element to search");
      int key=sc.nextInt();
      int pos=-1;
      for(int i=0;i<size;i++)
        {
          if(arr[i]==key)
          {
            pos=i;
            break;
          }
        }
      if(pos>=0)
      {
        System.out.println(key+" is found at index:"+pos);
      }
      else{
        System.out.println(key+" is not found");
      }
    }
  }