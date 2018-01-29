class Garbage_Collector
{
	int x;
	Garbage_Collector b;
	Garbage_Collector(int y)
	{
	x=y;
	}
	protected void finalize()
	{
	System.out.println("GC destroyed "+x);
	}
	void genObj(int P)
	{
	for(int i=0;i<P;i++)
	b=new Garbage_Collector(i);
	}
	public static void main(String args[])
	{
	Garbage_Collector obj=new Garbage_Collector(10);
	obj.genObj(100000000);
	}
}