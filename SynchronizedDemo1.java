class Display
{
  public synchronized void wish(String name)
  {
     for(int i=0;i<10;i++)
     {
        System.out.println("Good Morning");
        try
        {
           Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.println(name);
     }
  }
}

class MyThread extends Thread
{
   Display display;
   String name;
   MyThread(Display display, String name)
   {
     this.display= display;
     this.name=name;
   }
   public void run()
   {
      display.wish(name);
   }
}

public class SynchronizedDemo1
{
  public static void main(String[] args)
  {
    Display  display= new Display();
    MyThread thread1= new MyThread(display, "Prabhudeep");
    MyThread thread2= new MyThread(display, "Singh");
    thread1.start();
    thread2.start();
  }
}
    