import java.util.HashMap;
import java.util.Map;
class HashMapEx1
  {
    public static void main(String args[])
    {
      HashMap<String,String> hm=new HashMap<String,String>();
      hm.put("Hi","Bitlabs");
      hm.put("Hello","Tekworks");
      hm.put("Java","Bitlabs");
      for(Map.Entry<String,String> entry:hm.entrySet())
        {
          System.out.println(entry.getKey()+" "+entry.getValue());
        }
      //hm.put("Hi","Good morning");
      //If we are trying to give any duplicate key then the previous key,value pair will be replace by new key,value pair
      //System.out.println(hm);
      hm.remove("Hello");
      //we can remove the key,value pairs by using key value only 
      for(Map.Entry<String,String> entry:hm.entrySet())
        {
          System.out.println(entry.getKey()+" "+entry.getValue());
        }
      System.out.println("map contains Hi key: "+hm.containsKey("Hi"));
      System.out.println("map contains Bilabs value: "+hm.containsValue("Bitlabs"));
      System.out.println("map contains Hello key: "+hm.containsKey("Hello"));
    }
  }