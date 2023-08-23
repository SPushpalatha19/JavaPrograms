/*Create a HashSet and add the following elements to it: "apple," "banana," "cherry," "date," "fig."
Print the elements in the set.
Check if the set contains "banana."
Remove "cherry" from the set.
Print the size of the set.*/
import java.util.HashSet;
class HashSetEx1
  {
    public static void main(String args[])
    {
      HashSet<String> hs=new HashSet<String>();
      hs.add("apple");
      hs.add("banana");
      hs.add("cherry");
      hs.add("date");
      hs.add("fig");
      for(String obj:hs)
        {
          System.out.println(obj);
        }
      System.out.println("set contains banana: "+hs.contains("banana"));
      hs.remove("cherry");
      System.out.println(hs);
      System.out.println("The size of an array list is "+hs.size());
    }
  }