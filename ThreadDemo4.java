class MyThread extends Thread
{
  public void start()
  {System.out.println("start method");}

  public void run()
  {System.out.println("run method");}
}

public class ThreadDemo4
{
  public static void main(String[] args)
  {
    MyThread thread=new MyThread();
    thread.start();
    System.out.println("main method");
  }
}
//It is not recommended to override start() otherwise don'thread go for multithreading concept