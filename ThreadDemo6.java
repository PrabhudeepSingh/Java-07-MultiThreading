class MyRunnable implements Runnable
{
  public void run()
  {
    for(int i=0;i<10;i++)
    {System.out.println("child thread");}
  }
}

public class ThreadDemo6
{
  public static void main(String[] args)
  {
    MyRunnable r=new MyRunnable();
    Thread thread=new Thread(r);
    thread.start();
    for(int i=0;i<10;i++)
    {
		System.out.println("main thread");
	}
  }
}