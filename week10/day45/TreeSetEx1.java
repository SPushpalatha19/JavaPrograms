import java.util.TreeSet;
class TreeSetEx1
  {
    public static void main(String args[])
    {
      TreeSet<Integer> arr=new TreeSet<Integer>();
      arr.add(100);
      arr.add(20);
      arr.add(30);
      arr.add(20);
      //arr.add(null);
      //arr.add(null);
      System.out.println(arr);
      //it does not allow null values and duplicate values
      //the data will be stored in a sorted order
      arr.remove(1);
      System.out.println(arr);
      //we can not perform any operations based on index positions
    }
  }
 