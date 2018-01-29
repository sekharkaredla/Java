interface TestInter
{
abstract  void display();
abstract  void store(int p,int q);
abstract  int add();
}
class Test_interface	implements TestInter
{	
	int a,b;                                            
	public void display()
	{
	System.out.println("a is "+a);
	System.out.println("b is "+b);
	}
	public void store(int p,int q)
	{
	a=p;b=q;
	}
	public int add()
	{
	return a+b;
	}
	public static void main(String args[])
	{
	Test_interface obj=new Test_interface();
	obj.store(10,5);
	obj.display();
	System.out.println("the sum is "+obj.add());
	}
}
	
	