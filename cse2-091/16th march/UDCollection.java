import java.util.*;
class Student
{
	int rno;
	String name;
	Student(int a,String s)
	{
	rno=a;
	name=s;
	}
	public String toString()
	{
	return ("["+rno+" "+name+"]");
	}
}
public class UDCollection 
{
	public static void main(String args[])
	{
	ArrayList<Student> al=new ArrayList<Student>(10);
	al.add(new Student(91,"XYZ"));
	al.add(new Student(90,"PQR"));
	al.add(new Student(92,"ABC"));
	System.out.println(al);
	Student []arr=new Student[al.size()];
	arr=al.toArray(arr);
	for(Student s:arr)
	{
	System.out.println(s);
	}
	}
}	