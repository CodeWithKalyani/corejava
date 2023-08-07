package in.co.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

//import com.mysql.cj.protocol.Resultset;

import in.co.bean.UserBean;
import in.co.ctl.JDBCDataSource;

public class UserModel {
	public static int nextpk() throws ClassNotFoundException, SQLException {
		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = con.prepareStatement("select max(id) from user1");

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(UserBean bean) throws SQLException, ClassNotFoundException {

		/*
		 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection con =
		 * DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root",
		 * "root");
		 */
		Connection con=JDBCDataSource.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into user1 values(?,?,?,?,?,?)");

		ps.setInt(1, nextpk());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getGmailid());
		ps.setString(5, bean.getPassword());

		ps.setString(6, bean.getGender());
		int i = ps.executeUpdate();
	}

	public UserBean authenticate(String gmail, String password) throws ClassNotFoundException, SQLException {
		UserBean ub = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = con.prepareStatement("select*from user1 where gmailid=? and password=?");
		ps.setString(1, gmail);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		System.out.println("in auth");
		while (rs.next()) {
			ub = new UserBean();
			System.out.println("in auth");
			ub.setId(rs.getInt(1));
			ub.setFname(rs.getString(2));
			ub.setLname(rs.getString(3));
			ub.setGmailid(rs.getString(4));
			ub.setPassword(rs.getString(5));
			ub.setGender(rs.getString(6));

		}

		return ub;

	}

	public ArrayList getlist() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = con.prepareStatement("select*from user1");
		ArrayList list = new ArrayList<UserBean>();
		Iterator it = list.iterator();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			UserBean bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFname(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setGender(rs.getString(4));
			bean.setGmailid(rs.getString(5));
			bean.setPassword(rs.getString(6));
			list.add(bean);

		}

		return list;

	}

	public void delete(UserBean bean) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from user1 where fname=?");
		ps.setString(1, bean.getFname());
		int i = ps.executeUpdate();
	}

	public void Update(UserBean bean) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		PreparedStatement ps = con.prepareStatement("update user1 set password=?,gmail=? where fname=?");
		ps.setString(2, bean.getFname());
		ps.setString(4, bean.getGmailid());
		ps.setString(5, bean.getPassword());

		ps.setString(6, bean.getGender());
		int i = ps.executeUpdate();
	}

}
