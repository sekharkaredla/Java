class Palindrome_range
{
	static int palin(int x)
	{
		int r;int n=x;int p=0;
		while(n!=0)
		{
		r=n%10;
		n=n/10;
		p=p*10+r;
		}
		if(p==x)
		return 1;
		else
		return 0;
	}
	public static void main(String args[])
	{
	int i;
	for(i=10;i<=1000000;i++)
	{
		if(palin(i)==1)
		System.out.print(" "+i);
	}
	}
}	
	