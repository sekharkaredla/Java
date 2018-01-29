class Read_write_console
{
	public static void main(String args[])
	{
	int ch;
	try
	{
	do
	{
	ch=System.in.read();
	if((int)ch!=-1)
	System.out.println((char)ch);
	}while((int)ch!=-1);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	}
}