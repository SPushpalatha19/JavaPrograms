import java.util.Scanner;
class Frequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter the array elements");
      for(int i=0;i<size;i++)
        {
         a[i]=sc.nextInt(); 
        }
      boolean b[]=new boolean[size];
      for(int i=0;i<size;i++)
        {
          b[i]=false;
        }
      for(int i=0;i<size;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<size;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
          System.out.println(a[i]+" is occured "+count+" times");
        }
      
    }
  }