package in.co.raysmodel;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestLanguage {
	public static void main(String[] args) {
		 Locale l = new Locale("hi");
		 ResourceBundle rb = ResourceBundle.getBundle("in.co.Bundle.fapp_hi",l);
		 System.out.println(rb.getString("greeting"));
		 
		  
	}

}
