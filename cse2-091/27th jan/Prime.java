class Prime
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
	Prime obj=new Prime();
	if(obj.prime(57131)==1)
	System.out.println("Prime");
	else
	System.out.println("Not Prime");
	}
}