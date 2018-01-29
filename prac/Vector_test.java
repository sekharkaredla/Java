import java.util.*;
class Vector_test
{
	public static void main(String args[])
	{
		Vector<Integer> obj=new Vector<Integer>(10,5);
		obj.addElement(10);
		obj.addElement(20);
		obj.addElement(40);
		obj.insertElementAt(30,2);
		Object v=obj.clone();
		System.out.println(obj);
		System.out.println(v);
		Enumeration<Integer> e=obj.elements();
		while(e.hasMoreElements())
		{
		System.out.println(e.nextElement());
		}
		System.out.println(obj.indexOf(40,0));
		System.out.println(obj.lastIndexOf(30,2));
		obj.removeElement(20);
		System.out.println(obj);
		obj.removeElementAt(2);
		System.out.println(obj);
	}
}
		