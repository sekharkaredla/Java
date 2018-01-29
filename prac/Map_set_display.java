import java.util.*;
class Map_set_display
{
	public static void main(String args[])
	{
	HashMap<Integer,String> obj=new HashMap<Integer,String>(10);
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