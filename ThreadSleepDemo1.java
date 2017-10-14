class MyThread extends Thread
{
  public void run()
  {
     try
     {
       for(int i=0;i<10;i++)
       {
          System.out.println("i am lazy thread");
          Thread.sleep(2000);
       }
     }
     catch(InterruptedException e)
     {
       System.out.println("i got interrupted");
     }
  }
}

class ThreadSleepDemo1
{
   public static void main(String[] args)
   {
      MyThread thread=new MyThread();
      thread.start();
      thread.interrupt();
      System.out.println("end of main thread");
   }
}