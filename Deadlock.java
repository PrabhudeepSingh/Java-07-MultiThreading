class One
{
  public synchronized void mth1(Two two)
  {
     System.out.println("Thread1 starts execution of mth1 method");
     try
	 {
		 Thread.sleep(2000);
	 }
     catch(InterruptedException e)
	 {
		 
	 }
	 
     System.out.println("Thread1 trying to call Two's last method");
     two.last();
  }
  
  public synchronized void last()
  {
    System.out.println("inside One, this is last method");
  }
} 

class Two 
{
  public synchronized void mth2(One one)
  {
     System.out.println("Thread2 starts execution of mth2 method");
     try
     {
       Thread.sleep(2000);
     }
     catch(InterruptedException e)
	 {
		 
	 }
	 
     System.out.println("Thread2 trying to call One's last method");
     one.last();
  }
  
  public synchronized void last()
  {
    System.out.println("inside Two, this is last method");
  }
}

public class Deadlock extends Thread
{
	
  One one=new One();
  Two two=new Two();
  
  public void mth()
  {
    this.start();
    one.mth1(two);//this line executed by main thread
  }
  
  public void run()
  {
    two.mth2(one);//this line is executed by child thread
  }
  
  public static void main(String[] args)
  {
    Deadlock deadLock= new Deadlock();
    deadLock.mth();
  }
}
     
      