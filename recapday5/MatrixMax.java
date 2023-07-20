import java.util.Scanner;
class MatrixMax
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter row size");
      int row=sc.nextInt();
      System.out.println("enter column size");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      System.out.println("enter the elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      int max=a[0][0];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              if(max<a[i][j])
              {
                max=a[i][j];
              }
            }
        }
      System.out.println("maximum element in the matrix is "+max);
    }
  }