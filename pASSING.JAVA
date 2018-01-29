class Passing
{
	int a;
	void value(int b)
	{
		b=10;
		System.out.println("In value func , b: "+b);
		a=15;
	}
	static void reference(Passing obj)
	{
		obj.a=20;	
		
	}
	void display()
	{
	System.out.println("a: "+a);
	}
	public static void main(String args[])
	{
		Passing obj=new Passing();
		int b=2;
		obj.value(b);
		System.out.println("b in main :"+b);
		reference(obj);
		obj.display();
	}	
}