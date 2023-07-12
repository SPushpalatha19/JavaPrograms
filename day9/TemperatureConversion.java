import java.util.Scanner;
class TemperatureConversion
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter c or f to convert the temperature");
      char var=sc.next().charAt(0);
      if((var=='c'||var=='C'))
      {
        System.out.println("Enter the temperature in celcius");
      double celcius=sc.nextDouble();
       double fahrenheit = (celcius*1.8) + 32;
        System.out.println("Converted temperature in fahrenheit is "+fahrenheit);
      }
      else if((var=='f'||var=='F'))
      {
        System.out.println("Enter the temperature in fahrenheit");
        double fahrenheit=sc.nextDouble();
        double celcius= (fahrenheit - 32) * 5/9;
        System.out.println("Converted temperature in celcius is "+celcius);
      }
       else 
      {
        System.out.println("Enter correct option to covert the temperature");
      }
    }
  }
      
        
  