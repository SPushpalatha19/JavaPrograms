/*Input Format    (check how many 1000,500 and 100 notes in the given amount)
4500
Entered amount should be positive and only Integers.
  Sample Input 0:
4600
Sample Output 0:
5
Sample Input 1:
950
Sample Output 1:
Entered Amount must be multiples of 100*/
import java.util.Scanner;
class Notes
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the amount");
      int amount=sc.nextInt();
      int tho_notes=0,fhun_notes=0,hun_notes=0;
      if(amount%100==0)
      {
        while(amount>0)
          {
        if(amount>=1000)
          {
         tho_notes=amount/1000;
           amount=amount%1000;
            }
       else if(amount>=500&&amount<1000)
          {
         fhun_notes=amount/500;
           amount=amount%500; 
         }
        else
          {
         hun_notes=amount/100;
           amount=amount%100; 
         }
          }
        System.out.println("total number of minimum notes are "+(tho_notes+fhun_notes+hun_notes));
      }
      else
      {
        System.out.println("Entered Amount must be multiples of 100");
      }
      }
    }
  