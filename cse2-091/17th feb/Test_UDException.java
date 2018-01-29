class UDException extends Exception
{
	UDException(String s)
	{
	super(s);
	}
	public String toString()
	{
	return("Balance will be less than 500");
	}
}
public class Test_UDException
{
	int bal=1000;
	void withdraw(int x) throws UDException //since not a runtime exception
	{
		if ((bal-x)<500)
		throw new UDException("minimum balance should be 500");
		else
 		bal-=x;
		System.out.println("Remaining balance "+bal);
	}
	public static void main(String args[])
	{
		Test_UDException obj=new Test_UDException();
	try{
		obj.withdraw(600);
	}
	catch(UDException ue)
	{
		System.out.println("Inside catch");
		System.out.println(ue.getMessage());
	}
	}
}