class Test extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getName()+" "+i);
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{
		System.out.println(ie.getMessage());
		}
	}
	}
}
class Sleep_test
{
	public static void main(String args[])
	{
	Test obj=new Test();
	obj.setName("Test_thread");
	obj.start();
	}
}
	