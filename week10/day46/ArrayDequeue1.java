import java.util.ArrayDeque;
class ArrayDequeue1
  {
    public static void main(String args[])
    {
      ArrayDeque<String> ad=new ArrayDeque<String>();
      ArrayDeque<String> ad1=new ArrayDeque<String>();
      ad.add("pushpa");
      ad.add("jyothi");
      ad.add("suhana");
      ad.add("null");
      ad.add("null");
      System.out.println(ad);
      ad.offer("latha");
      ad.offerFirst("raghu");
      ad.offerLast("ram");
      System.out.println(ad);
      //System.out.println(ad.remove());
     // System.out.println(ad1.remove());
     // System.out.println(ad.poll(););
     //System.out.println(ad1.poll());
     // System.out.println(ad.element());
      //System.out.println(ad.peek());
      //System.out.println(ad1.element());
     // System.out.println(ad1.peek());
      System.out.println(ad.peekFirst());
      System.out.println(ad.peekLast());
      System.out.println(ad1.peekFirst());
      System.out.println(ad1.peekLast());
      ad.clear();
      System.out.println(ad);
    }
  }