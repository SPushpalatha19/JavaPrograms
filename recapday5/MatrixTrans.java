import java.util.Scanner;
class MatrixTrans
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter row size");
      int row=sc.nextInt();
      System.out.println("enter column size");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      System.out.println("enter matrix elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
      int b[][]=new int[row][col];
      System.out.println("after performing matrix transpose");
    for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
          {
            b[j][i]=a[i][j];
          }
      }
    for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
          {
            System.out.print(b[i][j]+" ");
          }
        System.out.println();
      }
    }
  }