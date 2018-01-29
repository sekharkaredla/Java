import java.io.*;
class Copy_files
{
	public static void main(String args[])
	{
		int i;
		try
		{
		FileInputStream in=new FileInputStream(args[0]);
		FileOutputStream out=new FileOutputStream(args[1]);
		do
		{
			i=in.read();
			if(i!=-1)
			out.write(i);
		}while(i!=-1);
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
	}
}