import java.sql.Connection;
import java.sql.*;
import java.util.Vector;
import java.security.MessageDigest;

class Conn {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/jobScheduler";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "Daksh2000";

	public Connection con;
	public Statement stm;

	public Conn() {

		this.initializeDatabaseConnection();
	}

	// check database connection
	private void initializeDatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			this.stm = this.con.createStatement();

			if (this.con != null) {
				System.out.println("Database Connected successfully");
			} else {
				System.out.println("Database Connection failed");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// executeQuery
	private ResultSet executeQuery(String sql) {
		try {
			return this.stm.executeQuery(sql);
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
