class MyThread extends Thread
{
  public void run()
  {System.out.println("no-arg run");}

  public void run(int i)
  {System.out.println("int-arg run");}
}

public class ThreadDemo2
{
  public static void main(String[] args)
  {
    MyThread thread=new MyThread();
    thread.start();//Thread class start() can invoke no-arg run method the other overloaded methods we have to call explicitly
  }
}