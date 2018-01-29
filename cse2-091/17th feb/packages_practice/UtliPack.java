// utilising the package
import TestPack.DemoPackClass;
class UtliPack
{
	void display()
	{
		System.out.println("In UtliPack");
	}
	public static void main(String args[])
	{	
	DemoPackClass obj=new DemoPackClass();
	UtliPack obj1=new UtliPack();
	obj1.display();
	obj.display();
	}
}