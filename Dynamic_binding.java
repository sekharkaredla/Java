class A
{
	int x;
	void put(int p)
	{
	x=p;
	}
	void get()
	{
	System.out.println("x:"+x);
	}
}
public class Dynamic_binding extends A
{
	int x;
	void put(int P)
	{
	x=P;
	}
	void get()
	{
	System.out.println("x:"+x);
	}
	public static void main(String args[])
	{
	A obj1=new A();
	 Dynamic_binding obj2=new Dynamic_binding();
	A obj=new A();
	obj=obj1;
	obj.put(5);
	obj.get();
	obj=obj2;
	obj.put(10);
	obj.get();
	}
}	