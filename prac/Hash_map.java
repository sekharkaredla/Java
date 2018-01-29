import java.util.*;
class Hash_map
{
	public static void main(String args[])
	{
	HashMap<Integer,String> obj=new HashMap<Integer,String>(10);
	obj.put(90,"XYZ");
	obj.put(91,"ABC");
	obj.put(92,"PQR");
	HashMap<Integer,String> obj1=new HashMap<Integer,String>();
	obj1.putAll(obj);
	System.out.println(obj1.equals(obj));
	System.out.println(obj);
	obj1.remove(90);
	System.out.println(obj1.get(91));
	System.out.println(obj1.containsValue("ABC"));
	System.out.println(obj1.containsKey(90));
	obj1.clear();
	System.out.println(obj1);
	obj.remove(92);
	System.out.println(obj);
	}
}