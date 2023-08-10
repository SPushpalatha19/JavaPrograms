//creating thread using runnable interface
class MyThread implements Runnable
  {
    public void run()
    {
      for(int i=0;i<=10;i++)
        {
          if(i%2==0){
          if(i==6)
          {
            continue;
          }
          else{
          System.out.println(i+" "+Thread.currentThread().getId());
          }
        }
          else{
            continue;
          }
        }
    }
  }
class ThreadCreation2
  {
    public static void main(String args[])
    {
      MyThread mythread1=new MyThread();
      MyThread mythread2=new MyThread();
      MyThread mythread3=new MyThread();
      Thread thread1=new Thread(mythread1);
      Thread thread2=new Thread(mythread2);
      Thread thread3=new Thread(mythread3);
       thread1.start();
      thread2.start();
      thread3.start();
    }
  }