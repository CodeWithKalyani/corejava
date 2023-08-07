package in.co.Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) {
		List l = new ArrayList();

		Marksheet m1 = new Marksheet("ram", "22b22", 80, 85, 90);
		Marksheet m2 = new Marksheet("abcd", "33c33", 75, 80, 85);
		l.add(m1);
		l.add(m2);
		
		Iterator it = l.iterator();
		while (it.hasNext());
		Marksheet m = (Marksheet)it.next();
		System.out.println(m.getRollno());
		System.out.println(m.getName());
		System.out.println(m.getMaths());
		System.out.println(m.getChemistry());
		System.out.println(m.getPhysics());
		 
		
		System.out.println(l.equals(m1));
		System.out.println(l.contains(m1));
		System.out.println(l.contains(m2));
		
		

	}
}
