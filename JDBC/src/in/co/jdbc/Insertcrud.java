package in.co.jdbc;

import java.sql.*;

import com.mysql.cj.PreparedQuery;

public class Insertcrud {
	
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	//	Statement stmt = conn.createStatement();
	PreparedStatement ps = conn.prepareStatement("Insert into emp values(?,?,?)");
	
	ps.setInt(1,5678);
	ps.setString(2,"andd");
	ps.setInt(3, 45567);
	
			
			
		//	int i = stmt.executeUpdate("Insert into emp values(2,'shyam',300000)");
		//System.out.println(i+"record add");
	int i = ps.executeUpdate();
	System.out.println(i+"record inserted");
		
		

	}
	

}
