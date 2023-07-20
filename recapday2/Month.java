//Write a Java program to find the number of days in a month.
import java.util.Scanner;
class Month
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter month");
      String month=sc.nextLine();
      switch(month)
        {
          case "jan":
            System.out.println("31 days");
            break;
            case "feb":
            System.out.println("28 days");
            break;
            case "march":
            System.out.println("31 days");
            break;
            case "april":
            System.out.println("30 days");
            break;
            case "may":
            System.out.println("31 days");
            break;
            case "june":
            System.out.println("30 days");
            break;
            case "july":
            System.out.println("31 days");
            break;
            case "aug":
            System.out.println("31 days");
            break;
            case "sep":
            System.out.println("30 days");
            break;
            case "oct":
            System.out.println("31 days");
            break;
            case "nov":
            System.out.println("30 days");
            break;
            case "dec":
            System.out.println("31 days");
            break;
          default:
            System.out.println("enter valid month");
        }
    }
  }