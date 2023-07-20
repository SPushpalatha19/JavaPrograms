import java.util.Scanner;

class SimpleInterest
  {
    public static void main(String args[])
    {
      float SI;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the principle amount");
      float principle_amt=sc.nextFloat();
      System.out.println("Enter the rate of interest");
      int ROI=sc.nextInt();
      System.out.println("Enter the time period");
      int time=sc.nextInt();
      SI=((principle_amt*time*ROI)/100);
      System.out.println("The simple interest is "+SI);
      }
  }