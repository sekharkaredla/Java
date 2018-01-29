import java.io.*;
class Reverse_file
{
public static void main(String args[])
{
	try
	{
		FileInputStream obj=new FileInputStream(args[0]);
		int i,count;
		count =0;
		do
		{
			i=obj.read();
			if(i!=-1)
			count++;
		}while(i!=-1);
		char []a=new char[count];
		int k=0;
		FileInputStream in=new FileInputStream(args[0]);
		while(k<count)
		{
			i=in.read();
			if(i!=-1)
			a[k++]=(char)i;
		}
		for(k=count-1;k>=0;k--)
		{
			System.out.print(a[k]);
		}
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
}
}	
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           