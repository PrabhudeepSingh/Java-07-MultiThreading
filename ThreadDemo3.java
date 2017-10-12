class MyThread extends Thread
{
}

public class ThreadDemo3
{
  public static void main(String[] args)
  {
    MyThread t=new MyThread();
    t.start();
  }
}