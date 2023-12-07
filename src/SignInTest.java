//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;
//import java.sql.SQLException;
//import org.junit.jupiter.api.Test;
//
//class SignInTest {
//
//    @Test
//    void isUserValid_ValidUser_ReturnsUserId()  throws SQLException{
//        DataAccess dataAccess = new DataAccess();
//        String userId = dataAccess.isUserValid("newUser3@gmail.com", "newPassword");
//        assertNotNull(userId);
//        assertFalse(userId.isEmpty());
//    }
//
//    @Test
//    void isUserValid_InvalidUser_ReturnsEmptyString()  throws SQLException{
//        DataAccess dataAccess = new DataAccess();
//        String userId = dataAccess.isUserValid("invalidUser", "invalidPassword");
//        assertTrue(userId.isEmpty());
//    }
//
//}
import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.event.ActionEvent;

public class SignInTest {

    @Test
    public void testSignInButtonAction() {
        SignIn signIn = new SignIn();

        // Mock user input
        signIn.textUsername.setText("asd@asdf.com");
        signIn.textPassword.setText("asd");

        // Create a mock action event for the sign-in button
        ActionEvent mockActionEvent = new ActionEvent(signIn.buttonLogin, ActionEvent.ACTION_PERFORMED, "SignIn");

        // Call the actionPerformed method with the mock action event
        signIn.actionPerformed(mockActionEvent);

        // Replace "YourValidUserId" with the expected user ID after successful sign-in
        String expectedUserId = "YourValidUserId";

        // Mock response from the DataAccess.isUserValid method
        String mockResponse = expectedUserId;

        // Override the DataAccess instance with a mock object
        signIn.api = new DataAccess() {
            @Override
            public String isUserValid(String username, String password) {
                return mockResponse;
            }
        };

        // Call the actionPerformed method with the mock action event
//        signIn.actionPerformed(mockActionEvent);

        // Assert that the user is redirected to the Home page
        assertTrue(signIn.home.isVisible());

        // Clean up any resources if needed
        signIn.dispose();
    }

    @Test
    public void testSignUpButtonAction() {
        SignIn signIn = new SignIn();
        
        // Create a mock action event for the sign-up button
        ActionEvent mockActionEvent = new ActionEvent(signIn.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");

        // Call the actionPerformed method with the mock action event
        signIn.actionPerformed(mockActionEvent);
        System.out.println("asd"+signIn.signup);
        // Assert that the SignUp frame is visible
        assertTrue(signIn.signup.isVisible());

        // Clean up any resources if needed
        signIn.dispose();
    }
}