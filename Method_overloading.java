class Method_overloading
{
	void sum(int a,int b)
	{
		System.out.println("IN SUM 1 :"+(a+b));
	}
	void sum(int a,int b,int c)
	{
		System.out.println("IN SUM 2 :"+(a+b+c));
	}
	public static void main(String args[])
	{
	Method_overloading obj=new Method_overloading();
	obj.sum(1,1);
	obj.sum(1,1,1);
	}
}