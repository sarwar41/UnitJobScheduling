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

	DataAccess() {
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
	ResultSet executeQuery(String sql) {
		try {
			if(this.con != null)
				return this.stm.executeQuery(sql);
			else
				return null;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	// executeQuery update
	int executeQueryUpdate(String sql) {
		try {
			if(this.con != null) {
				int rowsAffected = this.stm.executeUpdate(sql);
				return rowsAffected;
			}
			else
				return -1;
			

		} catch (SQLException ex) {
			ex.printStackTrace();
			return -1;
		}
	}

	// check user is valid or not
	public String isUserValid(String username, String password) {
		
		String sql = "SELECT user_id FROM users WHERE user_name=? AND user_password=?";
		password = passwordHashing(password);
		try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			ResultSet rs = preparedStatement.executeQuery();
			 if (rs.next()) {
	                return rs.getString("user_id");
	            }
			 return "";
		} catch (SQLException ex) {
			ex.printStackTrace();
			return "";
		}
	}

	// create a new user
	public String signUp(String username, String password, String name) {
		PreparedStatement preparedStatement = null;
		try {
			if (this.con != null) {
				long epochTime = System.currentTimeMillis();
				
				ResultSet resultSet = null;
				String checkUserQuery = "SELECT * FROM users WHERE user_name = ?";
				preparedStatement = this.con.prepareStatement(checkUserQuery);
				preparedStatement.setString(1, username);
				resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					return "User already exists. Please choose a different username.";
				}else {
					if (preparedStatement != null) {
						preparedStatement.close();
					}
				}
				String sql = "INSERT INTO users (user_id , user_name, user_password, user_type) VALUES (?, ?, ?, ?)";
				preparedStatement = this.con.prepareStatement(sql);

				preparedStatement.setString(1, Long.toString(epochTime));
				preparedStatement.setString(2, username);
				preparedStatement.setString(3, passwordHashing(password));
				preparedStatement.setString(4, "user");
				preparedStatement.setString(5, name);

				// Execute the query to insert user information
				int rowsAffected = preparedStatement.executeUpdate();
				if (rowsAffected > 0)
					return "User information saved successfully.";

			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			// Close resources in a finally block to ensure they are always closed
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (this.con != null) {
					this.con.close();
				}
			} catch (SQLException e) {
				e.getMessage();
			}
		}
		return "Failed to save user information.";
	}

	// hash password
	String passwordHashing(String password) {

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
			System.out.println("Hashed String: " + hexString.toString());

			return hexString.toString();

		} catch (Exception e) {
			e.printStackTrace();

			return "";
		}
	}

	// fetch data from database
	private Vector<Vector<String>> fetchInfo(String sql, String[] columnNames) {
		try {
			ResultSet rs = executeQuery(sql);
			Vector<Vector<String>> dataList = new Vector<>();

			while (rs.next()) {
				Vector<String> rowData = new Vector<>();
				for (String columnName : columnNames) {
					rowData.add(rs.getString(columnName));
				}
				dataList.add(rowData);
			}

			return dataList;
		} catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	// get all lists of tasks
	public Vector<Vector<String>> getAllTasks(String user_id) {
		String sql = "SELECT task_id, name,type,description,startdate,endDate,status,priority FROM tasks WHERE user_id = '" + user_id + "'";
		String[] columnNames = { "task_id", "name", "type", "description", "status", "startdate", "endDate",
				"priority" };
		return fetchInfo(sql, columnNames);
	}
	//
	public Vector<Vector<String>> scheduleTasks(Vector<Vector<String>> dataList, String sort_by) {
        // Priority Scheduling
//        Collections.sort(dataList, Comparator.comparing(task -> task.get(6)));
        Collections.sort(dataList, new SortComparator(sort_by)); 
        return dataList;
        // Deadline Scheduling within the same priority
//        Collections.sort(dataList, Comparator.comparing(task -> task.get(4)));
    }



}
class SortComparator implements Comparator<Vector<String>> {

    private static final List<String> PRIORITY_ORDER = List.of("High", "Medium", "Low");
    private String sort_by;

    public SortComparator(String sort_by) {
        this.sort_by = sort_by;
    }
    @Override
    public int compare(Vector<String> task1, Vector<String> task2) {
    	System.out.println("this.sort_by performed"+this.sort_by);
    	if(this.sort_by.equals("Priority")) {
	    	String priority1 = task1.get(7);  // Assuming priority is at index 6
	        String priority2 = task2.get(7);
	
	        // Compare based on priority first
	        int priorityComparison = Integer.compare(PRIORITY_ORDER.indexOf(priority1), PRIORITY_ORDER.indexOf(priority2));
	        
	        if (priorityComparison != 0) {
	            return priorityComparison;  // If priorities are different, return the comparison result
	        }
    	}
        // If priorities are the same, compare based on deadlines
    	else if(this.sort_by.equals("Deadline")) {
//        	 String deadline1 = task1.get(6);  
//             String deadline2 = task2.get(6);
//
//             return deadline1.compareTo(deadline2);
    		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
             Date date1,date2;
			try {
				date1 = dateFormat.parse(task1.get(6));
				date2 = dateFormat.parse(task2.get(6));
				
				return date1.compareTo(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

             // Compare the dates
             
             

             // Compare the dates
             
        }else if (this.sort_by.equals("Both")){
        	String priority1 = task1.get(7);  // Assuming priority is at index 6
	        String priority2 = task2.get(7);
	
	        // Compare based on priority first
	        Integer.compare(PRIORITY_ORDER.indexOf(priority1), PRIORITY_ORDER.indexOf(priority2));
	        
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	        Date date1,date2;
			
	        try {
				date1 = dateFormat.parse(task1.get(6));
				date2 = dateFormat.parse(task2.get(6));
				
				return date1.compareTo(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		return 0;
       
    }
}
