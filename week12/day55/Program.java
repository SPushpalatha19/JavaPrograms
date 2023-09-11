//write a java program to print 1 to 1000 strong numbers.
class Program
  {
    public static void main(String args[])
    {
     for(int i=1;i<=1000;i++)
        {
          int sum=0;
          int n=i,temp=i;
          int digit;
          while(n>0)//1>0//
            {
              digit=n%10;//1%10=1
              int fact=1;
              for(int j=1;j<=digit;j++)
                {
                  fact=fact*j;//120//24//1
                }
              sum=sum+fact;//0+120=120//120+24=144//144+1=145
              n=n/10;//14/10=1
            }
          if(sum==temp)
          {
            System.out.println(temp);
          }
        }
    }
  }