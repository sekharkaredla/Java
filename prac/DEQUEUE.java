import java.util.*;
class DEQUEUE
{
	public static void main(String args[])
	{
	Deque<Integer> q=new ArrayDeque<Integer>();
	q.addFirst(10);
	q.addFirst(20);
	q.addLast(30); 
	q.addLast(40);
	System.out.println(q.offerFirst(55));
	System.out.println(q.offerLast(56));
	System.out.println(q);
	q.push(50);
	System.out.println(q);
	System.out.println(q.pollFirst());
	System.out.println(q.offerLast(96));
	System.out.println(q);
	System.out.println(q.peekFirst());
	System.out.println(q.peekLast());
	System.out.println(q.pop());
	System.out.println(q.getFirst());
	System.out.println(q.getLast());
	System.out.println(q);
	}
}