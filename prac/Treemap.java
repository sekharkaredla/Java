import java.util.*;
class Demo_Comparator implements Comparator<Integer>
{
	public int compare(Integer a,Integer b)
	{
	int p=a.intValue();
	int q=b.intValue();
	return q-p;
	}
}
class Treemap
{
	public static void main(String args[])
	{
	TreeMap<Integer,String> obj=new TreeMap<Integer,String>(new Demo_Comparator());
	TreeMap<Integer,String> obj1=new TreeMap<Integer,String>(new Demo_Comparator());
	obj.put(91,"X");
	obj.put(92,"N");
	obj.put(93,"M");
	obj1.putAll(obj);
	System.out.println(obj.equals(obj1));
	System.out.println(obj.containsKey(91));
	System.out.println(obj.containsValue("M"));
	System.out.println(obj.get((Integer)93));
	Set<Map.Entry<Integer,String>> s=obj.entrySet();
	for(Map.Entry<Integer,String> m:s)
	{
	System.out.println(m.getKey()+"     "+m.getValue());
	}
	System.out.println(obj1);
	}
}