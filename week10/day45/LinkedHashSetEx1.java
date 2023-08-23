import java.util.LinkedHashSet;
class LinkedHashSetEx1
  {
    public static void main(String args[])
    {
      LinkedHashSet<Integer> arr=new LinkedHashSet<Integer>();
      arr.add(10);
      arr.add(90);
      arr.add(10);
      arr.add(100);
      arr.add(null);
      arr.add(null);
      System.out.println(arr);
      //[10, 90, 100, null]
      //it doesnot allow duplicate values and more than one null value
      //it allows the insertion order while storing the data
      arr.remove(90);
      System.out.println(arr);
      Collections.sort(arr);
      //we can not use sort method
      //we can not perform operaions based on index positions
    }
  }