class Ovrld_constructor
{
	int x;
	Ovrld_constructor()
	{
	System.out.println("Constructor 1");
	}
	Ovrld_constructor(int p)
	{
	x=p;
	System.out.println("Constructor 2 x:"+x);
	}
	public static void main(String args[])
	{
	Ovrld_constructor obj=new Ovrld_constructor(5);
	}
}