import java.util.*;
class DemoComparator extends Comparator<Integer>//key type
{
	int compare(int a,int b)
	{
		return a-b;
	}
}
class Comperator_test
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