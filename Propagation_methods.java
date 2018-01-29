class Propagation_methods
{
	void func1()
	{
	System.out.println("1");
	func2();
	System.out.println("2");
	}
	void func2()
	{
	System.out.println("3");
	func3();
	System.out.println("4");
	}
	void func3()
	{
	System.out.println("5");
	int a=10;int b=0;
	int c=a/b;
	System.out.println("6");
	}
	public static void main(String args[])
	{
	Propagation_methods obj=new Propagation_methods();
	try
	{
	obj.func1();
	}
	catch(ArithmeticException obj1)
	{
	System.out.println("In catch in main ");
	System.out.println(obj1.getMessage());
	}
	}
}