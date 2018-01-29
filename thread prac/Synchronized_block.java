class Callme
{
	/*synchronized*/ void call(String s)
	{
	System.out.println();
	System.out.print("["+s);
	try
	{
	Thread.sleep(1000);
	}
	catch(InterruptedException e)
	{
	System.out.println(e.getMessage());
	}
	System.out.print("]");
	}
}
class Caller implements Runnable
{
	String m;
	Thread t;
	Callme obj;
	Caller(Callme test,String s)
	{
	m=s;
	obj=test;
	t=new Thread(this);
	t.start();
	}
	public void run()
	{
	synchronized(obj)
	{
	obj.call(m);
	}
	}
}
class Synchronized_block 
{
	public static void main(String args[])
	{
	Callme obj=new Callme();
	Caller obj1=new Caller(obj,"HELLO");
	Caller obj2=new Caller(obj,"HI");
	Caller obj3=new Caller(obj,"HEY");
	try
	{
	obj1.t.join();
	obj2.t.join();
	obj3.t.join();
	}
	catch(InterruptedException e)
	{
	System.out.println(e.getMessage());
	}
	}
}	