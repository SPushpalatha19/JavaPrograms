class One
  {
    void message()
    {
      System.out.println("Hi");
    }
  }
class Two
  {
    void messages()
    {
    }
  }
class Multiple extends One,Two
  {
    public static void main(String args[])
    {
      Multiple m=new Multiple();
      m.message();
    }
  }