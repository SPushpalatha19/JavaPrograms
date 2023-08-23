import java.util.*;
class VectorOperations
  {
    public static void main(String args[])
    {
      //Scanner sc=new Scanner(System.in);
      Vector<Integer> arr=new Vector<Integer>();
      arr.add(78);
      arr.add(9);
      arr.add(89);
      arr.add(10);
      arr.add(1);
      System.out.println(arr);
      arr.remove(2);
      arr.set(2,100);
      System.out.println(arr);
      System.out.println(" 100 is present in the given list: "+arr.contains(100));
      Collections.sort(arr);
      System.out.println("After sorting");
      Iterator itr=arr.iterator();
      while(itr.hasNext())
        {
         System.out.println(itr.next()); 
        }
      arr.clear();
      for(int obj:arr)
        {
          System.out.println(obj);
        }
    }
  }