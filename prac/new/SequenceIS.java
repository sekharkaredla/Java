import java.io.*;
class SequenceIS
{
	public static void main(String args[])
	{
	FileInputStream fis1,fis2;
	fis1=fis2=null;
	try
	{
	fis1=new FileInputStream(args[0]);
	fis2=new FileInputStream(args[1]);
	}
	catch(IOException e)	
	{System.out.println(e.getMessage());}
	SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
	int k=0;
	do
	{
	try
	{
	k=sis.read();
	}
	catch(IOException e)
	{
	System.out.println(e.getMessage());
	}
	if(k!=-1)
	System.out.print((char)k);
	}while(k!=-1);
	}
}