package in.co.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.add("A");
		q.add("B");
		q.add(3);
		q.add("D");
		System.out.println(q);
		q.add("E");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.offer("H");
		System.out.println(q);

		q.poll();
		System.out.println(q);
		q.element();
		System.out.println(q);
		q.peek();
		System.out.println(q);

	}

}
