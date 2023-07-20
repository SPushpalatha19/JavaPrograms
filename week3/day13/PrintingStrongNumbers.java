import java.util.Scanner;
class PrintingStrongNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the start point");
      int start=sc.nextInt();
      System.out.println("Enter the end point");
      int end=sc.nextInt();
      for(int i=start;i<=end;i++)
        {
          int temp=i;
          int sum=0;
          int fact=1;
          while(temp>0)
            {
              fact=1;
            int digit=temp%10;
              for(int j=digit;j>0;j--)
                {
                  fact=fact*j;
            }
              sum=sum+fact;
             temp=temp/10;
            }
           if(i==sum)
          {
           System.out.println(i); 
          }
        }
    }
  }