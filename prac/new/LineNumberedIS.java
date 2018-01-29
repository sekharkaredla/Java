import java.io.*;
class LineNumberedIS
{
	public static void main(String aegs[])
	{
	LineNumberInputStream lnis=null;
	FileInputStream fis=null;
	try
	{
	fis=new FileInputStream("1.txt");
	lnis=new LineNumberInputStream(fis);
	}
	catch(IOException e)
	{}
	int k=0;
	try
	{
	while(((k=lnis.read())!=-1))
	{
	System.out.println((char)k);
	}
	}
	catch(IOException e)
	{
	}
	}
}