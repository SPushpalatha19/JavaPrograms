import java.util.Scanner;
class BinarySearch{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the array elements in an ascending order");
    for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("enter the element to search");
    int key=sc.nextInt();
    int first=0;
    int last=arr.length-1;
    binarySearch(arr,first,last,key);
  }
  public static void binarySearch(int a[],int first,int last,int key)
  {
      int mid=(first+last)/2;
    while(first<=last)
      {
        if(a[mid]<key)
        {
          first=mid+1;
        }
        else if(a[mid]==key)
        {
          System.out.println(key+" is found at index "+mid);
          break;
        }
        else
        {
          last=mid-1;
        }
        mid=(first+last)/2;
      }
    if(first>last)
    {
      System.out.println("element is not found");
    }
  }
  }
