//display the book details by initializing the object using constructor through array of objects
import java.util.Scanner;
class Books
  {
    String title;
    String author;
    int year;
    public Books(String t,String a,int y)
    {
      title=t;
      author=a;
      year=y;
    }
    public void display()
    {
      System.out.println(title+" "+author+" "+year);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter how many books");
      int count=sc.nextInt();
      Books books[]=new Books[count];
      for(int i=0;i<books.length;i++)
        {
          System.out.println("enter book"+(i+1)+"details");
          System.out.println("enter title of the book");
          String btitle=sc.nextLine();
          sc.nextLine();
          System.out.println("enter author name");
          String bauthor=sc.nextLine();
          System.out.println("enter year");
          int byear=sc.nextInt();
          books[i]=new Books(btitle,bauthor,byear);
        }
      for(int i=0;i<books.length;i++)
        {
          books[i].display();
        }
    }
                        
  }