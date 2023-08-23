import java.util.ArrayList;
import java.util.Scanner;
class Book
  {
    int bookId;
    String bookTitle;
    String bookAuthor;
    int pubYear;
    double price;
  Book(int bookId,String bookTitle,String bookAuthor,int pubYear,double price)
  {
  this.bookId=bookId;
  this.bookTitle=bookTitle;
  this.bookAuthor=bookAuthor;
  this.pubYear=pubYear;
  this.price=price;
  }
public String toString()
  {
  return (bookId+" "+bookTitle+" "+bookAuthor+" "+pubYear+" "+price);
  }
}
class BookArrayList2
  {
   public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayList<Book> arr=new ArrayList<Book>();
      System.out.println("enter how many books details you want to store");
      int count=sc.nextInt();
      for(int i=0;i<count;i++)
        {
          System.out.println("enter book"+(i+1)+" details");
          System.out.println("enter book id");
          int id=sc.nextInt();
          System.out.println("enter book title");
        String title=sc.next();
        System.out.println("enter author name");
          String author=sc.next();
          System.out.println("enter book publication year");
          int year=sc.nextInt();
          System.out.println("enter the price");
          double price=sc.nextDouble();
          Book book=new Book(id,title,author,year,price);
          arr.add(book);
        }
      System.out.println("Total book details");
      for(Book data:arr)
        {
          System.out.println(data);
        }
    }
  }