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
class Test implements Runnable
{
	 Producer p;
	public static void main(String args[])
	{
		Test o=new Test();
		o.p=new Producer();
		synchronized(o.p)
		{
		o.p.start();	
		try
		{
		o.p.wait();
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		}
		Thread t1=new Thread(o);
		Thread t2=new Thread(o);
		Thread t3=new Thread(o);
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
		