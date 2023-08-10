//using sleep and join methods.
class MyThread implements Runnable
{
    public void run()
  {
      for(int i=0;i<=5;i++)
        {
          System.out.println(i+" Id is "+Thread.currentThread().getId());
         /* try
            {

         Thread.sleep(1000);

           }

         catch(Exception e)

           {

             System.out.println(e);

           }*/

       }

    }

  }

class Sample

  {

    public static void main(String args[])

    {

      MyThread mythread=new MyThread();

      MyThread mythread1=new MyThread();

      Thread thread=new Thread(mythread);

      Thread thread1=new Thread(mythread1);

      thread.start();

    try

        {

      thread.join();

        }

      catch(Exception e)

        {

          System.out.println(e);

        }

      thread1.start();

    }

  }