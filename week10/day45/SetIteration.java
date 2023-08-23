/*Set Iteration:
Create a HashSet of country names.
Use an iterator to loop through the set and print each country name.
Modify the loop to print the countries in reverse order.*/
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
import java.util.ListIterator;
class SetIteration
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      HashSet<String> hs=new HashSet<String>();
      System.out.println("enter how many country names you want to store");
    int length=sc.nextInt();
    System.out.println("enter countries names");
      for(int i=0;i<length;i++)
        {
          String value=sc.next();
          hs.add(value);
        }
      LinkedList<String> ls=new LinkedList<String>(hs);
      Iterator itr=ls.iterator();
      System.out.println("Countries names");
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
      System.out.println("Countries names in reverse order");
      /*ListIterator itr1=ls.listIterator();
     while(itr1.hasPrevious())
        {
          System.out.println(itr1.previous());
        }*/
      for(int i=(ls.size()-1);i>=0;i--)
        {
          System.out.println(ls.get(i));
        }
      /*Collections.reverse(ls);
      System.out.println(ls);*/
    }
  }