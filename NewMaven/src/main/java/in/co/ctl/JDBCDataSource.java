package in.co.ctl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JDBCDataSource {
	private static JDBCDataSource datasource;

	private JDBCDataSource() {
	}

	private ComboPooledDataSource c = null;

	public static JDBCDataSource getInstance() {
		if (datasource == null) {

			ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.Bundle.System");

			datasource = new JDBCDataSource();
			datasource.c = new ComboPooledDataSource();
			try {
				datasource.c.setDriverClass(rb.getString("driver"));
			} catch (Exception e) {
				e.printStackTrace();
			}

			datasource.c.setJdbcUrl(rb.getString("url"));
			datasource.c.setUser(rb.getString("user"));

			datasource.c.setPassword(rb.getString("password"));

			datasource.c.setInitialPoolSize(new Integer((String) rb.getString("initialPoolSize")));

			datasource.c.setAcquireIncrement(new Integer((String) rb.getString("acquireIncrement")));

			datasource.c.setMaxPoolSize(new Integer((String) rb.getString("maxPoolSize")));

			datasource.c.setMaxIdleTime(new Integer((String) rb.getString("timeout")));

			datasource.c.setMinPoolSize(new Integer((String) rb.getString("minPoolSize")));

		}

		return datasource;
	}

	public static Connection getConnection() throws SQLException {

		return getInstance().c.getConnection();
	}

	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
			}
		}
	}

	public static void trnRollback(Connection connection) throws Exception {
		if (connection != null) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				throw new Exception(e.toString());

			}
		}
	}
}
