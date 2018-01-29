import java.io.*;
class String_reverse_file
{
        public static void main(String args[])
        {
                char a[]=new char[args[0].length()];
                for(int i=1;i<=args[0].length();i++)
                a[i-1]=args[0].charAt(args[0].length()-i);
                int i;
                try
                {
                FileOutputStream obj=new FileOutputStream("one.txt");
                for(int k=0;k<args[0].length();k++)
                {
                i=(int)a[k];
                obj.write(i);
                }
                }
                catch(IOException e)
                {
                System.out.println(e.getMessage());
                }
        }
}