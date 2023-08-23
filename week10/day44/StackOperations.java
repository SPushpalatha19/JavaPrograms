import java.util.*;
class StackOperations
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of elements");
      int length=sc.nextInt();
      Stack<Integer> arr=new Stack<Integer>();
      System.out.println("enter the elements into the stack");
      for(int i=0;i<length;i++)
        {
          int value=sc.nextInt();
          arr.push(value);
        }
      System.out.println("Elements are");
      for(Integer obj:arr)
        {
          System.out.println(obj);
        }
      arr.pop();
      System.out.println(arr);
      arr.set(1,100);
      System.out.println(arr);
      Collections.sort(arr);
      Iterator itr=arr.iterator();
      while(itr.hasNext())
        {
          System.out.println(itr.next());
        }
    }
  }