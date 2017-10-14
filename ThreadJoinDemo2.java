 class MyThread extends Thread
{
  static Thread mt;
  public void run()
  {
    try{mt.join();}
    catch(InterruptedException e){}
    for(int i=0;i<10;i++)
    {System.out.println("child thread");}
  }
}

public class ThreadJoinDemo2
{
  public static void main(String[] args) throws InterruptedException
  {
    MyThread.mt=Thread.currentThread();
    
    MyThread thread=new MyThread();
    thread.start();
    
    for(int i=0;i<10;i++)
    {
		System.out.println("main thread");
		Thread.sleep(1000);
	}
  }
}