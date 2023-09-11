//WAP to find frequency of each digit in a given integer.
import java.util.Scanner;
class DigitFrequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int digit0=0,digit1=0,digit2=0,digit3=0,digit4=0,digit5=0,digit6=0,digit7=0,digit8=0,digit9=0;
     while(num>0)
       {
         int digit=num%10;
         switch(digit)
           {
           case 0:
             digit0++;
             break;
           case 1:
             digit1++;
             break;
           case 2:
             digit2++;
             break;
           case 3:
             digit3++;
             break;
           case 4:
             digit4++;
             break;
           case 5:
             digit5++;
             break;
           case 6:
             digit6++;
             break;
           case 7:
             digit7++;
             break;
           case 8:
             digit8++;
             break;
           case 9:
             digit9++;
             break;
           }
         num=num/10;
    }
      if(digit0>0)
      {
        System.out.println("0 occured:"+digit0);
      }
      if(digit1>0)
      {
        System.out.println("1 occured:"+digit1);
      }
      if(digit2>0)
      {
        System.out.println("2 occured:"+digit2);
      }
        if(digit3>0)
      {
        System.out.println("3 occured:"+digit3);
      }
        if(digit4>0)
      {
        System.out.println("4 occured:"+digit4);
      }
        if(digit5>0)
      {
        System.out.println("5 occured:"+digit5);
      }
        if(digit6>0)
      {
        System.out.println("6 occured:"+digit6);
      }
        if(digit7>0)
      {
        System.out.println("7 occured:"+digit7);
      }
      if(digit8>0)
      {
        System.out.println("8 occured:"+digit8);
      }
      if(digit9>0)
      {
        System.out.println("9 occured:"+digit9);
      }
  }
  }