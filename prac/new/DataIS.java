import java.io.*;
class DataIS
{
	public static void main(String args[])
	{
	FileInputStream fis=null;
	FileOutputStream fos=null;
	DataInputStream dis=null;
	DataOutputStream dos=null;
	try
	{
	fis=new FileInputStream("1.txt");
	fos=new FileOutputStream("2.txt");
	dos=new DataOutputStream(fos);
	dis=new DataInputStream(fis);
	}
	catch(IOException e)
	{}
	int k=0;
	try
	{
	while((k=dis.readInt())!=-1)
	dos.writeInt(k);
	}
	catch(IOException e)
	{}
	}
}