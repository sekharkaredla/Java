class Producer extends Thread
{
	int sum;
	public void run()
	{
	synchronized(this)
	{	
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		for(int i=0;i<=10;i++)
		sum+=i;
		//notifyAll();
	}
	}
}
class Notify_all implements Runnable
{
	static Producer p;
	public static void main(String args[])
	{
		Notify_all obj=new Notify_all();
		p=new Producer();
		synchronized(p)
		{
		p.start();	
		try
		{
		p.wait();
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		}
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		t1.start();
		t2.start();
		t3.start();
	}
	public void run()
	{
		/*synchronized(p)
		{
			try
			{
			p.wait();
			}
			catch(InterruptedException e)
			{
			System.out.println(e.getMessage());
			}
		}*/
	System.out.println(p.sum);
	}
}
		