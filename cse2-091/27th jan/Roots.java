class Roots
{
	void roots()
	{	
		int a,b,c;
		a=1;b=-2;c=1;
		double x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println(x1+"    "+x2);
	}
	public static void main(String args[])
	{
	Roots obj=new Roots();
	obj.roots();
	}
}