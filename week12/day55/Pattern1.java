/* print a pattern like
****
*  *
*  *
****
  */
class Pattern1
  {
    public static void main(String args[])
    {
      int n=5;
      for(int i=0;i<=n;i++)  //for rows
        //for(int i=0;i<n;i++)
        {
          //i=0;0<=3
          for(int j=0;j<=n;j++) //for columns
            //for(int j=0;j<n;j++)
            {
              //j=0;0<=3
              if(i==0 || j==0||i==n || j==n)
                //if(i==0 || j=0 || i==n-1 || j=n-1)
                //In 1st row,1st column,last row and last column displays "*"
              {
              System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            }
          System.out.println();
        }
    }
  }