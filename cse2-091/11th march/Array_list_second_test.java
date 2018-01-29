import java.util.*;
class Array_list_second_test
{
        public static void main(String args[])
        {
                ArrayList<Integer> obj=new ArrayList<Integer>(5);
                obj.add(10);
                obj.add(20);
                obj.add(30);
                Integer sr[]=new Integer[obj.size()];
                sr=obj.toArray(sr);
                for(Integer s:sr)
                {
                System.out.println(s);
                }
        }
}