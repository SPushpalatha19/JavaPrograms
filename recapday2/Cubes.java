import java.util.Scanner;
class Cubes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number upto where we have to calculate cubes");
      int range=sc.nextInt();
      for(int i=1;i<=range;i++)
        {
         System.out.println("number is "+ i +" and cube of the number is "+(i*i*i));
        }
    }
  }