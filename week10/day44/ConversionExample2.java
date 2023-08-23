import java.util.*;
class ConversionExample2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Stack<Float> arr=new Stack<Float>();
      System.out.println("enter the size of list");
      int length=sc.nextInt();
      System.out.println("enter the elements");
      for(int i=0;i<length;i++)
        {
          float value=sc.nextFloat();
          arr.push(value);
        }
     // System.out.println(arr);
      ArrayList<Float> arr1=new ArrayList<Float>(arr);
      System.out.println(arr1);
    }
  }