import java.util.*;
class Array_List
{
	public static void main(String args[])
	{
	ArrayList<Integer> obj=new ArrayList<Integer>();
	ArrayList<Integer> obj1=new ArrayList<Integer>();
	obj.add(10);obj1.add(30);
	obj.add(20);
	obj.add(30);
	obj.add(40);
	Iterator<Integer> i=obj.iterator();
	ListIterator<Integer> l=obj.listIterator();
	while(i.hasNext())
	System.out.println(i.next());
	while(l.hasNext())
	System.out.println(l.next());
	while(l.hasPrevious())
	System.out.println(l.previous());
	obj.remove((Integer)30);
	System.out.println(obj.contains(30));
	System.out.println(obj.contains(20));
	Object a1[]=new Object[obj.size()];
	a1=obj.toArray();
	for(Object p:a1)
	{
	System.out.println(p);
	}
	obj.addAll(obj1);
	Integer []a2=new Integer[obj.size()];
	a2=obj.toArray(a2);
	for(Integer p:a2)
	{
	System.out.println(p);
	}
	obj1.removeAll(obj);
	System.out.println(obj);
	System.out.println(obj1);
	}
}