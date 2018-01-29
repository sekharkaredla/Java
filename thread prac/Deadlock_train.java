class Train
{
}
class Compartment
{
}
class Book extends Thread
{
	Train t;
	Compartment c;
	Book(Train t1,Compartment c1)
	{
	t=t1;
	c=c1;
	}
	 public void run()
	{
	System.out.println("booking started");
	synchronized(t)
	{
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		synchronized(c)
		{
			System.out.println("booking done");
		}
	}
	}
}
class Cancel extends Thread
{
	Train t;
	Compartment c;
	Cancel(Train t1,Compartment c1)
	{
	t=t1;
	c=c1;
	}
	 public void run()
	{
	System.out.println("Cancellation started");
	synchronized(c)
	{
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		synchronized(t)
		{
			System.out.println("Cancellation done");	
		}
	}
	}
}
class Deadlock_train
{
	public static void main(String args[])
	{
	Train obj1=new Train();
	Compartment obj2=new Compartment();
	Book ob=new Book(obj1,obj2);
	Cancel oc=new Cancel(obj1,obj2);
	ob.start();
	oc.start();
	}
}