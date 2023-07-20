import java.util.Scanner;
class Average
  {
    public static void average(int num1,int num2,int num3)
    {
      int sum=num1+num2+num3;
      double avg=sum/3;
      System.out.println("average of three numbers is "+avg);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number1 value");
      int num1=sc.nextInt();
      System.out.println("enter number2 value");
      int num2=sc.nextInt();
      System.out.println("enter number3 value");
      int num3=sc.nextInt();
      average(num1,num2,num3);
    }
  }