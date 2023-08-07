package in.co.jdbc;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class Testcrud {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select* from unit");
		while (rs.next()) {
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getString(3));

		}
		stmt.close();
		conn.close();

	}
}
