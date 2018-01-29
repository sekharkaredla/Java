class Exception_handling
{
	public static void main(String args[])
	{
	int a=10;int b=2;int c;
	int []x={1,2,3};
	try
	{
	System.out.println("begin outer try");
	c=a/b;
	System.out.println(c);
	System.out.println("end of outer try");
	try
	{
	System.out.println("begin inner try");
	System.out.println(x[3]);
	System.out.println("end inner try");
	}
	catch(ArithmeticException ae)
	{
	System.out.println("begin inner catch");
	System.out.println(ae.getMessage());
	System.out.println("end inner catch");
	}
	}
	catch(ArrayIndexOutOfBoundsException aiob)
	{
	System.out.println("begin outer catch");
	System.out.println(aiob.getMessage());
	System.out.println("end outer catch");
	}
	catch(Exception e)
	{
	System.out.println("Inside third catch block");
	System.out.println(e.getMessage());
	}
	System.out.println("End of main");
	}
}