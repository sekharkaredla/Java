class A
{
	int age=65;
	String name="RAM";
	void getData()
	{
	System.out.println(age+"	"+name);
	}
}
public class Super_keyword extends A
{
	int age=25;
	String name="Shyam";
	Super_keyword()
	{
	System.out.println(name);
	System.out.println(super.name);
	}
	void getData()
	{
	System.out.println(age+"	"+name);
	super.getData();
	}
	public static void main(String args[])
	{
		Super_keyword obj=new Super_keyword();
		obj.getData();
		
	}
}	