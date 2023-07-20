import java.util.Scanner;
class MatrixAdd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the column size");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      System.out.println("enter the first matrix elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("enter the second matrix elements");
      int b[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
      int result[][]=new int[row][col];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              result[i][j]=a[i][j]+b[i][j];
            }
        }
      System.out.println("addition of two matrices is ");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(result[i][j]+" ");
            }
          System.out.println();
        }
  }
  }