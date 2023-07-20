import java.util.Scanner;
class FirstAndLastDigit
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int result=0;
     int last=n%10;
      while(n>0)
        {
       result=n%10;
          n=n/10; 
        }
      int first=result;
      System.out.println("The first digit in the number is "+first);
      System.out.println("The last digit in the number is "+last);
    }
  }