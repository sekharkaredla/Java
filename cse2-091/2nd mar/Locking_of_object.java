class producer extends Thread
{
	int b;
	public void run()
	{
		synchronized(this)
		{
		System.out.println("Executing thread");
		for(int i=0;i<=10;i++)
		b+=i;
		notify();
		}
	}
	
}
class Locking_of_object
{
	public static void main(String args[])
	{
		producer obj=new producer();
		obj.start();
		synchronized(obj)
		{
			try
			{
			System.out.println("sending wait to obj");
			obj.wait();
			}
			catch(InterruptedException e)
			{
			System.out.println(e.getMessage());
			}
		}
	System.out.println("sum is " +obj.b);
	}
}
