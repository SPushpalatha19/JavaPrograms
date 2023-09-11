//WAP to print all even numbers between 1 to 100. - using while     loop
//WAP to print all odd number between 1 to 100.
//WAP to find sum of all even numbers between 1 to n.
//WAP to find sum of all odd numbers between 1 to n.

class EvenOdd
  {
    public static void main(String args[])
    {
      int i=1;
      int sum=0;
      while(i<=100)
        {
          if(i%2==0)
          {
            //System.out.println(i);
            sum=sum+i;
          }
          i++;
        }
System.out.println("sum of 100 even numbers is:"+sum);
        
      /*while(i<=100)
        {
          if(i%2!=0)
          {
            sum=sum+i;
            //System.out.println(i);
          }
          i++;
        }
      System.out.println("sum of 100 odd numbers is:"+sum);*/
    }
  }