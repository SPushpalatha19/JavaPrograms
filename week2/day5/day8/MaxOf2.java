import java.util.Scanner;
class MaxOf2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      if(a>=b)
      {
        System.out.println(a +" is "+ "large number");
      }
      else{
         System.out.println(b +" is "+ "large number");
      }
    }
  }