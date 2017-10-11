class SynchronizedDemo4
{
  public static void main(String[] args)throws Exception
  {
    MyThread s=new  MyThread();
    s.start();
    synchronized(s)
    {
      System.out.println("main thread calling wait method");
      s.wait();
      System.out.println("main thread got notification");
      System.out.println(s.total);
    }
  }
}

class  MyThread extends Thread
{
  int total=0;
  public void run()
  { 
    synchronized(this)
    {
      System.out.println("child thread starts calculation");
      for(int i=1;i<=10;i++)
      {
        total=total+i;
      }
       System.out.println("child thread giving notification");
       this.notify();
    }
  }
}