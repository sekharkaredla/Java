class Test extends Thread
{
	String s;
	Test(String p)
	{
		s=p;
	}
	public void run()
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
class Unsyn_small 
{
	public static void main(String args[])
	{
	Test o1=new Test("Hello");
	Test o2=new Test("Hi");
	Test o3=new Test("Hey");
	o1.start();
	o2.start();
	o3.start();
	}
}