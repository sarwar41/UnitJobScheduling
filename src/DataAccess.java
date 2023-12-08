
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.Vector;
import java.security.MessageDigest;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Date;

public class DataAccess {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/unitjobscheduling";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "Asd%049724";
	private Connection con;
	private Statement stm;

	public DataAccess() {
		this.initializeDatabaseConnection();
	}

	// check database connection
	public void initializeDatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			this.stm = this.con.createStatement();

//			if (this.con != null) {
//				System.out.println("Database Connected successfully");
//			} else {
//				System.out.println("Database Connection failed");
//			}
		} catch (Exception ex) {
//			ex.printStackTrace();
		}
	}

	//
	public Connection getConnection() {
		return this.con;
	}

	//
	public boolean isConnected() {
		return this.con != null ? true : false;
	}

	//
	public void closeConnection() {
		this.con = null;
		this.stm = null;

	}

	// executeQuery
	public ResultSet executeQuery(String sql) {
		try {
			if (this.con != null)
				return this.stm.executeQuery(sql);
			else
				return null;
		} catch (SQLException ex) {
//			ex.printStackTrace();
			return null;
		}
	}

	// executeQuery update
	public int executeQueryUpdate(String sql) {
		try {
			if (this.con != null) {
				int rowsAffected = this.stm.executeUpdate(sql);
				return rowsAffected;
			} else
				return 0;

		} catch (SQLException ex) {
//			ex.printStackTrace();
			return 0;
		}
	}

	// check user is valid or not
	public String isUserValid(String username, String password) {
		try {
			password = passwordHashing(password);
			String sql = "SELECT user_id FROM users WHERE user_name='" + username + "' AND user_password='" + password
					+ "'";

			ResultSet rs = executeQuery(sql);
			if(rs.next())
				return rs.getString("user_id");
			else 
				return "";
		} catch (SQLException ex) {
//			ex.printStackTrace();
			return "";
		}
		
	}

	// create a new user
	public String signUp(String username, String password, String name) {
		try {
	        String checkUserQuery = "SELECT * FROM users WHERE user_name = '" + username + "'";
	        try (ResultSet rs = executeQuery(checkUserQuery)) {
	            if (rs.next()) {
	                return "User already exists. Please choose a different username.";
	            } else {
	                String sql = "INSERT INTO users (user_id, user_name, user_password, user_type, profile_name) "
	                        + "VALUES ('" + Long.toString(System.currentTimeMillis()) + "', '" + username + "', '"
	                        + passwordHashing(password) + "', '" + "user" + "','" + name + "')";

	                if (executeQueryUpdate(sql) > 0) {
	                    return "User information saved successfully.";
	                }
	                
	                return "Failed to save user information.";
	            }
	        }
	    } catch (SQLException e) {
	        return "";
	    }
	}

	// hash password
	public String passwordHashing(String password) {

		try {
			// Create a MessageDigest object with the SHA-256 algorithm
			MessageDigest digest = MessageDigest.getInstance("SHA-256");

			// Update the digest with the input bytes
			byte[] hashedBytes = digest.digest(password.getBytes());

			// Convert the byte array to a hexadecimal string
			StringBuilder hexString = new StringBuilder();
			for (byte b : hashedBytes) {
				String hex = Integer.toHexString(0xff & b);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}

			// Print the hashed string
//			System.out.println("Hashed String: " + hexString.toString());

			return hexString.toString();

		} catch (Exception e) {
//			e.printStackTrace();

			return "";
		}
	}

	// fetch data from database
	private Vector<Vector<String>> fetchInfo(String sql, String[] columnNames) {
		Vector<Vector<String>> dataList = new Vector<>();
		try {
			ResultSet rs = executeQuery(sql);
			while (rs.next()) {
				Vector<String> rowData = new Vector<>();
				for (String columnName : columnNames) {
					rowData.add(rs.getString(columnName));
				}
				dataList.add(rowData);
			}

			return dataList;
		} catch (SQLException ex) {
//			ex.printStackTrace();
			return dataList;
		}
	}

	// get all lists of tasks
	public Vector<Vector<String>> getAllTasks(String user_id) {
		String sql = "SELECT task_id, name,type,description,startdate,endDate,status,priority FROM tasks WHERE user_id = '"
				+ user_id + "'";
		String[] columnNames = { "task_id", "name", "type", "description", "status", "startdate", "endDate",
				"priority" };
		return fetchInfo(sql, columnNames);
	}

	//
	public Vector<Vector<String>> scheduleTasks(Vector<Vector<String>> dataList, String sort_by) {
		Collections.sort(dataList, new SortComparator(sort_by));
		return dataList;
	}

}

//
class SortComparator implements Comparator<Vector<String>> {

	private static final List<String> PRIORITY_ORDER = List.of("High", "Medium", "Low");
	private String sort_by;

	public SortComparator(String sort_by) {
		this.sort_by = sort_by;
	}

	@Override
	public int compare(Vector<String> task1, Vector<String> task2) {
		// Compare based on priority
		if (this.sort_by.equals("Priority")) {
			String priority1 = task1.get(7);
			String priority2 = task2.get(7);

			int priorityComparison = Integer.compare(PRIORITY_ORDER.indexOf(priority1),
					PRIORITY_ORDER.indexOf(priority2));

			if (priorityComparison != 0) {
				return priorityComparison; // If priorities are different, return the comparison result
			}
		}
		// Compare based on end date
		else if (this.sort_by.equals("Deadline")) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date1, date2;
			try {
				date1 = dateFormat.parse(task1.get(6));
				date2 = dateFormat.parse(task2.get(6));

				return date1.compareTo(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}

		}
		// Compare based on priority and end date
		else if (this.sort_by.equals("Both")) {
			String priority1 = task1.get(7);
			String priority2 = task2.get(7);

			Integer.compare(PRIORITY_ORDER.indexOf(priority1), PRIORITY_ORDER.indexOf(priority2));

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date1, date2;

			try {
				date1 = dateFormat.parse(task1.get(6));
				date2 = dateFormat.parse(task2.get(6));

				return date1.compareTo(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		return 0;

	}
}
