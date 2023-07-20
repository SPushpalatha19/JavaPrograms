import java.util.Scanner;
class BiggestAmongThree
  {
    public static void big(int num1,int num2,int num3)
    {
      if((num1>num2)&&(num1>num3))
      {
        System.out.println(num1+" is big");
      }
      else if(num2>num3)
      {
        System.out.println(num2+" is big");
      }
      else 
      {
        System.out.println(num3+" is big");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number");
      int num1=sc.nextInt();
      System.out.println("enter second number");
      int num2=sc.nextInt();
      System.out.println("enter third number");
      int num3=sc.nextInt();
      big(num1,num2,num3);
    }
  }