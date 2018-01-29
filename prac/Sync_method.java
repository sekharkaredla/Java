class Display
{
	synchronized void show(String s)
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
class Test implements Runnable
{
	Display d;
	Thread t;
	String m;
	Test(Display d1,String s)
	{
	d=d1;
	t=new Thread(this);
	m=s;
	t.start();
	}
	public void run()
	{
	d.show(m);
	}
}
class Sync_method 
{
	public static void main(String args[])
	{
	Display d=new Display();
	Test o1=new Test(d,"Hello");
	Test o2=new Test(d,"Hi");
	Test o3=new Test(d,"Hey");
	}
}