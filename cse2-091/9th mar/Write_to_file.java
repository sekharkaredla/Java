import java.io.*;
class Write_to_file
{
	public static void main(String args[])
	{
	int i;
	try
	{
	FileOutputStream obj=new FileOutputStream(args[0]);
	do
	{
	i=System.in.read();
	if(i!=-1)
	obj.write(i);
	}while(i!=-1);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	}
}
		