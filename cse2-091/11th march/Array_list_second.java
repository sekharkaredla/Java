import java.util.*;
class Array_list_second
{
        public static void main(String args[])
        {
                ArrayList<String> obj=new ArrayList<String>(5);
                obj.add("CBIT");
                obj.add("Gandipet");
                obj.add("HYD");
                String sr[]=new String[obj.size()];
                sr=obj.toArray(sr);
                for(String s:sr)
                {
                System.out.println(s);
                }
        }
}