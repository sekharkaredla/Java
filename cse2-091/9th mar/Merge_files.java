import java.io.*;
class Merge_files
{
	public static void main(String args[])
	{
		int i;
		try
		{
		FileInputStream in1=new FileInputStream(args[0]);
		FileInputStream in2=new FileInputStream(args[1]);
		FileOutputStream out=new FileOutputStream(args[2]);
		do
		{
		i=in1.read();
		if(i!=-1)
		out.write(i);
		}while(i!=-1);
		do
		{
		i=in2.read();
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