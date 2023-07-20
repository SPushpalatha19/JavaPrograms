import java.util.Scanner;
class BiggestAmongTwo
  {
    public static void big(int num1,int num2)
    {
      if(num1>num2)
      {
        System.out.println(num1+" is big");
      }
      else{
        System.out.println(num2+" is big");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number");
      int num1=sc.nextInt();
      System.out.println("enter second number");
      int num2=sc.nextInt();
      big(num1,num2);
    }
  }