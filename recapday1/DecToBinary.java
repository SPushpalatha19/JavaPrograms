import java.util.Scanner;
class DecToBinary
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the decimal number for binary conversion");
      int dec=sc.nextInt();
      int n=dec;
      int bin[];
      while(n>0)
        {
        bin[]=n%2;
          n=n/2;
        }
    }
  }