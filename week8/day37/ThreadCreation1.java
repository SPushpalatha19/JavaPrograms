//creating threads using thread class
class MyThread extends Thread
  {
   /* public void run()
    {
      System.out.println("This is the thread creation using thread class");
    }*/
    public void run()
    {
      for(int i=0;i<=10;i++)
        {
          System.out.println(i+" "+Thread.currentThread().getId());
        }
    }
  }
class ThreadCreation1
  {
    public static void main(String args[])
    {
      MyThread thread1=new MyThread();
      MyThread thread2=new MyThread();
      thread1.start();
      thread2.start();
    }
  }