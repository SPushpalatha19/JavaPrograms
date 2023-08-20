import java.util.Scanner;
class LinearSearch{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("enter the array elements");
    for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("enter the element to search");
    int key=sc.nextInt();
    linearSearch(arr,key);
  }
    public static void linearSearch(int a[],int key)
      {
        int pos=-1;
      for(int i=0;i<a.length;i++){
        if(a[i]==key)
        {
          pos=i;
          break;
        }
      }
      if(pos>=0)
      {
        System.out.println(key+" is found at index "+pos);
      }
      else{
        System.out.println(key+" is not found");
      }
      }
}