import java.util.Scanner;
class MatrixMul
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the row size");
int row=sc.nextInt();
System.out.println("enter the column size");
int col=sc.nextInt();
int a[][]=new int[row][col];
System.out.println("enter first matrix elements");
for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
      {
        a[i][j]=sc.nextInt();
      }
  }
int b[][]=new int[row][col];
System.out.println("enter second matrix elements");
for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
      {
        b[i][j]=sc.nextInt();
      }
  }
System.out.println("After multiplication of two matrices result matrix is ");
int result[][]=new int[row][col];
for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
      {
        result[i][j]=a[i][j]*b[i][j];
      }
  }
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