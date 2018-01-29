class Account 
{
	int bal=100;
	int getBal()
	{
	return bal;
	}
	void withdraw(int amt)
	{
	bal-=amt;
	}
}
class Test_Async implements Runnable
{
	Account ac=new Account();
	public static void main(String args[])
	{
	Test_Async obj=new Test_Async();
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	t1.setName("PERSON 1");
	t2.setName("PERSON 2");
	t1.start();
	t2.start();
	}
	public void run()
	{
	for(int i=0;i<5;i++)
	{
	try
	{
	Thread.sleep(500);
	}
	catch(Exception e)
	{}
	makeWithdraw(20);
	if(ac.getBal()<0)
	System.out.println("Account overdrawn");
	}
	}
	synchronized void makeWithdraw(int amt)
	{
	System.out.println(Thread.currentThread().getName()+" trying to withdraw");
	if(ac.getBal()>=amt)
	{
	try
	{
	Thread.sleep(500);
	}
	catch(Exception e)
	{}
	System.out.println(Thread.currentThread().getName()+" successfully withdraws");
	ac.withdraw(amt);
	}
	else
	{
	System.out.println(Thread.currentThread().getName()+" no money to withdraw");
	}
	}
}