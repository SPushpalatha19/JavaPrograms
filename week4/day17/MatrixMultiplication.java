import java.util.Scanner;
class MatrixMultiplication
  {
    public static void multiplication(int a[][],int b[][],int result[][],int row,int col)
    {
     for(int i=0;i<row;i++)
       {
         for(int j=0;j<col;j++)
           {
             result[i][j]=a[i][j]*b[i][j];
           }
     }
      System.out.println("result matrix is");
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
      System.out.println("size of the two matrices must be same");
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the column size");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      int b[][]=new int[row][col];
      int result[][]=new int[row][col];
      System.out.println("enter the values into first matrix");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("enter the values into second matrix");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              b[i][j]=sc.nextInt();
            }
        }
      multiplication(a,b,result,row,col);
    }
  }