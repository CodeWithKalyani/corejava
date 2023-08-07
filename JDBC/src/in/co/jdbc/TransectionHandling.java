package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransectionHandling {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		try {
			
			conn.setAutoCommit(false);
			String s1 =("insert into emp values(4,'jaydeep',23456)");
			String s2 = ("insert into emp values(8,'aayush',34567)");
			//String s3 = ("insert into values(10,'d',347685854)");
		String s3 = ("update emp set name ='ram'where id = 1");
		
		Statement st = conn.createStatement();
		int i = st.executeUpdate(s1);
		i = st.executeUpdate(s2);
		i = st.executeUpdate(s3);
		System.out.println(i+"data inserted");
		conn.commit();
		} catch (Exception e) {
			// TODO: handle exception
			conn.rollback();
			System.err.println("data not inserted");
			System.out.println(e.getMessage());
			
			
		}
			

	
			
	}

}
