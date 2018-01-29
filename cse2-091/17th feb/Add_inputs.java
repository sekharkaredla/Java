class Add_inputs
{
	int a,b;
	public static void main(String args[])
	{
	//int a,b;
	Add_inputs obj=new Add_inputs();
	obj.a=Integer.parseInt(args[0]);	
	obj.b=Integer.parseInt(args[1]);
	System.out.println(obj.a+obj.b);
	}
}