class Fibonacci
{
	void fibo(int a,int b)
	{
		int c=a+b;
		if(c<1000000)
		{
		System.out.print(" "+c);
		fibo(b,c);
		}
	}
	public static void main(String args[])
	{
	Fibonacci obj=new Fibonacci();
	System.out.print("0");
	System.out.print(" 1");
	obj.fibo(0,1);
	}
}