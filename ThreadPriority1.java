class MyThread extends Thread
{ 
  
}

class ThreadPriority1
{
  public static void main(String[] args)
  {
    System.out.println(Thread.currentThread().getPriority());
    //Thread.currentThread().setPriority(15);   ->RE:java.lang.IllegalArgumentException

    Thread.currentThread().setPriority(7);
    MyThread thread=new MyThread();
    System.out.println(Thread.currentThread().getPriority());
  }
}