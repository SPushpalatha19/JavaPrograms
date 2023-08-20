import java.util.*;
class Queue{
    int [] queue;
    int size;
    int front;
    int rear;

    Queue(int s){
        queue=new int[s];
    }

    public void enQueue(int data){
        if(size==queue.length){
            System.out.println("queue is full: ");
        }
        else{
        queue[rear]=data;//queue[0]=10
        rear=rear+1; //queue[1]
        size=size+1;//1
       
        }

    }
    public void deQueue(){
        if(size<=0){//1<=0
            System.out.println("queue is empty: ");
        }
        else{
        System.out.println(queue[front]+" elment has been removed");//queue[0]
        front=front+1;
        size=size-1;//0
        }
    }
    public void show(){
        System.out.println("Elements in queue: ");
        for(int i=0;i<size;i++){
            System.out.println(queue[i]+" ");
        }
    }
    public void isEmpty(){
        if(size==0){
        System.out.println("queue is empty: ");
        }
        else{
            System.out.println("queue is not empty and the size is: "+size);
        }
    }

    public void isFull(){
        if(size==queue.length){
        System.out.println("queue is full: ");
        }
        else{
            System.out.println("queue is not full and the size is: "+size);
        }
}
}
class QueueOperations{
    public static void main(String [] args){
        Queue obj=new Queue(5);
       Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println(" 1.insert \n 2.remove \n 3.show \n 4.isEMpty \n 5.isfull  \n 6.exit");
        System.out.println("enter the choice");
        int option=sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("enter value");
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