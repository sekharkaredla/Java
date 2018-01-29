class Sum_of_digits
{
	public static void main(String args[])
	{
		int a=10001;
		int r,s;
		s=0;
		while(a!=0)
		{
		r=a%10;
		s+=r;
		a=a/10;
		}
	System.out.println(s);
	}
}