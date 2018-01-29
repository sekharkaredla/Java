import java.util.*;
class Collection_methods
{
        public static void main(String args[])
        {
        ArrayList<Integer> obj=new ArrayList<Integer>(10);
        obj.add(10);
        obj.add(20);
        obj.add(40);
        obj.add(1,30);
        Object ar[]=new Object[obj.size()];
        ar=obj.toArray();
        for(Object k:ar)
        System.out.println(k);
        ArrayList<Integer> obj1=new ArrayList<Integer>(obj);
        ar=obj1.toArray();
        for(Object k:ar)
        System.out.println(k);
        System.out.println(obj1.contains(40));
        System.out.println(obj1.containsAll(obj));
        obj.removeAll(obj1);
        System.out.println(obj1.equals(obj));
        System.out.println(obj.isEmpty());
        obj1.remove(2);
        System.out.println(obj1);
        }
}