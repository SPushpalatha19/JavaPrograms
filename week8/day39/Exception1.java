class Exception1{
  public static void main(String args[])
  {
    try{
      throw new NullPointerException("Hello");
      System.out.println("A");
    }
    catch(ArithmeticException e){
      System.out.println("B");
    }
    }
  }
