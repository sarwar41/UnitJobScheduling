import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void testIsEmailValid_ValidEmail_ReturnsTrue(){
		assertTrue(Utils.isEmailValid("test@example.com"));
        assertTrue(Utils.isEmailValid("user123@domain.com"));
        assertFalse(Utils.isEmailValid("john.doe"));
	}

	@Test
	public void testIsEmailValid_InvalidEmail_ReturnsFalse(){
		assertFalse(Utils.isEmailValid("invalid_email"));
		assertFalse(Utils.isEmailValid("user@domain"));
		assertFalse(Utils.isEmailValid("missing@dotcom"));
	}

	@Test
	public void testSaveAndLoadUserloggedInData()throws IOException{
		
		
		Utils utils = new Utils();

		// Save data
		String testData = "testUser123";
		try {
			Utils.saveUserloggedInData(testData);
			String loadedData = utils.loadUserloggedInData();
			assertEquals(testData, loadedData);
		} catch (IOException e) {
			e.printStackTrace();
			// Handle the exception as needed
		}

		// Load data and check if it matches
	
	}
}