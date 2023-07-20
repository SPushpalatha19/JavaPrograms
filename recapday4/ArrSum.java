import java.util.Scanner;
class ArrSum
  {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
int sum=0;
for(int i=0;i<a.length;i++)
  {
    sum=sum+a[i];
  }
System.out.println("sum of array elements is "+sum);
}   
  }