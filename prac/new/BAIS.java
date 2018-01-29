import java.io.*;
class BAIS
{
	public static void main(String args[])
	{
	ByteArrayOutputStream baos=new ByteArrayOutputStream();
	String str="hello";
	for(int i=0;i<str.length();i++)
	baos.write(str.charAt(i));
	ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
	/*int k=0;
	do
	{
	k=bais.read();
	if(k!=-1)
	System.out.print((char)k);
	}while(k!=-1);*/
	System.out.println((char)bais.read());
	System.out.println((char)bais.read());
	System.out.println(bais.markSupported());
	bais.mark(2);
	System.out.println((char)bais.read());
		bais.reset();
	System.out.println((char)bais.read());
	System.out.println((char)bais.read());
	System.out.println((char)bais.read());
	}
}