package Test;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Test;

import src.Utils;

public class UtilsTest {

	@Test
	public void testIsEmailValid_ValidEmail_ReturnsTrue() {
		Utils utils = new Utils();
		assertTrue(utils.isEmailValid("test@example.com"));
		assertTrue(utils.isEmailValid("user123@domain.com"));
		assertFalse(utils.isEmailValid("john.doe"));
	}

	@Test
	public void testIsEmailValid_InvalidEmail_ReturnsFalse() {
		Utils utils = new Utils();
		assertFalse(utils.isEmailValid("invalid_email"));
		assertFalse(utils.isEmailValid("user@domain"));
		assertFalse(utils.isEmailValid("missing@dotcom"));
	}

	@Test
	public void testSaveAndLoadUserloggedInData() throws IOException {
		Utils utils = new Utils();
		String testData = "testUser123";
		Utils.saveUserloggedInData(testData);
		String loadedData = utils.loadUserloggedInData();
		assertEquals(testData, loadedData);

	}
}