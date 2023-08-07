package in.co.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectoinInterface {
	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add("name");
		a.add(9);
		a.add("I");
		a.add(true);

		ArrayList a1 = new ArrayList();
		a1.add("ballu");
		a1.add('r');
		a1.add(2);
		a1.add(9);
		a1.add(false);

		System.out.println(a);
		System.out.println(a.add("chai"));
		System.out.println(a.remove(2));
		System.out.println(a);
		System.out.println(a1.size());
		System.out.println(a1);
		System.out.println(a.isEmpty());
		System.out.println(a);
		System.out.println(a.addAll(a1));
		System.out.println(a1);
		System.out.println(a.contains(9));
		System.out.println(a);
		System.out.println(a.containsAll(a));
		System.out.println(a);
		System.out.println("------------");
		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
