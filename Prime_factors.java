class Prime_factors
{	
	int prime(int x)
	{
		int i;int flag=1;
		for(i=2;i<=(x/2);i++)
		{
			if(x%i==0)
			{
				flag=0;
				return flag;
			}
		}
		return flag;
	}
	public static void main(String args[])
	{
	Prime_factors obj=new Prime_factors();
	int i;int x=69;
	for(i=2;i<=(x/2);i++)
	{
		if(x%i==0&&obj.prime(i)==1)
		System.out.println(" "+i);
	}
	}
}