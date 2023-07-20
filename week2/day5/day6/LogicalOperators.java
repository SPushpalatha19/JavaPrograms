class LogicalOperators
  {
    public static void main(String args[])
    {
      int a=4,b=5,c=10,d=4;
      System.out.println("((a<b)&&(a==c)) is "+((a<b)&&(a==c)));
      System.out.println("((a<b)&&(a==d)) is "+((a<b)&&(a==d)));
      System.out.println("((a<b)||(a==c)) is "+((a<b)||(a==c)));
      System.out.println("((a>b)||(a==c)) is "+((a>b)||(a==c)));
    }
  }