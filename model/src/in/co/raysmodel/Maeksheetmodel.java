package in.co.raysmodel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Maeksheetmodel {
	public static void add(MarksheetBean m) throws Exception, IllegalAccessException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysmodel.System");
		Class.forName(rb.getString("Driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("Insert into marksheet values(?,?,?,?,?)");

		ps.setInt(1, m.getRollno());
		ps.setString(2, m.getName());
		ps.setInt(3, m.getChemistry());
		ps.setInt(4, m.getMaths());
		ps.setInt(5, m.getPhysics());
		int i = ps.executeUpdate();
		System.out.println(i + "record insert");

	}

	public static void delete(MarksheetBean m) throws Exception, IllegalAccessException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysmodel.System");
		Class.forName(rb.getString("Driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("delete from marksheet where rollno=?");
		ps.setInt(1, m.getRollno());
		int i = ps.executeUpdate();
		System.out.println("record delete");
	}

	public static void update(MarksheetBean m) throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysmodel.System");

		Class.forName(rb.getString("Driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("update marksheet set name=? where rollno=?");
		ps.setString(1, m.getName());
		ps.setInt(2, m.getRollno());
		int i = ps.executeUpdate();
		System.out.println(i + "done");

	}

	public static void get(MarksheetBean m) throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysmodel.System");
		Class.forName(rb.getString("Driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));
		PreparedStatement ps = conn.prepareStatement("select* from marksheet where rollno=?");
		ps.setInt(1, m.getRollno());
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			m.setRollno(rs.getInt(1));
			m.setName(rs.getString(2));
			m.setChemistry(rs.getInt(3));
			m.setMaths(rs.getInt(4));
			m.setPhysics(rs.getInt(5));

			System.out.println("done");
		}

	}

	public static List getmeritlist() throws SQLException, ClassNotFoundException {
		ResourceBundle rb = ResourceBundle.getBundle("in.co.raysmodel.System");
		Class.forName(rb.getString("Driver"));
		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement(
				"select* from marksheet where (chemistry>33 and physics>33 and maths>33) order by (chemistry+physics+maths) desc limit 0,10");
		ResultSet r = ps.executeQuery();
		List l = new ArrayList<MarksheetBean>();
		while (r.next()) {
			MarksheetBean m = new MarksheetBean();
			m.setRollno(r.getInt(1));
			m.setName(r.getString(2));
			m.setChemistry(r.getInt(3));
			m.setPhysics(r.getInt(4));
			m.setMaths(r.getInt(5));
			l.add(m);

		}

		return l;

	}
}
