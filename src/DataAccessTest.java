import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.*;

public class DataAccessTest {

    private DataAccess dataAccess;

    @Before
    public void setUp() {
        dataAccess = new DataAccess();
    }

    @After
    public void tearDown() {
        // Add cleanup logic if necessary
    }

    @Test
    public void testIsUserValid_ValidUser_ReturnsTrue() {
        assertTrue(dataAccess.isUserValid("asd@asdf.com", "asdasd"));
    }

    @Test
    public void testIsUserValid_InvalidUser_ReturnsFalse() {
        assertFalse(dataAccess.isUserValid("invalidUser", "invalidPassword"));
    }

    @Test
    public void testSignUp_SuccessfulSignUp_ReturnsSuccessMessage() {
        String result = dataAccess.signUp("newUser@gmail.com", "newPassword");
        assertEquals("User information saved successfully.", result);
    }

    @Test
    public void testSignUp_FailedSignUp_ReturnsFailureMessage() {
        // Assuming a case where the user cannot be saved successfully
        String result = dataAccess.signUp("existingUser", "existingPassword");
        assertEquals("User already exists. Please choose a different username.", result);
    }

    @Test
    public void testGetAllTasks_ReturnsTaskData() {
        Vector<Vector<String>> tasks = dataAccess.getAllTasks();
        assertNotNull(tasks);
        assertFalse(tasks.isEmpty());
    }

}