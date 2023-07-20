import java.util.Scanner;
class Percentage
  {
    public static void percentage(float sub1,float sub2,float sub3,float sub4,float sub5)
    {
      float obt_marks=sub1+sub2+sub3+sub4+sub5;
      float result=(obt_marks*100)/500;
      System.out.println("Student percentage is "+result);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first subject marks");
      float sub1=sc.nextFloat();
      System.out.println("Enter second subject marks");
      float sub2=sc.nextFloat();
      System.out.println("Enter third subject marks");
      float sub3=sc.nextFloat();
      System.out.println("Enter fourth subject marks");
      float sub4=sc.nextFloat();
      System.out.println("Enter fifth subject marks");
      float sub5=sc.nextFloat();
      percentage(sub1,sub2,sub3,sub4,sub5);
    }
  }