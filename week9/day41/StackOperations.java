import java.util.Scanner;
class StackOperations
  {
    int maxSize;
    int stackArray[];
    int top;
    public StackOperations(int size)
    {
     maxSize=size;
      stackArray=new int[maxSize];
      top=-1;
    }
    public void insert(int value)
    {
      if(top<=maxSize-1)
      {
        top++;//0
        stackArray[top]=value;//stackArray[0]=10
        System.out.println(value+" is pushed");
      }
      else{
        System.out.println("Stack is overflow. We can't push the value");
      }
    }
    public void remove()
    {
      if(top!=-1)
      {
        int poppedValue=stackArray[top];//10
        top--;
        System.out.println("popped value is "+poppedValue);
      }
      else{
        System.out.println("Stack is underflow. We can't remove the value");
      }
    }
    public void peek()
    {
      if(top>=0)
      {
        int peekValue=stackArray[top];
        System.out.println("Peek value is "+peekValue);
      }
      else{
        System.out.println("stack is empty");
      }
    }
    public void display()
    {
      if(top>0)
      {
        System.out.println("Elements in the stack are");
        for(int i=0;i<=top;i++)
          {
             System.out.print(stackArray[i]+" "); 
          }
        System.out.println();
      }
      else{
        System.out.println("stack is empty");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size");
      StackOperations obj=new StackOperations(sc.nextInt());
      do{
        System.out.println(" 1.Insert \n 2.Remove \n 3.peek \n 4.display \n 5.exit");
        System.out.println("enter your choice");
        int choice=sc.nextInt();
        switch(choice)
        {
          case 1:
            System.out.println("enter element to push");
            int value=sc.nextInt();
            obj.insert(value);
            break;
          case 2:
            obj.remove();
            break;
          case 3:
            obj.peek();
            break;
          case 4:
            obj.display();
            break;
          case 5:
            System.exit(0);
            break;
         }
      }while(true);
      
    }
  }