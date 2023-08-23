import java.util.*;
class ArrayList2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of elements ");
      int length=sc.nextInt();
      ArrayList<String> arr=new ArrayList<String>();
      System.out.println("enter the values");
      for(int i=0;i<length;i++)
        {
          String value=sc.next();
          arr.add(value);
        }
      arr.remove(1);
      System.out.println(arr);
      arr.set(1,"Vijayawada");
      System.out.println(arr);
      Collections.sort(arr);
      for(int i=0;i<arr.size();i++)
        {
          System.out.println(arr.get(i));
        }
      System.out.println("The value Vijayawada in the list:"+arr.contains("Vijayawada"));
      Iterator obj=arr.iterator();
      while(obj.hasNext())
        {
          System.out.println(obj.next());
        }
      
    }
  }