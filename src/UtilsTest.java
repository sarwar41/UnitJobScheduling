import static org.junit.Assert.*;
import org.junit.Test;

public class UtilsTest {

	@Test
	public void testIsEmailValid_ValidEmail_ReturnsTrue() {
		assertTrue(Utils.isEmailValid("test@example.com"));
		assertTrue(Utils.isEmailValid("user123@domain.com"));
		assertTrue(Utils.isEmailValid("john.doe@mail-server.net"));
	}

	@Test
	public void testIsEmailValid_InvalidEmail_ReturnsFalse() {
		assertFalse(Utils.isEmailValid("invalid_email"));
		assertFalse(Utils.isEmailValid("user@domain"));
		assertFalse(Utils.isEmailValid("missing@dotcom"));
	}

	@Test
	public void testSaveAndLoadUserloggedInData() {
		Utils utils = new Utils();

		// Save data
		String testData = "testUser123";
		utils.saveUserloggedInData(testData);

		// Load data and check if it matches
		String loadedData = utils.loadUserloggedInData();
		assertEquals(testData, loadedData);
	}
}