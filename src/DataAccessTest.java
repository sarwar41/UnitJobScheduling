//
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
////
////import java.util.Vector;
//import java.io.IOException;
//import java.sql.*;
//import java.util.List;
//import java.util.Vector;
//
//class DataAccessTest {
//
//	private DataAccess dataAccess = new DataAccess();
//
//	// @Before
//	// void setUp() {
//	// System.out.println("DB_URL");
//	// dataAccess = new DataAccess();
//	// }
//	//
//	// @AfterEach
//	// void tearDown() {
//	// dataAccess = null;
//	// }
//
//	@Test
//	void initializeDatabaseConnection_SuccessfulConnection_PrintsSuccessMessage() {
//		Connection connection = dataAccess.getConnection();
//		assertNotNull(connection);
//		assertTrue(dataAccess.isConnected());
//	}
//
//	@Test
//	void executeQuery_ValidQuery_ReturnsResultSet() throws IOException {
//		ResultSet result = dataAccess.executeQuery("SELECT * FROM users");
//		assertNotNull(result);
//	}
//
//	//
//	@Test
//	void executeQuery_InvalidQuery_ReturnsNull() throws IOException {
//		ResultSet result = dataAccess.executeQuery("INVALID QUERY");
//		assertNull(result);
//	}
//
//	//
//	@Test
//	void executeQueryUpdate_ValidQuery_ReturnsRowsAffected() {
//		String updateQuery = "update users set profile_name='" + "sarwar" + "' where user_id=1701989664305";
//		int rowsAffected = dataAccess.executeQueryUpdate(updateQuery);
//		assertTrue(rowsAffected > 0);
//	}
//
//	//
//	@Test
//	void executeQueryUpdate_InvalidQuery_ReturnsMinusOne() {
//
//		int rowsAffected = dataAccess.executeQueryUpdate("INVALID QUERY");
//		assertEquals(0, rowsAffected);
//	}
//
//	@Test
//	void executeQueryUpdate_NullConnection_ReturnsFailure() {
//		dataAccess.closeConnection();
//		String validQuery = "update users set profile_name='sarwar' where user_id=1700765996686";
//		int rowsAffected = dataAccess.executeQueryUpdate(validQuery);
//		assertEquals(0, rowsAffected);
//	}
//
//	@Test
//	void initializeDatabaseConnection_FailedConnection_PrintsFailureMessage() {
//		dataAccess.closeConnection();
//		Connection connection = dataAccess.getConnection();
//		System.out.println("connection" + connection);
//		assertNull(connection);
//		assertFalse(dataAccess.isConnected());
//	}
////	  @Test
////    public void testSignUpUserExists() throws SQLException{
////        String result = dataAccess.signUp("test@example.com", "newPassword","sarwar"); 
////        System.out.println("testSignUpUserExists: "+ result);
////        assertTrue("User already exists. Please choose a different username.".equals(result) || "User information saved successfully.".equals(result) || "Failed to save user information.".equals(result));
////    }
//
////    @Test
////    public void testSignUpUserDoesNotExist() throws SQLException{
////        // Assuming a case where the user cannot be saved successfully
////        String result = dataAccess.signUp("test1@example.com.com", "newPassword","");
////        System.out.println("testSignUpUserDoesNotExist: "+ result);
////        assertTrue("User already exists. Please choose a different username.".equals(result) || "User information saved successfully.".equals(result) || "Failed to save user information.".equals(result));
////        
////    }
//	
//	@Test
//    public void testScheduleTasks_PrioritySorting() {
//        DataAccess dataAccess = new DataAccess();
//        Vector<Vector<String>> testData = createTestData();
//        
//        Vector<Vector<String>> sortedData = dataAccess.scheduleTasks(new Vector<>(testData), "Priority");
//
//        // Assert the expected order based on priority
//        assertEquals("High", sortedData.get(0).get(7));
//        assertEquals("Medium", sortedData.get(1).get(7));
//        assertEquals("Low", sortedData.get(2).get(7));
//    }
//
//    @Test
//    public void testScheduleTasks_DeadlineSorting() {
//        DataAccess dataAccess = new DataAccess();
//        Vector<Vector<String>> testData = createTestData();
//        
//        Vector<Vector<String>> sortedData = dataAccess.scheduleTasks(new Vector<>(testData), "Deadline");
//
//        // Assert the expected order based on deadline
//        assertEquals("03/01/2023", sortedData.get(0).get(6));
//        assertEquals("05/01/2023", sortedData.get(1).get(6));
//        assertEquals("07/01/2023", sortedData.get(2).get(6));
//    }
//
//    @Test
//    public void testScheduleTasks_BothSorting() {
//        DataAccess dataAccess = new DataAccess();
//        Vector<Vector<String>> testData = createTestData();
//        
//        Vector<Vector<String>> sortedData = dataAccess.scheduleTasks(new Vector<>(testData), "Both");
//
//        // Assert the expected order based on priority and deadline
//        System.out.println("sortedData.get(0).get(7)"+sortedData.get(0).get(7));
////        assertEquals("High", sortedData.get(0).get(7));
////        assertEquals("03/01/2023", sortedData.get(0).get(6));
//
//        assertEquals("Medium", sortedData.get(0).get(7));
//        assertEquals("05/01/2023", sortedData.get(1).get(6));
//
////        assertEquals("Low", sortedData.get(2).get(7));
////        assertEquals("07/01/2023", sortedData.get(2).get(6));
//    }
//
//    private Vector<Vector<String>> createTestData() {
//        Vector<Vector<String>> testData = new Vector<>();
//        Vector<String> task1 = new Vector<>(List.of("1", "Task1", "Type1", "Desc1", "Status1", "01/01/2023", "03/01/2023", "Medium"));
//        Vector<String> task2 = new Vector<>(List.of("2", "Task2", "Type2", "Desc2", "Status2", "01/01/2023", "05/01/2023", "Low"));
//        Vector<String> task3 = new Vector<>(List.of("3", "Task3", "Type3", "Desc3", "Status3", "01/01/2023", "07/01/2023", "High"));
//
//        testData.add(task1);
//        testData.add(task2);
//        testData.add(task3);
//
//        return testData;
//    }
//}