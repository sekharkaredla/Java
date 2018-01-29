import java.util.*;
class Tree_Map
{
	public static void main(String args[])
	{
	TreeMap<String,String> obj=new TreeMap<String,String>();
	int i=0;
	while(i<=5)
	{
	obj.put(args[i],args[i+1]);
	i=i+2;
	}
	System.out.println(obj);
	System.out.println(obj.put("sekhar","Anantha"));
	System.out.println(obj);
	System.out.println(obj.descendingMap());
	System.out.println(obj.subMap("sekhar",true,"father",false));
	}
}
	