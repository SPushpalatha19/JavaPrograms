//WAP to print all natural numbers from 1 to n. - using while loop
//WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
class NaturalNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number upto where we have to print natural numbers");
      int num=sc.nextInt();
      int i=1;
      int sum=0;
      while(i<=num)
        {
          //System.out.println(i);
          sum=sum+i;
          i++;
        }
      System.out.println("sum of "+num+" natural numbers is:"+sum);
    }
  }