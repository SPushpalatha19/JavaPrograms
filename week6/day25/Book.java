/*Create a class called "Book" with instance variables for storing the book title, author, and publication year. Implement a method named initializeBook that takes arguments for each variable and initializes the object. Display the details of the book using a separate method.*/
class Book {
  String title;
  String author;
  int publication_year;

  public static void main(String args[]) {
    Book book1 = new Book();
    Book book2 = new Book();
    Book book3 = new Book();
    book1.initializeBook("Java", "John", 1998);
    book2.initializeBook("Python", "Ibrahim", 2003);
    book3.initializeBook("SQL", "James", 2000);
    book1.display();
    book2.display();
    book3.display();
  }

  public void initializeBook(String t, String a, int d) {
    title = t;
    author = a;
    publication_year = d;
  }

  public void display() {
    System.out.println("The title of the book is " + title);
    System.out.println("author of the book is " + author);
    System.out.println("Publishing year of the book is " + publication_year);
  }
}