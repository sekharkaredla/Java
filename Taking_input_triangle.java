class Taking_input_triangle
{

	public static void main(String args[])
	{
	String name;int line;
		name=args[0];
		line=Integer.parseInt(args[1]);
		System.out.println(name);
		for(int i=0;i<line;i++)
		{
		System.out.print("1");
		for(int j=1;j<2*i;j++)
		System.out.print("0");
		if(i!=0)
		System.out.print("1");
		System.out.println();
		}
	}
}