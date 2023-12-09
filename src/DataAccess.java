import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DataAccess {

	// Sign in Check
	public String isUserValid(String username, String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DatabaseManager.getConnection();
			String hashedPassword = Utils.passwordHashing(password);

			String sql = "SELECT user_id FROM users WHERE user_name = ? AND user_password = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, hashedPassword);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				return rs.getString("user_id");
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResources(conn, pstmt, rs);
		}
		return "";
	}
	// Sign Up
	public String signUp(String username, String password, String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DatabaseManager.getConnection();
			String hashedPassword = Utils.passwordHashing(password);

			String checkUserQuery = "SELECT * FROM users WHERE user_name = ?";
			pstmt = conn.prepareStatement(checkUserQuery);
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				return "User already exists. Please choose a different username.";
			}
			String insertQuery = "INSERT INTO users (user_id, user_name, user_password, user_type, profile_name) "
					+ "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(insertQuery);
			pstmt.setString(1, Long.toString(System.currentTimeMillis()));
			pstmt.setString(2, username);
			pstmt.setString(3, hashedPassword);
			pstmt.setString(4, "user");
			pstmt.setString(5, name);

			if (pstmt.executeUpdate() > 0) {
				return "User information saved successfully.";
			} else {
				return "Failed to save user information.";
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResources(conn, pstmt, null);
		}
		return "";
	}
	// Execute Query
	public ResultSet queryExecute(String query) {
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;	
		try {
			conn = DatabaseManager.getConnection();
			stm = conn.createStatement();
	        rs = stm.executeQuery(query);
	        System.out.println("ResultSetResultSet: "+ rs.next() + query);
			//
			return rs;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResources(conn, stm, null);
		}
		return null;
	}
	// Update Query
	public boolean queryUpdate(String query) {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DatabaseManager.getConnection();
			String sql = query;
			stm = conn.createStatement();
	        int resp = stm.executeUpdate(sql);
			//
			if( resp > 0) 
				return true;
			return false;
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResources(conn, stm, null);
		}
		return false;
	}
	// Get All Task
	public Vector<Vector<String>> getAllJobs(String user_id) {
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		Vector<Vector<String>> dataList = new Vector<>();
		try {
			conn = DatabaseManager.getConnection();

			String sql = "SELECT task_id, name,type,description,startdate,endDate,status,priority FROM tasks WHERE user_id = '"
					+ user_id + "'";

			String[] columnNames = { "task_id", "name", "type", "description", "status", "startdate", "endDate",
					"priority" };
			//
			stm = conn.createStatement();
	        rs = stm.executeQuery(sql);
			//
			while (rs.next()) {
				Vector<String> rowData = new Vector<>();
				for (String columnName : columnNames) {
					rowData.add(rs.getString(columnName));
				}
				dataList.add(rowData);
			}
			return dataList;

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseManager.closeResources(conn, stm, null);
		}
		return dataList;
	}
	// Schedule Task Based on Priority or deadline
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