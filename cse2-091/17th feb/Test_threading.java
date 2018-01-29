class TestThread extends Thread
{
	public void run()
	{
	for(int i=0;i<1000;i++)
	{
	System.out.println("From Thread "+i);
	}
	}
}
class Test_threading
{
	public static void main(String args[])
	{
	TestThread obj=new TestThread();
	obj.start();
	for(int i=0;i<1000;i++)
	System.out.println("From main "+i);
	}
}