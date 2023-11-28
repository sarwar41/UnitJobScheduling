import java.sql.Connection;
import java.sql.*;
import java.util.Vector;
import java.security.MessageDigest;

class DataAccess {
	

    private static final String DB_URL = "jdbc:mysql://localhost:3306/unitjobscheduling";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Asd%049724";

    private Connection con;
    private Statement stm;

    public DataAccess() {
    	
        this.initializeDatabaseConnection();
    }
    //check database connection
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
    //check user is valid or not
    public boolean isUserValid(String username, String password) {
        String sql = "SELECT * FROM users WHERE user_name=? AND user_password=?";
        password = passwordHashing(password);
        try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    //create a new user
    public String signUp(String username, String password) {
    	PreparedStatement preparedStatement = null;
    	try {
    		if (this.con != null) {
    			 long epochTime = System.currentTimeMillis();
    			 
    			 String sql = "INSERT INTO users (user_id , user_name, user_password, user_type) VALUES (?, ?, ?, ?)";
    			 preparedStatement = this.con.prepareStatement(sql);
		    
		         preparedStatement.setString(1, Long.toString(epochTime));
		         preparedStatement.setString(2, username);
		         preparedStatement.setString(3, passwordHashing(password));
		         preparedStatement.setString(4, "user");
	
		         // Execute the query to insert user information
		         int rowsAffected = preparedStatement.executeUpdate();
		         if (rowsAffected > 0)
		        	 return "User information saved successfully!";
		          
    		}
        } catch (SQLException e) {
            return e.getMessage();
        }finally {
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
    
    //hash password
    private static String passwordHashing(String password) {
    	
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
    //get all lists of tasks
    public Vector<Vector<String>> getAllTasks() {
        String sql = "SELECT roomnumber,roomtype,bedtype,price FROM tasks";
        String[] columnNames = {"roomnumber", "roomtype", "bedtype", "price"};
        return fetchInfo(sql, columnNames);
    }
    //get all lists of tasks
    public Vector<Vector<String>> getAllMemberInfo() {
        String sql = "SELECT firstname,lastname,gender,age,address,idtype,idnumber,username," +
                "checkin,checkout,totalammount,paid,due,days FROM memberaccount";
        String[] columnNames = {"firstname", "lastname", "gender", "age", "address", "idtype", "idnumber",
                "username", "checkin", "checkout", "totalammount", "paid", "due", "days"};
        return fetchInfo(sql, columnNames);
    }

    public Vector<Vector<String>> getStatusInfo() {
        String sql = "SELECT username,roomnumber,days,checkin,checkout,paid,due FROM memberaccount";
        String[] columnNames = {"username", "roomnumber", "days", "checkin", "checkout", "paid", "due"};
        return fetchInfo(sql, columnNames);
    }

    public Vector<Vector<String>> getAllServices() {
        String sql = "SELECT service.name,service.room,service.services,service.price,memberaccount.due " +
                "FROM service,memberaccount WHERE service.name = memberaccount.username AND service.room = memberaccount.roomnumber";
        String[] columnNames = {"name", "room", "services", "price"};
        return fetchInfo(sql, columnNames);
    }
}