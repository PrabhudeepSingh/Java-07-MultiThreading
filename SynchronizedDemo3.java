class Display
{
  public  void wish(String name)
  {
     synchronized(this)
     {
       for(int i=0;i<10;i++)
       {
         System.out.println("good morning");
         try
         {
           Thread.sleep(2000);
         }
         catch(InterruptedException e){}
         System.out.println(name);
       }
     }
   }
}


class MyThread extends Thread
{
   Display d;
   String name;
   MyThread(Display d,String name)
   {
     this.d=d;
     this.name=name;
   }
   public void run()
   {
      d.wish(name);
   }
}

public class SynchronizedDemo2
{
  public static void main(String[] args)
  {
    Display d=new Display();
    MyThread thread1=new MyThread(d,"dhoni");
    MyThread thread2=new MyThread(d,"yuvraj");
    thread1.start();
    thread2.start();
  }
}
    