import java.util.*;
class Array_list
{
        public static void main(String args[])
        {
                ArrayList<Integer> obj=new ArrayList<Integer>(10);
                obj.add(10);
                obj.add(20);
                obj.add(30);
                Object []arr=new Object[obj.size()];
                arr=obj.toArray();
                for(Object i:arr)
                {
                        System.out.println(i);
                }
		System.out.println(obj);
        }
}