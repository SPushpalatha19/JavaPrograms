import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class Books
  {
    int id;
    String title;
    String author;
    int quantity;
    Books(int id,String title,String author,int quantity)
    {
      this.id=id;
      this.title=title;
      this.author=author;
      this.quantity=quantity;
    }
    public String toString()
    {
     return (id+" "+title+" "+author+" "+quantity);
    }
  }
class BooksHashMap
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      HashMap<Integer,Books> hm=new HashMap<Integer,Books>();
      System.out.println("enter how many book details you want to store");
      int length=sc.nextInt();
      for(int i=0;i<length;i++)
        {
          System.out.println("enter book"+(i+1)+" details");
          System.out.println("enter id");
          int id=sc.nextInt();
          System.out.println("enter title");
          String title=sc.next();
          System.out.println("enter author name");
          String author=sc.next();
          System.out.println("enter quantity");
          int quantity=sc.nextInt();
          System.out.println("enter the unique key value for this book");
          int key=sc.nextInt();
          Books book=new Books(id,title,author,quantity);
          hm.put(key,book);
        }
      System.out.println("All the book details are");
      for(Map.Entry<Integer,Books> entry:hm.entrySet())
        {
          System.out.println(entry.getKey()+" "+entry.getValue());
        }
      
      
    }
  }