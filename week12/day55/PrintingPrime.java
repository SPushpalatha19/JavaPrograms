import java.util.Scanner;
class PrintingPrime
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter starting point");
      int start=sc.nextInt();//10
      System.out.println("enter ending point");
      int end=sc.nextInt();//20
      System.out.println("Prime numbers");
      // int sum=0;
      int sum=0;
      for(int i=start;i<=end;i++)//i=13  
        {
          int count=0;
          for(int j=1;j<=i;j++)//j=
            {
              if(i%j==0)//11%1
              {
                count++;//1
              }
            }
          if(count==2)
          {
           System.out.println(i);
            //sum=sum+i;
          }
        }
     // System.out.println(sum);
      
    }
  }