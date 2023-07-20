import java.util.Scanner;
class NaturalNumbers
  {
    public static void naturalNumbers(int start,int end)
    {
    for(int i=start;i<=end;i++)
  {
    System.out.println(i);
  }
    }
public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the starting point");
      int start=sc.nextInt();
      System.out.println("Enter the ending point");
      int end=sc.nextInt();
      naturalNumbers(start,end);
    }
  }