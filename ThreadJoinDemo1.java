class MyThread extends Thread
{
  public void run()
  {
    for(int i=0;i<10;i++)
    {
      System.out.println("child thread");
      try{Thread.sleep(1000);}
      catch(InterruptedException e){}
    }
  }
}

public class ThreadJoinDemo1
{
  public static void main(String[] args) throws InterruptedException
  {
    MyThread thread=new MyThread();
    thread.setPriority(10);
    thread.start();
    thread.join();
    for(int i=0;i<10;i++)
    {System.out.println("main thread");}
  }
}