class MyThread extends Thread
{
  public void run()
  {
    for(int i=0;i<10;i++)
    {
       System.out.println("Child Thread");
	   
       try
       {
         Thread.sleep(2000);
       }
       catch(InterruptedException e)
	   {
		   
	   }
    }
  }
}

class DaemonThreadDemo
{
  public static void main(String[] args)
  {
    MyThread thread= new MyThread();
    thread.setDaemon(true);
    thread.start();
    System.out.println("End of main thread");
  }
}
  