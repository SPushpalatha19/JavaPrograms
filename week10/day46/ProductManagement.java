/*Scenario: Managing a Store's Products
As a store manager, you are responsible for managing all the operations related to the products in your store. You have a system that stores all the product details (product_id, name, category, price) in an ArrayList of Product objects.
Your task is to create a Java program that helps you manage the store efficiently.
Create a console-based menu-driven program that allows the user to perform the following operations:
1.Add products.
2.Calculate the total price of all products.
3.Remove a product by product_id.
4.Update the price of a product by product_id.
5.Search products by category.
6.Quit the program.
If no products are found for the given category, the program should provide an appropriate message indicating that no products were found.*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;
class NoProductFoundException extends ExceptionInInitializerError{
  NoProductFoundException(String message)
  {
    super(message);
  }
}
class Product
  {
    int pid;
    String pname;
    String pcategory;
    double pprice;
    Product(int pid,String pname,String pcategory,double price)
    {
      this.pid=pid;
      this.pname=pname;
      this.pcategory=pcategory;
      this.pprice=price;
    }
  }
class ProductManagement
  {
    ArrayList<Product> product=new ArrayList<Product>();
     Scanner sc=new Scanner(System.in);
   public void addProduct()
    {
      System.out.println("enter id of the product");
      int id=sc.nextInt();
      System.out.println("enter the name of the product");
      String name=sc.next();
      System.out.println("enter the category of the product");
      String category=sc.next();
      System.out.println("enter the price of the product");
      double price=sc.nextDouble();
      Product product1=new Product(id,name,category,price);
      product.add(product1);
      System.out.println("Product is added");
    }
    public void calculatePrice()
    {
      double totalPrice=0.0;
      for(Product value:product)
        {
          totalPrice=totalPrice+value.pprice;
        }
      System.out.println("Total price of the products is "+totalPrice);
    }
    public void removeProduct()
    {
      System.out.println("enter the product id which we have to remove");
        int id=sc.nextInt();
      int count=0;
     /* for(Product value:product)
        {
          if(value.pid==id)
          {
             product.remove(value);
          }
        }*/
      Iterator<Product> itr=product.iterator();
      while(itr.hasNext())
        {
        Product value=itr.next();
          if(value.pid==id)
          {
            itr.remove();
            count++;
            break;
          }
        }
      if(count==0){
        System.out.println("No such type of product");
      }
      else
      System.out.println("Product is removed");
    }
    public void updatePrice()
    {
      System.out.println("enter the product id for which we have to update the price");
              int id=sc.nextInt();
              System.out.println("enter the price to be updated");
              double price=sc.nextDouble();
      int count=0;
      for(Product value:product)
        {
          if(value.pid==id)
          {
            //product.set(price);
            value.pprice=price;
            count++;
          }
        }
      if(count==0)
      {
        System.out.println("No such type of product");
      }
      else
      System.out.println("Price updated");
    }
    public void searchProduct() throws NoProductFoundException
    {
      System.out.println("Enter the category type for displaying those category products");
        String category=sc.next();
     int count=0;
      for(Product value:product)
        {
          String data=value.pcategory;
          if(data.equals(category))
          {
            System.out.println(value.pid+" "+value.pname+" "+value.pcategory+" "+value.pprice);
            count++;
          }
        }
      if(count==0)
      {
        throw new NoProductFoundException("There is no such type of products related to this category");
        //System.out.println("No such type of category products");
      }
    }
    public void displayProducts()
    {
      System.out.println("All the products are");
      for(Product data:product)
        {
          System.out.println(data.pid+" "+data.pname+" "+data.pcategory+" "+data.pprice);
        }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ProductManagement pm=new ProductManagement();
      
      do{
        System.out.println(" 1.Adding the product \n 2.Calculating total price \n 3.Removing the product by using product id \n 4.Update the price of a product by using product id \n 5.Searching the product by using category \n 6.Displaying all product details \n 7.exit");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              System.out.println("enter the product details");
              pm.addProduct();
              break;
            case 2:
              pm.calculatePrice();
              break;
            case 3:
              pm.removeProduct();
              break;
            case 4:
              pm.updatePrice();
              break;
            case 5:
              try{
              pm.searchProduct();
              }
              catch(Exception e)
                {
                  System.out.println(e);
                }
              break;
            case 6:
              pm.displayProducts();
              break;
            case 7:
              System.exit(0);
              break;
            default:
              System.out.println("enter valid option");
          }
      }while(true);
    }
  }