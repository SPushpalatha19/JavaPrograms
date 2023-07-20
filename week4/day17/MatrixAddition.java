import java.util.Scanner;
class MatrixAddition
  {
    public static void addition(int a[][],int b[][],int row,int col)
    {
      int result[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              result[i][j]=a[i][j]+b[i][j];
            }
        }
      System.out.println("After addition of two matrices the result matrix is");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
          {
            System.out.print(result[i][j]+" ");
          }
          System.out.println();
        }
     }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("the size of the two matrices must be same");
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the column size");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      int b[][]=new int[row][col];
      System.out.println("enter the first matrix values");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("enter the second matrix values");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
      System.out.println("first matrix is");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
      System.out.println("second matrix is");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(b[i][j]+" ");
            }
          System.out.println();
        }
      addition(a,b,row,col);
    }
  }