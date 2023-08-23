import java.util.*;
class ConversionExample1
  {
    public static void main(String args[])
    {
      ArrayList<String> arr=new ArrayList<String>();
      arr.add("Jasmine");
      arr.add("Sunflower");
      arr.add("Lilly");
      arr.add("Rose");
      System.out.println(arr);
      LinkedList<String> arr1=new LinkedList<String>(arr);
      System.out.println(arr1);
    }
  }