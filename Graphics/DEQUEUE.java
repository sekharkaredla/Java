import java.util.*;
class DEQUEUE
{
	public static void main(String args[])
	{
	DeQueueM<Integer> q=new DeQueue<Integer>();
	q.addFirst(10);
	q.addFirst(20);
	q.addLast(30);
	q.addLast(40);
	System.out.println(q.offersFirst(55));
	System.out.println(q.offersLast(55));
	System.out.println(q);
	System.out.println(q.push(50));
	System.out.println(q.pollFirst());
	System.out.println(q.offersLast());
	System.out.println(q.peekFirst());
	System.out.println(q.peekLast());
	System.out.println(q.pop());
	}
}