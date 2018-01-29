class Generalised_exception
{
	public static void main(String args[])
	{
		int []x={1,2,3,4};
		try
		{
		int a=x[5];
		}
		catch(ClassCastException ae)
		{
		System.out.println("In First Catch");
		}
		catch(ArithmeticException obj)
		{
		System.out.println("In Second Catch");
		}
		catch(Exception obj)
		{
		System.out.println("In Third Catch");
		System.out.println(obj.getMessage());
		}
	}
}
	