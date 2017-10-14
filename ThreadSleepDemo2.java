class MyThread extends Thread
{
  public void run()
  {

    for(int i=0;i<1000;i++)
    {System.out.println("i am lazy thread"+i);}
     System.out.println("i am entered into sleeping state");

     try
     {Thread.sleep(2000);}
     catch(InterruptedException e)
     {System.out.println("i got interrupted");}

  }
}

class ThreadSleepDemo2
{
   public static void main(String[] args)
   {
      MyThread thread=new MyThread();
      thread.start();
      thread.interrupt();
      System.out.println("end of main thread");
   }
}