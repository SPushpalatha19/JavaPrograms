import java.util.Scanner;
public class PercentageExample
{
public static void main(String args[])
  {
    double percentage;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter physics marks");
    double physics=sc.nextDouble();
    System.out.println("Enter chemistry marks");
    double chemistry=sc.nextDouble();
    System.out.println("Enter maths marks");
    double maths=sc.nextDouble();
    System.out.println("Enter telugu marks");
    double telugu=sc.nextDouble();
    System.out.println("Enter english marks");
    double english=sc.nextDouble();
    double total_marks= 
(physics+chemistry+maths+telugu+english);
    System.out.println("Enter the Maximum_marks");
    double Maximum_marks=sc.nextDouble();
    percentage=(total_marks/Maximum_marks)*100;
    System.out.println("percentage is "+ percentage);
   }
}
  