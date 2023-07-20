import java.util.Scanner;
class Unique
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter array size");
      int size=sc.nextInt();
      System.out.println("enter array elements");
      int a[]=new int[size];
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
          if(b[i]==true)
          continue;
          int count=1;
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
  }