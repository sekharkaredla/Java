class A
{
	A()
	{
	System.out.println("Constructor A");
	}
	
}
class B extends A
{
	B()
	{
	System.out.println("Constructor B");
	}
}
class C extends A
{
	C()
	{
	System.out.println("Constructor C");
	}
}
public class hybrid extends C
{
	hybrid()
	{
	System.out.println("Constructor hybrid");
	}
	public static void main(String args[])
	{
	B obj1=new B();
	hybrid obj=new hybrid();
	}
}