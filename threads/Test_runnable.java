class Test implements Runnable
{
	public void run()
	{
	for(int i=0;i<1000;i++)
	System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
class Test_runnable
{
	public static void main(String args[])
	{
	Test tt=new Test();
	Thread obj=new Thread(tt,"Thread1");
	obj.start();
	for(int i=0;i<1000;i++)
	System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
	