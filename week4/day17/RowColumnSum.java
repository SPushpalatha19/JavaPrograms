import java.util.Scanner;
class RowColumnSum
  {
    public static void rowSum(int a[][],int row,int col)
    {
      System.out.println("Row totals are:");
     for(int i=0;i<row;i++)
       {
         int sum=0;
         for(int j=0;j<col;j++)
           {
             sum=sum+a[i][j];
           }
         System.out.println("sum is "+sum);
       }
    }
    public static void colSum(int a[][],int row,int col)
    {
      System.out.println("Column totals are:");
    /* for(int j=0;j<col;j++)
        {
          int sum=0;
          for(int i=0;i<row;i++)
            {
              sum=sum+a[i][j];
            }
          System.out.println("sum is "+sum);
    }*/
      for(int i=0;i<row;i++)
        {
          int sum=0;
          for(int j=0;j<col;j++)
            {
              sum=sum+a[j][i];
            }
          System.out.println("sum is "+sum);
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the column size");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      System.out.println("enter the matrix values");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("The matrix is");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
      rowSum(a,row,col);
      colSum(a,row,col);
    }
  }