class Armstrong_range
{
	static int armstrong(int x)
	{	
	int s=0;int r;int p=x;
	while(p!=0)
	{
	r=p%10;
	p=p/10;
	s=s+r*r*r;
	}
	if(s==x)
	return 1;
	else
	return 0;
	}
	public static void main(String args[])
	{
	int i;
	for(i=1;i<=1000000;i++)
	if(armstrong(i)==1)
	System.out.println(i);
	}
}