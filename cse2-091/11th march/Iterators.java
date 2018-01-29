import java.util.*;
class Iterators
{
        public static void main(String args[])
        {
        ArrayList<Float> obj=new ArrayList<Float>(10);
        obj.add(5.5f);
        obj.add(6.5f);
        obj.add(9.5f);
        obj.add(1,4.0f);
        Iterator<Float> itr=obj.iterator();
        while(itr.hasNext())
        {
        System.out.println(itr.next());
        }
        ListIterator<Float> ltr=obj.listIterator();
        while(ltr.hasNext())
        System.out.println(ltr.next());
        while(ltr.hasPrevious())
        System.out.println(ltr.previous());
        }
}