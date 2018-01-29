class A
{
	A()
	{
	System.out.println("Constuctor A");
	}
}
class B extends A
{
	B()
	{
	System.out.println("Constructor B");
	}
}
public class heirarchial extends A
{
	heirarchial()
	{
	System.out.println("Constuctor C");
	}
	public static void main(String args[])
	{
	B obj1=new B();
	heirarchial obj=new heirarchial();
	}	
}