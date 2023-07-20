class DivisibleBy3
  {
    public static void main(String args[])
    {
      System.out.println("divisible by 3");
      for(int i=1;i<=100;i++)
        {
          if(i%3==0)
          {
            System.out.println(i);
          }
        }
      System.out.println("divisible by 5");
      for(int i=1;i<=100;i++)
        {
          if(i%5==0)
          {
            System.out.println(i);
          }
        }
      System.out.println("divisible by both 3 and 5 are");
      for(int i=1;i<=100;i++)
        {
          if(i%3==0)
          {
            if(i%5==0)
            {
              System.out.println(i);
            }
          }
        }
    }
  }