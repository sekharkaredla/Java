class Fact
{
	int fact(int r)
	{
		if(r==0)
		return 1;
		else
		return r*fact(r-1);
	}
	public static void main(String args[])
	{
	Fact obj=new Fact();
	System.out.println("Factorial is :  "+obj.fact(5));
	}
}