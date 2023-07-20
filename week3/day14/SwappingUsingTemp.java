import java.util.Scanner;
class SwappingUsingTemp
  {
    public static void swap(int first,int second)
    {
      int temp=first;
      first=second;
      second=temp;
      System.out.println("After swapping");
      System.out.print("first number is "+first+"\n"+"second number is "+second+"\n");
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number");
      int first=sc.nextInt();
      System.out.println("enter second number");
      int second=sc.nextInt();
      System.out.println("before swapping");
      System.out.println("first number is "+first+"\n"+"second number is "+second);
      swap(first,second);
    }
  }