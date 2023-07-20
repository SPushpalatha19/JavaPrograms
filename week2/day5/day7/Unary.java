class Unary
  {
    public static void main(String args[])
    {
      int x=10;
      int y=++x;
      System.out.println("y: "+y);
      y=x++;
     
      System.out.println("y: "+y);
      System.out.println("x: "+x);
    }
  }