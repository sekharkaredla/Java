class producer extends Thread
{
	int s;
	public void run()
	{
	synchronized(this)
	{
	for(int i=0;i<5;i++)
	s+=i;
	}
	notifyAll();
	}
}
public class NotifyALL implements Runnable
{
	producer p;
	public static void main(String args[])
	{
		NotifyALL obj=new NotifyALL();
		obj.p=new producer();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
	}
	public void run()
	{
		synchronized(Thread.currentThread())
		{
		try
		{
		this.p.wait();
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		System.out.println(this.p.s);
		}
	}	
}	