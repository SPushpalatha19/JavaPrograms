import java.util.Scanner;
class UniqueElements
  {
   public static void printingUnique(int a[],boolean b[],int size)
    {
    System.out.println("Unique elements in the given array are");
      for(int i=0;i<size;i++)
        {
          int count=1;
          if(b[i]==true)
              {
                continue;
              }
          for(int j=i+1;j<size;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
          if(count==1)
          {
          System.out.println(a[i]);
          }
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      boolean b[]=new boolean[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<size;i++)
        {
          b[i]=false;
        }
      printingUnique(a,b,size);  
    }
  }