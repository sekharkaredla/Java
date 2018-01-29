class Fibonacci
{
	void fibo(int a,int b)
	{
		int c=a+b;
		System.out.print(" "+c);
		if(c<100000)
		fibo(b,c);
		else
		return;
	}
	public static void main(String args[])
	{
	Fibonacci obj=new Fibonacci();
	System.out.print(" 0");
	System.out.print(" 1");
	obj.fibo(0,1);
	}
}