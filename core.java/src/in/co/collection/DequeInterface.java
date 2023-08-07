package in.co.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeInterface {
	public static void main(String[] args) {

		Deque a = new ArrayDeque();
		// Deque b = new LinkedList();
		a.add("family");
		a.add("friends");
		a.add("bond");
		a.add("forever");
		System.out.println(a);
		a.addFirst(7);
		System.out.println(a);
		a.addLast(9);
		System.out.println(a);
		a.offerFirst(6);
		System.out.println(a);
		a.offerLast(10);
		System.out.println(a);
		a.removeFirst();
		System.out.println(a);
		a.removeLast();
		System.out.println(a);
		a.pollFirst();
		System.out.println(a);
		a.pollLast();
		System.out.println(a);
		a.peekFirst();
		System.out.println(a);

		System.out.println(a.peekLast());
		System.out.println(a.getFirst());
		
		System.out.println(a.getLast());

	}

}
