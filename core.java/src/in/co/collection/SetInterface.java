package in.co.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		SortedSet  s = new TreeSet(
				);
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		
			System.out.println(s);
			System.out.println(s.first());
			System.out.println(s.last());
		}
		
	}
	



