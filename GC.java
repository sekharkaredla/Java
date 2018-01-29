class Gc
{
	int z;
	Gc(int i)
	{
	z=i;
	}
	protected void finalise()
	{
	System.out.println("GC called");
	}
	void gen(int x)
	{
	Gc obj;
	for(int i=0;i<x;i++)
	obj=new Gc(i);
	}
	public static void main(String args[])
	{
		Gc obj1=new Gc(5);
		obj1.gen(1000000000);
	}
}