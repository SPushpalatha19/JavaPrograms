import java.util.*;
class ArrayList1
  {
    public static void main(String args[])
    {
      ArrayList<String> list1=new ArrayList<String>();
      list1.add("Pushpa");
      list1.add("Latha");
      list1.add("Santati");
      System.out.println(list1);
      list1.remove("Santati");
      System.out.println(list1);
      list1.add(2,"Bitlabs");
      System.out.println(list1);
      list1.set(1,"Tekworks");
      System.out.println(list1);
      System.out.println("The size of an array list is "+list1.size());
      System.out.println("After sorting");
      Collections.sort(list1);
      Iterator itr=list1.iterator();
      while(itr.hasNext())
        {
      System.out.println(itr.next());
        }
    }
  }