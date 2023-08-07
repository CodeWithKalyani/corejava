package in.co.raysmodel;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;



public class TestcrudMrksht {
	public static void main(String[] args) throws Exception {
		// testadd();
		// testupdate();
		//testget();
		testgetmeritlist();
	}

	private static void testgetmeritlist() throws ClassNotFoundException, SQLException {
		Maeksheetmodel n = new Maeksheetmodel();
		List l = n.getmeritlist();
		Iterator i = l.iterator();
		while (i.hasNext());
		MarksheetBean m = new MarksheetBean();
		System.out.println("roll no:" + m.getRollno());
		System.out.println("name:" + m.getName());
		System.out.println("chemistry:" + m.getChemistry());
		System.out.println("physics:" + m.getPhysics());
		System.out.println("maths:" + m.getMaths());
		System.out.println("total marks:" +(m.getChemistry()+m.getPhysics()+m.getMaths()));
		
		
	}

	private static void testget() throws Exception {
		MarksheetBean m = new MarksheetBean();
		Maeksheetmodel n = new Maeksheetmodel();
		m.setRollno(105);

		n.get(m);

		System.out.println("rollno"+"-"+m.getRollno());
		System.out.println("name"+"-"+m.getName());
		System.out.println("physics"+m.getPhysics());
		System.out.println("chemistry"+m.getChemistry());
		System.out.println("math"+m.getMaths());
	}

	private static void testupdate() throws ClassNotFoundException, SQLException {
		MarksheetBean m = new MarksheetBean();
		Maeksheetmodel n = new Maeksheetmodel();
		m.setRollno(113);
		m.setName("anni");

		n.update(m);

		System.out.println("add success");
	}

	private static void testadd() throws Exception {
		MarksheetBean m = new MarksheetBean();
		Maeksheetmodel n = new Maeksheetmodel();

		m.setRollno(113);
		m.setName("shreyas");
		m.setChemistry(80);
		m.setPhysics(97);
		m.setMaths(100);
		n.add(m);
		System.out.println("add success");
	}
}
