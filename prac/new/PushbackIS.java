import java.io.*;
class PushbackIS
{
	public static void main(String args[])
	{
	FileInputStream fis=null;
	PushbackInputStream pbis=null;
	try
	{
	fis=new FileInputStream("1.txt");
	pbis=new PushbackInputStream(fis);
	}
	catch(IOException e)
	{}
	try
	{
	System.out.println((char)pbis.read());
	System.out.println((char)pbis.read());
	pbis.unread((int)'o');
	System.out.println((char)pbis.read());
	}
	catch(IOException e)
	{}
	}
}