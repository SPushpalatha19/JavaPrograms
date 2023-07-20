import java.util.Scanner;
class Ex3
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter first number");
      int num1=sc.nextInt();
      System.out.println("enter second number");
      int num2=sc.nextInt();
      if(num1==num2)
      {
        System.out.println(num1 +"&"+num2+"are equal");
      }
        else if(num1<num2)
        {
          System.out.println(num1+"<"+num2);
        }
          else if(num1>num2)
          {
            System.out.println(num1+">"+num2); 
          }
      else
      {
        System.out.println(num1 +"&"+num2+"are not equal");
      }
  }
  }