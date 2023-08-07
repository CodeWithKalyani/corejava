package in.co.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Dateformating {
	
	public static void main(String[] args) throws ParseException {
	
		Date d = new Date ();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		String s = format.format(d);
		System.out.println("date:-" +s );
		String s1= "01/08/2000";
		Date d1=format.parse(s1);
		System.out.println(d1);
		
	
		
		
}
}
