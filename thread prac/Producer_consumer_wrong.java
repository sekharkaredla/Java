class Q
{
	int n;
	synchronized void put(int x)
	{
	n=x;
	System.out.println("PUT : "+n);
	}
	synchronized int get()
	{
	System.out.println("GOT : "+n);
	return n;
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
class Producer_consumer_wrong 
{
	public static void main(String args[])
	{
	Q obj=new Q();
	Producer obj1=new Producer(obj);
	Consumer obj2=new Consumer(obj);
	}
}