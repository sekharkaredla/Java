import java.io.*;
class BufferedIS
{
	public static void main(String args[])
	{
	FileInputStream fis=null;
	FileOutputStream fos=null;
	BufferedOutputStream bos=null;
	BufferedInputStream bis=null;
	try
	{
	fis=new FileInputStream("1.txt");
	fos=new FileOutputStream("2.txt");
	bos=new BufferedOutputStream(fos);
	bis=new BufferedInputStream(fis);
	}
	catch(IOException e)
	{}
	int k=0;
	try
	{
	while((k=bis.read())!=-1)
	{
	System.out.println((char)k);
	bos.write(k);
	}
	bos.flush();
	}
	catch(Exception e)
	{}
	}
}