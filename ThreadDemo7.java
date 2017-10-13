class MyThread extends Thread 
{
  public void run()
  {
    System.out.println("child thread");
  }
}

class ThreadDemo7
{
  public static void main(String[] args)
  { 
     MyThread thread =new MyThread();
     Thread thread1=new Thread(thread);
     thread1.start();
     System.out.println("main thread");
  }
}