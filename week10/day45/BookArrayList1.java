import java.util.*;
class Book
  {
    int book_id;
    String book_title;
    String book_author;
    int pub_year;
    double price;
    Book(int book_id,String book_title,String book_author,int pub_year,double price)
    {
      this.book_id=book_id;
      this.book_title=book_title;
      this.book_author=book_author;
      this.pub_year=pub_year;
      this.price=price;
    }
    public String toString()
    {
      return (book_id+" "+book_title+" "+book_author+" "+pub_year+" "+price);
    }
  }
class BookArrayList1
  {
    public static void main(String args[])
    {
      ArrayList<Book> books=new ArrayList<Book>();
      Book book1=new Book(101,"Core java","John",2000,90);
      Book book2=new Book(102,"Python","Alia",2005,85);
      Book book3=new Book(103,"Sql","Agarwal",2010,90);
      Book book4=new Book(104,"Html","Sania",2012,100);
      Book book5=new Book(105,"DBMS","Peter",2009,90);
      books.add(book1);
      books.add(book2);
      books.add(book3);
      books.add(book4);
      books.add(book5);
      for(Book book:books)
        {
          System.out.println(book);
        }
      
    }
  }