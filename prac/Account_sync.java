class Account
{
	int bal=50;
	int getBal()
	{return bal;}
	void withdraw(int x)
	{bal=bal-x;}
}
public class Account_sync implements Runnable
{
	Account ac=new Account();
	public static void main(String args[])
	{
	Account_sync obj=new Account_sync();
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
		makeWithdraw(10);
		try
		{
		Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
		System.out.println(e.getMessage());
		}
		if(ac.getBal()<0)
		System.out.println("account overdrawn");
		}
	}
	synchronized void makeWithdraw(int amt)
	{
	System.out.println(Thread.currentThread().getName()+" is trying to withdraw");
	
	if(amt<=ac.getBal())
	{
	try
	{
	Thread.sleep(500);
	}
	catch(InterruptedException e)
	{
	System.out.println(e.getMessage());
	}
	ac.withdraw(amt);
	System.out.println(Thread.currentThread().getName()+" has successfully withdrawn");
	}
	else
	{
	System.out.println(Thread.currentThread().getName()+" "+ac.getBal()+" no money");
	}
	}
}