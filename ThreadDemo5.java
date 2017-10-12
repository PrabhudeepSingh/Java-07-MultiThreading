class MyThread extends Thread
{
  public void start()
  {
    super.start();
    System.out.println("start method");
  }

  public void run()
  {System.out.println("run method");}
}

public class ThreadDemo5
{
  public static void main(String[] args)
  {
    MyThread thread=new MyThread();
    thread.start();
    System.out.println("main method");
  }
}
