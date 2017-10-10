class MyThread extends Thread
{
	
}
public class DaemonExample
{
  public static void main(String[] args)
  {
     System.out.println(Thread.currentThread().isDaemon());
     // Thread.currentThread().setDaemon(true);   -> RE:java.lang.IllegalThreadStateException

     MyThread thread= new MyThread();
     System.out.println(thread.isDaemon());
     thread.setDaemon(true);
     System.out.println(thread.isDaemon());
   }
}