import java.io.*;
class PippedIS
{
	public static void main(String args[])
	{
	byte b1[]={4,4,4,4};
	byte b2[]=new byte[4];
	PipedOutputStream pos=null;
	PipedInputStream pis=null;
	try
	{
	pos=new PipedOutputStream();
	pos.write(b1,0,b1.length);
	pis=new PipedInputStream(pos);
	//pis.connect(pos);
	int k=0;
	pis.read(b2,0,b1.length);
	System.out.println(1+" "+b2[0]);
	}
	catch(IOException e)
	{System.out.println(e.getMessage());}
	}
}