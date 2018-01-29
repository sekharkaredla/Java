class Q
{
	int n;
	int flag=0;
	synchronized void put(int x)
	{
	while(flag==1)
	{
		try
		{
		wait();
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
	}
	n=x;
	flag=1;
	System.out.println("PUT : "+n);
	notify();
	}
	synchronized void get()
	{
	while(flag==0)
	{
		try
		{
		wait();
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
	}
	System.out.println("GOT : "+n);
	flag=0;
	notify();
	}
}
class Producer implements Runnable
{
	Q obj;
	Producer(Q test)
	{
	obj=test;
	new Thread(this).start();
	}
	public void run()
	{
	int i=0;
	while(true)
	{
	obj.put(++i);
	}
	}
	
}
class Consumer implements Runnable
{
	Q obj;
	Consumer(Q test)
	{
	obj=test;
	new Thread(this).start();
	}
	public void run()
	{
	while(true)
		{
		obj.get();
		}
	}
	
}
class Producer_consumer 
{
	public static void main(String args[])
	{
	Q obj=new Q();
	Producer obj1=new Producer(obj);
	Consumer obj2=new Consumer(obj);
	}
}