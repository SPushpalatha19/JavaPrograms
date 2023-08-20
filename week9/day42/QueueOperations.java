import java.util.Scanner;
class QueueOperations{
  int size;
  int front;
  int rear;
  int queueArray[];
  public QueueOperations(int s)
  {
     queueArray=new int[s];
  }
  public void enQueue(int value)
  {
    if(queueArray.length==size)
    {
      System.out.println("Queue is full. Can not insert the element");
    }
    else
    {
      queueArray[rear]=value;
      rear++;
      size++;
    }
  }
  public void deQueue()
  {
    if(size<=0)
    {
      System.out.println("Queue is empty. Can not delete the element");
    }
    else{
      System.out.println("Removed element is "+queueArray[front]);
      front++;
      size--;
    }
  }
  public void show()
  {
    System.out.println("Queue elements are");
    for(int i=0;i<queueArray.length;i++)
      {
        System.out.print(queueArray[i]+" ");
      }
    System.out.println();
  }
  public void isEmpty()
  {
    if(size==0)
    {
      System.out.println("queue is empty");
    }
    else{
      System.out.println("queue is not empty");
    }
  }
  public void isFull()
  {
    if(queueArray.length==size)
    {
      System.out.println("queue is full");
    }
    else{
      System.out.println("queue is not full");
    }
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    QueueOperations obj=new QueueOperations(sc.nextInt());
    do
      {
        System.out.println(" 1.insert \n 2.remove \n 3.show \n 4.isEmpty \n 5.isFull \n 6.exit");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              System.out.println("enter element to insert");
              int value=sc.nextInt();
              obj.enQueue(value);
              break;
            case 2:
              obj.deQueue();
              break;
            case 3:
              obj.show();
              break;
            case 4:
              obj.isEmpty();
              break;
            case 5:
              obj.isFull();
              break;
            case 6:
              System.exit(0);
              break;
          }
      }while(true);
  }
}