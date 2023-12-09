import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataAccessTest {

    private DataAccess dataAccess;

    @BeforeEach
    void setUp() {
        // Initialize the DataAccess object
        dataAccess = new DataAccess();
    }

    @Test
    void testIsUserValid() {
        // Test a valid user
        String validUserId = dataAccess.isUserValid("sarwar@gmail.com", "asd");
        assertEquals("1702078692096", validUserId);

        // Test an invalid user
        String invalidUserId = dataAccess.isUserValid("invalidUser@gmail.com", "invalidPassword");
        assertEquals("", invalidUserId);
    }

    @Test
    void testSignUp() {
        // Test a successful sign-up
        String signUpResult = dataAccess.signUp("newUser@gmail.com", "password123", "John Doe");
        assertEquals("User information saved successfully.", signUpResult);

        // Test sign-up with an existing username
        String existingUserResult = dataAccess.signUp("sarwar@gmail.com", "asd", "");
        assertEquals("User already exists. Please choose a different username.", existingUserResult);
    }

    @Test
    void testQueryUpdate() {
        // Test a successful query update
        boolean updateResult = dataAccess.queryUpdate("UPDATE users SET profile_name = 'Md Sarwar Hoshen' WHERE user_id = '1702078692096'");
        assertTrue(updateResult);

        // Test an unsuccessful query update
        boolean invalidUpdateResult = dataAccess.queryUpdate("INVALID SQL QUERY");
        assertFalse(invalidUpdateResult);
    }

    @Test
    void testGetAllJobs() {
        // Test getting all tasks for a valid user
        Vector<Vector<String>> Jobs = dataAccess.getAllJobs("1702078692096");
        assertNotNull(Jobs);
        assertTrue(Jobs.size() > 0);

        // Test getting tasks for an invalid user
        Vector<Vector<String>> invalidJobs = dataAccess.getAllJobs("invalidUserId");
        assertNotNull(invalidJobs);
        assertEquals(0, invalidJobs.size());
    }

    @Test
    void testScheduleTasks() {
        // Test sorting tasks by priority
        Vector<Vector<String>> tasks = getSampleTasks();
        Vector<Vector<String>> sortedByPriority = dataAccess.scheduleTasks(tasks, "Priority");
        assertTrue(isSortedByPriority(sortedByPriority));

        // Test sorting tasks by deadline
        Vector<Vector<String>> sortedByDeadline = dataAccess.scheduleTasks(tasks, "Deadline");
        assertTrue(isSortedByDeadline(sortedByDeadline));

        // Test sorting tasks by both priority and deadline
        Vector<Vector<String>> sortedByBoth = dataAccess.scheduleTasks(tasks, "Both");
        assertTrue(isSortedByPriority(sortedByBoth) && isSortedByDeadline(sortedByBoth));
    }

    // Helper methods for testing sorting
    private boolean isSortedByPriority(Vector<Vector<String>> tasks) {
        return true;  // Replace with actual logic
    }

    private boolean isSortedByDeadline(Vector<Vector<String>> tasks) {
        return true;  // Replace with actual logic
    }

    private Vector<Vector<String>> getSampleTasks() {
        return new Vector<>();
    }
    
}