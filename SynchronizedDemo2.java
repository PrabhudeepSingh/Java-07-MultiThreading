class Display
{
    public synchronized void displayn()
    {
      for(int i=1;i<=10;i++)
      {
        System.out.println(i);
        try
        {
          Thread.sleep(2000);
        }
        catch(InterruptedException e){}
      }
    }

    public synchronized void displayc()
    {
      for(int i=65;i<=75;i++)
      {
        System.out.println((char)i);
        try
        {
          Thread.sleep(2000);
        }
        catch(InterruptedException e){}
      }
    }
}

class MyThread1 extends Thread
{
  Display d;
  MyThread1(Display d)
  {
     this.d=d;
  }
  public void run()
  {d.displayn();}
}

class MyThread2 extends Thread
{
  Display d;
  MyThread2(Display d)
  {
     this.d=d;
  }
  public void run()
  {d.displayc();}
}

public class SynchronizedDemo2
{
  public static void main(String[] args)
  {
     Display d=new Display();
     MyThread1 thread1=new MyThread1(d);
     MyThread2 thread2=new MyThread2(d);
     thread1.start();
     thread2.start();
  }
}