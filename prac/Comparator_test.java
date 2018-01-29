import java.util.*;
class DemoComparator implements Comparator<Integer> //key type
{
	public int compare(Integer a,Integer b)
	{
		int p=a.intValue();
		int q=b.intValue();
		return q-p;     //b-a for descending , a-b for ascending 
	}
}
class Comparator_test
{
	public static void main(String args[])
	{
	TreeMap<Integer,String> obj=new TreeMap<Integer,String>(new DemoComparator());
	obj.put(90,"XYZ");
	obj.put(91,"ABC");
	obj.put(92,"PQR");
	Set<Map.Entry<Integer,String>> s=obj.entrySet();
	for(Map.Entry<Integer,String> a:s)
	{
	System.out.println(a.getKey()+"    "+a.getValue());
	}
	}	
}