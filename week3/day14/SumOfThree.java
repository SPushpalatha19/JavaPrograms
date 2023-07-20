import java.util.Scanner;
class SumOfThree
  {
public static void addition(int num1,int num2,int num3)
  {
int result=num1+num2+num3;
System.out.println("Addition of three numbers "+result);
  }
public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number1");
  int num1=sc.nextInt();
  System.out.println("Enter number2");
  int num2=sc.nextInt();
  System.out.println("Enter number3");
  int num3=sc.nextInt();
  addition(num1,num2,num3);
  }
}