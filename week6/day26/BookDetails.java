//display the book details by initializing the object using instance variables through array of objects
import java.util.Scanner;
class BookDetails
  {
    int id;
    String title;
    String author;
    int year;
    public void display()
    {
      System.out.println("id of the book is "+id);
      System.out.println("title of the book is "+title);
      System.out.println("author of the book is "+author);
      System.out.println("publication year of the book is "+year);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of books");
      int count=sc.nextInt();
      BookDetails books[]=new BookDetails[count];
      for(int i=0;i<count;i++)
        {
          books[i]=new BookDetails();
          System.out.println("enter book"+(i+1)+" details");
          System.out.println("enter id of the book");
          books[i].id=sc.nextInt();
          System.out.println("enter title of the book");
          books[i].title=sc.nextLine();
          System.out.println("enter author of the book");
          books[i].author=sc.nextLine();
          System.out.println("enter year of the book");
          books[i].year=sc.nextInt();
        }
      for(int i=0;i<count;i++)
        {
          books[i].display();
        }
    }
  }