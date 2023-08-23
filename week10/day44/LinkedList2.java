//Using addAll(),removeAll() and retainAll() methods
import java.util.*;
class LinkedList2
  {
    public static void main(String args[])
    {
      ArrayList<String> arr1=new ArrayList<String>();
      arr1.add("TCS");
      arr1.add("Infosys");
      arr1.add("Bitlabs");
      LinkedList<String> arr2=new LinkedList<String>();
      arr2.add("Bitlabs");
      arr2.add("Wipro");
      //System.out.println(arr2);
     // arr2.addAll(arr1);
      //System.out.println(arr2);
      arr2.removeAll(arr1);
      System.out.println(arr2);
      //arr2.retainAll(arr1);
      //System.out.println(arr2);
    }
  }