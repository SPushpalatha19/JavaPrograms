import java.util.PriorityQueue;
class PriorityQueue1
  {
    public static void main(String args[])
    {
      PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
      PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
      pq.add(10);
      pq.add(20);
      pq.add(90);
      pq.add(10);
      //it allows duplicate values
     // pq.offer(null);
      //pq.add(null);
      //does not allows null values
      System.out.println(pq);
      pq.offer(78);
      System.out.println(pq);
     // System.out.println("removing element using remove(): "+pq.remove());
     // System.out.println("removing element using poll(): "+pq.poll());
      //System.out.println("removing element using remove(): "+pq1.remove());
     //System.out.println("removing element using poll(): "+pq1.poll());
      //System.out.println("retrieving element using element(): "+pq.element());
      //System.out.println("retrieving element using peek(): "+pq.peek());
     // System.out.println("retrieving element using element(): "+pq1.element());
      System.out.println("retrieving element using peek(): "+pq1.peek());
      
    }
  }