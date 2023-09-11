//write a java program to insert or delete or search an element in an array.Take the input from the user for which operation we have to perform.
import java.util.Scanner;
class ArrayOperations
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayOperations obj=new ArrayOperations();
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int arr[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      int arr1[]=new int[size+1];
      System.out.println("---------------------");
      System.out.println(" 1.Inserting an element into the array \n 2.Deleting an element from the array \n 3.Searching for an element in the array \n 4.exit");
       System.out.println("---------------------");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              obj.insertingElement(arr,arr1);
              break;
            case 2:
              obj.deletingElement(arr);
              break;
            case 3:
              obj.searchingElement(arr);
              break;
            case 4:
              System.exit(0);
              break;
            default:
              System.out.println("enter valid option");
          }
    }
    public void insertingElement(int arr[],int arr1[])
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the element to insert");
      int value=sc.nextInt();
      System.out.println("enter the index position at which we have to insert the element");
      int pos=sc.nextInt();
      for(int i=0;i<arr1.length;i++)
        {
          if(i==pos)
          {
            arr1[i]=value;
          }
          else if(i>pos)
          {
            arr1[i]=arr[i-1];
          }
          else 
          {
            arr1[i]=arr[i];
          }
        }
      System.out.println(value+" is inserted successfully");
      System.out.println("New array is");
      for(int i=0;i<arr1.length;i++)
        {
          System.out.println(arr1[i]);
        }
    }
    public void deletingElement(int arr[])
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the element to delete");
      int value=sc.nextInt();
      int pos=-1;
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==value)
          {
            pos=i;
          }
        }
      if(pos>=0)
      {
       for(int i=pos;i<arr.length-1;i++)
         {
           arr[i]=arr[i+1];
         }
      System.out.println("After deleting array will be:");
      for(int i=0;i<arr.length-1;i++)
        {
          System.out.println(arr[i]);
        }
      }
      else{
        System.out.println("No such type of element to remove");
      }
    }
    public void searchingElement(int arr[])
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the element to search");
      int value=sc.nextInt();
      int pos=-1;
      for(int i=0;i<arr.length;i++)
        {
          if(arr[i]==value)
          {
             pos=i;
            break;
          }
        }
      if(pos>=0)
      {
        System.out.println(value+" is found at index position "+pos);
      }
      else{
        System.out.println(value+" is not found");
      }
    }
  }