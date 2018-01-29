class Test_thread extends Thread
{
	 public void run()
	{
	display();
	}
	synchronized void display()
	{
	for(int i=0;i<100;i++)
	System.out.println(Thread.currentThread().getName()+" " +i);
	}
}
public class TestThread 
{
	public static void main(String args[])
	{
	Test_thread obj=new Test_thread();
	obj.setName("Test_thread");
	synchronized(obj)
	{
	obj.start();
	}
	for(int i=0;i<100;i++)
	System.out.println(Thread.currentThread().getName()+" "+i);
	}
}