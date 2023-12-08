//
//
////import static org.junit.Assert.assertFalse;
////import static org.junit.Assert.assertNotNull;
////import static org.junit.Assert.assertTrue;
////import static org.junit.jupiter.api.Assertions.*;
////import java.sql.SQLException;
////import org.junit.jupiter.api.Test;
////
////class SignInTest {
////
////    @Test
////    void isUserValid_ValidUser_ReturnsUserId()  throws SQLException{
////        DataAccess dataAccess = new DataAccess();
////        String userId = dataAccess.isUserValid("asd@asdf.com", "asd");
////        assertNotNull(userId);
////        assertFalse(userId.isEmpty());
////    }
////
////    @Test
////    void isUserValid_InvalidUser_ReturnsEmptyString()  throws SQLException{
////        DataAccess dataAccess = new DataAccess();
////        String userId = dataAccess.isUserValid("invalidUser", "invalidPassword");
////        assertTrue(userId.isEmpty());
////    }
////
////}
//import static org.junit.Assert.*;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.junit.MockitoJUnitRunner;
//import java.awt.event.ActionEvent;
//
//@RunWith(MockitoJUnitRunner.class)
//public class SignInTest {
//
//	@Test
//	public void testSignInButtonAction() {
//		SignIn signIn = new SignIn();
//		signIn.textUsername.setText("test@example.com");
//		signIn.textPassword.setText("asd");
//		ActionEvent mockActionEvent = new ActionEvent(signIn.buttonLogin, ActionEvent.ACTION_PERFORMED, "SignIn");
//		signIn.actionPerformed(mockActionEvent);
//		String expectedUserId = "YourValidUserId";
//		String mockResponse = expectedUserId;
//		signIn.api = new DataAccess() {
//			@Override
//			public String isUserValid(String username, String password) {
//				return mockResponse;
//			}
//		};
//		assertTrue(signIn.home.isVisible());
//		signIn.dispose();
//	}
//
//	@Test
//	public void testSignUpButtonAction() {
//		SignIn signIn = new SignIn();
//		ActionEvent mockActionEvent = new ActionEvent(signIn.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
//		signIn.actionPerformed(mockActionEvent);
//		System.out.println("asd" + signIn.signup);
//		assertTrue(signIn.signup.isVisible());
//		signIn.dispose();
//	}
//}