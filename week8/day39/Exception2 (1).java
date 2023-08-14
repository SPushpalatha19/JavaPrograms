class Exception2
  {
    public void test() throws ArithmeticException{
      int a=10,b=0;
      try{
        System.out.println(a/b);
      }
      catch(Exception e){
        System.out.println("Handled in method itself");
      }
    }
    public static void main(String args[]){
      try{
        new Exception2().test();
      }
      catch(ArithmeticException e){
        System.out.println("Handled in main method");
      }
    }
  }