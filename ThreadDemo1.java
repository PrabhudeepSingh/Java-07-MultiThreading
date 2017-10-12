class MyThread extends Thread
{
  public void run()
  {
    for(int i=0;i<10;i++)
    {
		System.out.println("child thread");
	}
  }
}

public class ThreadDemo1
{
  public static void main(String[] args)
  {
    MyThread thread= new MyThread();
    thread.start();
    for(int i=0;i<10;i++)
    {
		System.out.println("main thread");
	}
  }
}