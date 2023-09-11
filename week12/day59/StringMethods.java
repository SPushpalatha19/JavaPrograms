class StringMethods
  {
    public static void main(String args[])
    {
      String str1=new String("Pushpa");
      String s1="Pushpa";
      String str2="latha";
      System.out.println("The size of the str1 is:"+str1.length());
      System.out.println("Character in the 3rd position of str2: "+str2.charAt(3));
      System.out.println("str1 starts with P :"+str1.startsWith("P"));
      System.out.println("str2 starts with P :"+str2.startsWith("P"));
       System.out.println("str2 ends with a :"+str2.endsWith("a"));
      String str=str1.substring(1,4);
      System.out.println(str);
      String s=str2.substring(2);
      System.out.println(s);
      System.out.println(str1.toUpperCase());
      System.out.println(str2.toLowerCase());
      String st1=str1.concat(str2);
      System.out.println(st1);
      System.out.println("str1 contains a :"+str1.contains("a"));
      System.out.println("str2 contains la:"+str2.contains("la"));
      System.out.println("st1 contains str2:"+st1.contains(str2));
      System.out.println("str1 is equals with s1:"+str1.equals(s1));//true
      System.out.println("str1==s1:"+str1==s1);//false
      System.out.println("str2 is equals ignore case with LATHA:"+str2.equalsIgnoreCase("LATHA"));//true
      String s2="";
      System.out.println(s2);
      System.out.println("s2 is empty:"+s2.isEmpty()); //true
      System.out.println("str2 is empty:"+str2.isEmpty()); //false
    }
  }