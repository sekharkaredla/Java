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
public class Constructor_behaviour extends B
{
	Constructor_behaviour()
	{
	System.out.println("Constructor C");
	}
	public static void main(String args[])
	{
	Constructor_behaviour obj=new Constructor_behaviour();
	}
	
}	