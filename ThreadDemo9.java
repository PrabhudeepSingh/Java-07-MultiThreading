class MyThread extends Thread
{ 
  public void run()
  {
    System.out.println("run method executed by thread   "+Thread.currentThread().getName());
  }
}

class ThreadDemo9
{
  public static void main(String[] args)
  {
    MyThread thread=new MyThread();
    thread.start();
    System.out.println("main method executed by thread   "+Thread.currentThread().getName());
  }
}