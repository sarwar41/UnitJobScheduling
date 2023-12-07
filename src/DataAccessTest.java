import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

//
//import java.util.Vector;
//
//import static org.junit.Assert.*;
//
//class DataAccessTest {
//	
//
//	    @Test
//	    void passwordHashing_ValidPassword_ReturnsHashedPassword() {
//	        DataAccess dataAccess = new DataAccess();
//	        String hashedPassword = dataAccess.passwordHashing("testPassword");
//	        assertNotNull(hashedPassword);
//	        assertFalse(hashedPassword.isEmpty());
//	    }
//
//	    @Test
//	    void passwordHashing_EmptyPassword_ReturnsEmptyString() {
//	        DataAccess dataAccess = new DataAccess();
//	        String hashedPassword = dataAccess.passwordHashing("");
//	        assertTrue(hashedPassword.isEmpty());
//	    }
//
//	    @Test
//	    void getAllTasks_ValidUserId_ReturnsTaskList() {
//	        DataAccess dataAccess = new DataAccess();
//	        // Assuming valid user ID
//	        Vector<Vector<String>> tasks = dataAccess.getAllTasks("validUserId");
//	        assertNotNull(tasks);
//	        assertFalse(tasks.isEmpty());
//	    }
//
//	    @Test
//	    void scheduleTasks_ValidDataList_ReturnsSortedDataList() {
//	        DataAccess dataAccess = new DataAccess();
//	        Vector<Vector<String>> testDataList = new Vector<>();
//	        // Add test data to the list
//	        Vector<Vector<String>> sortedList = dataAccess.scheduleTasks(testDataList, "Priority");
//	        assertNotNull(sortedList);
//	        assertTrue(sortedList.isEmpty()); // Adjust based on your specific implementation
//	    }
//
//    
//
//}
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.*;

class DataAccessTest {

	private DataAccess dataAccess = new DataAccess();


	//    @Before
	//    void setUp() {
	//    	System.out.println("DB_URL");
	//        dataAccess = new DataAccess();
	//    }
	//
	//    @AfterEach
	//    void tearDown() {
	//        dataAccess = null;
	//    }

	@Test
	void initializeDatabaseConnection_SuccessfulConnection_PrintsSuccessMessage() {
		Connection connection = dataAccess.getConnection();
		assertNotNull(connection);
		assertTrue(dataAccess.isConnected());
	}

	@Test
	void executeQuery_ValidQuery_ReturnsResultSet() throws IOException {

		ResultSet result = dataAccess.executeQuery("SELECT * FROM users");
		assertNotNull(result);
	}

	//
	@Test
	void executeQuery_InvalidQuery_ReturnsNull() throws IOException {

		ResultSet result = dataAccess.executeQuery("INVALID QUERY");
		assertNull(result);
	}

	//
	@Test
	void executeQueryUpdate_ValidQuery_ReturnsRowsAffected() {
		String updateQuery = "update users set profile_name='" + "sarwar" + "' where user_id=1700765996686";
		int rowsAffected = dataAccess.executeQueryUpdate(updateQuery);
		assertTrue(rowsAffected >= 0);
	}

	//
	@Test
	void executeQueryUpdate_InvalidQuery_ReturnsMinusOne() {

		int rowsAffected = dataAccess.executeQueryUpdate("INVALID QUERY");
		assertEquals(-1, rowsAffected);
	}

	@Test
	void executeQueryUpdate_NullConnection_ReturnsFailure() {
		dataAccess.closeConnection();
		String validQuery = "update users set profile_name='sarwar' where user_id=1700765996686";
		int rowsAffected = dataAccess.executeQueryUpdate(validQuery);
		assertEquals(-1, rowsAffected);
	}

	@Test
	void initializeDatabaseConnection_FailedConnection_PrintsFailureMessage() {
		dataAccess.closeConnection();
		Connection connection = dataAccess.getConnection();
		System.out.println("connection" + connection);
		assertNull(connection);
		assertFalse(dataAccess.isConnected());
	}
}