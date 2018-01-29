class Test extends Thread
{
	public void run()
	{
	for(int i=0;i<5
;i++)
	{
	System.out.println(Thread.currentThread().getName()+" " +i);
	}
	}
}
class Join_test
{
	public static void main(String args[])
	{
	Test obj1=new Test();
	Test obj2=new Test();
	obj1.setName("Thread1");
	obj2.setName("Thread2");

	try
	{
	obj1.start();
	obj1.join();
	obj2.start();
	obj2.join();
	}
	catch(InterruptedException ie)
	{
	System.out.println(ie.getMessage());
	}
	}
}
