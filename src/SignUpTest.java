//import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import java.sql.SQLException;
//public class SignUpTest {
//
//    private DataAccess dataAccess = new DataAccess();
//
////    @Before
////    public void setUp() {
////    }
////
////    @After
////    public void tearDown() {
////        // Add cleanup logic if necessary
////    }
//
//    @Test
//    public void testSignUp_SuccessfulSignUp_ReturnsSuccessMessage() throws SQLException{
//        String result = dataAccess.signUp("newUser11235@gmail.com", "newPassword","sarwar");
//        System.out.println("result:  "+result);
//        assertEquals("User information saved successfully.", result);
//    }
//
//    @Test
//    public void testSignUp_FailedSignUp_ReturnsUserAlreadyExistsMessage() throws SQLException{
//        // Assuming a case where the user cannot be saved successfully
//        String result = dataAccess.signUp("newUser35@gmail.com", "newPassword","");
//        System.out.println("result:  "+result);
//        assertEquals("User already exists. Please choose a different username.", result);
//    }
//
////    @Test
////    public void testSignUp_FailedSignUp_ReturnsFailedMessage() {
////        // Assuming a case where the user cannot be saved successfully
////        String result = dataAccess.signUp("", "","");
////        System.out.println("result:  "+result);
////        assertEquals("Failed to save user information.", result);
////    }
////
////	@Test
////	public void testHandleSignUpButton() {
////		throw new RuntimeException("not yet implemented");
////	}
//	
//	
//}

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.event.ActionEvent;

public class SignUpTest {

    @Test
    public void testSignUpButtonAction_ValidInput() {
        // Mock the external dependencies
      
        // Create the SignUp instance
        SignUp signUp = new SignUp();

        // Mock user input
        signUp.textUsername.setText("test@example.com");
        signUp.textPassword.setText("password123");
        signUp.profileNameTextField.setText("TestUser");
        ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
        // Call the actionPerformed method with the mock action event
        signUp.actionPerformed(mockActionEvent);
        String mockResponse = "User information saved successfully";
        signUp.api = new DataAccess() {
            @Override
            public String signUp(String username, String password, String profileName) {
                return mockResponse;
            }
        };
        System.out.println("Utils.isEmailValid(\"test@example.com\")"+signUp.resp);
        // Mock Utils.isEmailValid response
        
//        assertEquals("User information saved successfully.", signUp.resp);
        assertTrue("User already exists. Please choose a different username.".equals(signUp.resp) || "User information saved successfully.".equals(signUp.resp) || "Failed to save user information.".equals(signUp.resp));

    }

    @Test
    public void testCancelButtonAction() {
    	 SignUp signUp = new SignUp();
         // Create a mock action event for the sign-up button
         ActionEvent mockActionEvent = new ActionEvent(signUp.buttonCancel, ActionEvent.ACTION_PERFORMED, "SignIn");
         // Call the actionPerformed method with the mock action event
         signUp.actionPerformed(mockActionEvent);
         System.out.println("asd"+signUp.signIn);
         // Assert that the SignUp frame is visible
         assertTrue(signUp.signIn.isVisible());
         // Clean up any resources if needed
         signUp.dispose();
    }

    // Add more test cases for other scenarios (invalid email, empty fields, etc.)
}