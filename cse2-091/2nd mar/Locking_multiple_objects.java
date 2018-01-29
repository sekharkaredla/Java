class Producer extends Thread
{
	int b;
	public void run()
	{
	System.out.println("Staring "+this.getName());
	synchronized(this)
	{
	for(int i=0;i<=20;i++)
	b+=i;
	System.out.println("Giving notify to all");
	notifyAll();
	}
	}
}
class Locking_multiple_objects implements Runnable
{
	Producer p;
	public static void main(String args[])
	{
	
	Locking_multiple_objects obj=new Locking_multiple_objects();
	obj.p=new Producer();
	obj.p.start();
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	Thread t3=new Thread(obj);
	t1.start();
	t2.start();
	t3.start();
	}
	public void run()
	{
		System.out.println("about to invoke wait");
		synchronized(p)
		{
		try
		{
		p.wait();
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		}
	System.out.println("Producer generated " +p.b);
	}
}