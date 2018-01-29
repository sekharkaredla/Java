class Test extends Thread
{
	String s;
	Test(String p)
	{
		s=p;
	}
	public void run()
	{
	display();
	}
	synchronized void  display()
	{
	System.out.print("["+s);
	try
	{
	Thread.sleep(500);
	}
	catch(InterruptedException e)
	{
	System.out.println(e.getMessage());
	}
	System.out.println("]");
	}
}
class Sync_method 
{
	public static void main(String args[])
	{	
	Test o1=new Test("Hello");
	Test o2=new Test("Hi");
	Test o3=new Test("Hey");
	try
	{
	o1.start();
	o1.join();
	o2.start();
	o2.join();
	o3.start();
	o3.join();
	}
	catch(InterruptedException e)
	{
	System.out.println(e.getMessage());
	}
	}
}