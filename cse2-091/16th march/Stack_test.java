import java.util.*;
class Stack_test
{
	public static void main(String args[])
	{	
	Stack<Integer> obj=new Stack<Integer>();
	obj.push(10);
	System.out.println(obj.push(15));
	obj.push(20);
	obj.push(30);
	obj.push(40);
	System.out.println(obj);
	System.out.println(obj.pop());
	System.out.println(obj.peek());
	System.out.println(obj);
	System.out.println(obj.search(20));
	System.out.println(obj.pop());
	System.out.println(obj);
	System.out.println(obj.search(20));
	}
}