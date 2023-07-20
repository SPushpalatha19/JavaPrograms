import java.util.Scanner;
class LargestElement
  {
    public static void largest(int a[][],int row,int col)
    {
     int large=a[0][0];
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              if(large<a[i][j])
              {
              large=a[i][j];
              }
            }
        }
      System.out.println("The largest element in the given matrix is "+large);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size");
      int row=sc.nextInt();
      System.out.println("enter the column size");
      int col=sc.nextInt();
      int a[][]=new int[row][col];
      System.out.println("enter the matrix elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      largest(a,row,col);
    }
  }