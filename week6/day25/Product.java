/*Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Product
  {
    String p_name;
    double p_price;
    String p_quantity;
    public Product(String name,double price,String quantity)
    {
      p_name=name;
      p_price=price;
      p_quantity=quantity;
    }
      public void display()
        {
        System.out.println("Name of the product is "+p_name);
        System.out.println("price of the product is "+p_price);
        System.out.println("quantity of the product is "+p_quantity);
        }
      public static void main(String args[])
        {
        Product product1=new Product("Sugar",50,"1kg");
        Product product2=new Product("Tea powder",10,"10gms");
        Product product3=new Product("Salt",20,"500gms");
        product1.display();
        product2.display();
        product3.display();
        }
    }
