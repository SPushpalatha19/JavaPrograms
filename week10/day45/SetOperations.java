/*Set Operations:
Create two sets: set1 and set2, and add some elements to each.
Find and print the union of the two sets.
Find and print the intersection of the two sets.
Find and print the elements that are unique to each set (i.e., not in the other set).*/
import java.util.HashSet;
import java.util.Scanner;
class SetOperations
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      HashSet set1=new HashSet();
      HashSet set2=new HashSet();
      set1.add(5);
      set1.add(10);
      set1.add(15);
      set1.add(20);
      set1.add(25);
      set2.add(30);
      set2.add(25);
      set2.add(20);
      set2.add(40);
     /* set1.addAll(set2);
      System.out.println("Union of the two sets is "+set1);*/
      /*set1.removeAll(set2);
      System.out.println("Unique elements in the set1 "+set1);*/
     /* set2.removeAll(set1);
      System.out.println("Unique elements in the set2 "+set2);*/
      set1.retainAll(set2);
      System.out.println("intersection of the two sets is "+set1);
    }
  }