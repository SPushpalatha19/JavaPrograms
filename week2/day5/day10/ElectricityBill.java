import java.util.Scanner;
class ElectricityBill
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the past units");
      int past=sc.nextInt();
      System.out.println("Enter the present units");
      int present=sc.nextInt();
      int total_units=present-past;
      System.out.println("Total number of units are "+total_units);
      if(total_units<=50)
      {
       double cost=(total_units*0.50);
       double GST=(cost*20)/100;
       double bill=cost+GST;
        System.out.println("Electricity bill is "+bill);
      }
      else if((total_units>50)&&(total_units<=150))
      {
        double cost=(50*0.50)+((total_units-50)*0.75);
        double GST=(cost*20)/100;
        double bill=cost+GST;
        System.out.println("Electricity bill is "+bill);
      }
      else if((total_units>150)&&(total_units<=250))
      {
        double cost=(50*0.50)+(100*0.75)+((total_units-150)*1.20);
        double GST=(cost*20)/100;
        double bill=cost+GST;
        System.out.println("Electricity bill is "+bill);
      }
      else 
      {
        double cost=(50*0.50)+(100*0.75)+(100*1.20)+((total_units-250)*1.50);
        double GST=(cost*20)/100;
        double bill=cost+GST;
        System.out.println("Electricity bill is "+bill);
      }
    }
