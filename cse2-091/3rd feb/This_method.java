class This_method
{
	int x,y;
	This_method()
	{
	System.out.println("Constructor 1");
	}
	This_method(int p)
	{
	this();
	x=p;
	System.out.println("Constructor 2 x:"+x);
	}
	This_method(int p,int q)
	{
	this(p);
	y=q;
	System.out.println("Constructor 3 x:"+x+" y:"+y);
	}
	public static void main(String args[])
	{
	This_method obj=new This_method(5,10);
	}
}
	