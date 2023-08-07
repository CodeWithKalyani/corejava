package in.co.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAgeOops {
	public static void main(String[] args) throws ParseException {
		AgeOops A = new AgeOops();
		A.setName("Deyndra");
		A.setDOB("13/11/1996");
		A.setAddress("Indore");  
		System.out.println(A.getName());
		System.out.println(A.getDOB());
		System.out.println(A.getAddress());
		
		Date d = new Date ();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		Date d1=format.parse("13/11/1996");
		System.out.println(d.getDay()-d1.getDay());
		System.out.println(d.getMonth()-d1.getMonth());
		System.out.println(d.getYear()-d1.getYear());
		
	
	
	}
	
	

}
