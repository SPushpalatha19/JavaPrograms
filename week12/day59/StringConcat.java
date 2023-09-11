class StringConcat
  {
    public static void main(String args[])
    {
      StringBuffer str=new StringBuffer("pushpa");
      String str1="latha";
      StringBuffer str2=str.append(str1);
      System.out.println(str);
      //System.out.println(str1);
    }
  }