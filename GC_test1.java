class GC_test1
{
	String name;
	int sno;
	protected void finalise()
	{
		System.out.println(name+"  "+sno);
	}
	void set(String s,int sn)
	{
	name=s;
	sno=sn;
	}
	public static void main(String args[])
	{
		GC_test1 obj=new GC_test1();
		GC_test1 obj2=new GC_test1();
		obj2.set("RAM",04);
		GC_test1 obj3=new GC_test1();
		obj3.set("SHYAM",05);
		obj3=null;
		obj2=null;
	}
}
