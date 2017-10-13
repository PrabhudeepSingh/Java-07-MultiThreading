class MyThread extends Thread
{
	
}

class ThreadDemo8
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		MyThread thread=new MyThread();
		
		System.out.println(thread.getName());
		Thread.currentThread().setName("Prabhu");
		System.out.println(Thread.currentThread().getName());
	}
}