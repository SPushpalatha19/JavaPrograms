import java.util.Scanner;
class DuplicateValues
  {
    public static void duplication(int a[],int size)
    {
      System.out.println("The duplicate values in the given array are");
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++)
            {
             if(a[i]==a[j])
             {
              System.out.println(a[i]);
             }
            }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      duplication(a,size);
    }
  }