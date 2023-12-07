package Test;
import org.junit.Test;
import src.SignUp;
import src.Utils;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;
import src.DataAccess;
import java.sql.SQLException;

public class SignUpTest {
	@Test
	public void testSignUp_UserAlreadyExists() {
		// Mock the external dependencies

		// Create the SignUp instance
		SignUp signUp = new SignUp();

		// Mock user input
		signUp.textUsername.setText("existingUser@example.com");
		signUp.textPassword.setText("password123");
		signUp.profileNameTextField.setText("TestUser");

		 // Mock Utils.isEmailValid response
	    signUp.utils = new Utils() {
	        @Override
	        public boolean isEmailValid(String email) {
	            return true;
	        }
	    };
		// Mock the result set to simulate an existing user
		signUp.api = new DataAccess() {
			@Override
			public String signUp(String username, String password, String profileName) {
				return "User already exists. Please choose a different username.";
			}
		};

		ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");

		// Call the actionPerformed method with the mock action event
		signUp.actionPerformed(mockActionEvent);

		// Assert the expected response
		assertEquals("User already exists. Please choose a different username.", signUp.resp);
	}

	@Test
	public void testSignUp_SuccessfulSignUp() {
	
		SignUp signUp = new SignUp();

		signUp.textUsername.setText("newUser120@example.com");
		signUp.textPassword.setText("password123");
		signUp.profileNameTextField.setText("TestUser");
		
		 // Mock Utils.isEmailValid response
	    signUp.utils = new Utils() {
	        @Override
	        public boolean isEmailValid(String email) {
	            return true;
	        }
	    };
		
		signUp.api = new DataAccess() {
			@Override
			public String signUp(String username, String password, String profileName) {
				return null; // Simulate a non-existing user
			}
		};

		ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");

		signUp.actionPerformed(mockActionEvent);

		assertEquals("User information saved successfully.", signUp.resp);
	}
	@Test
	public void testHandleSignUpButton_InvalidInput() {
	    // Mock the external dependencies
	    
	    // Create the SignUp instance
	    SignUp signUp = new SignUp();

	    // Mock user input with invalid data
	    signUp.textUsername.setText("");  // Empty username
	    signUp.textPassword.setText("password123");
	    signUp.profileNameTextField.setText("TestUser");

	    // Mock Utils.isEmailValid response
	    signUp.utils = new Utils() {
	        @Override
	        public boolean isEmailValid(String email) {
	            return true;  // You can set this to false to test the email verification failure case
	        }
	    };

	    ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");

	    // Call the actionPerformed method with the mock action event
	    signUp.actionPerformed(mockActionEvent);

	    // Assert the expected response or behavior based on your implementation
	    // For example, you may expect an error message to be displayed or resp to be null
	    assertTrue("Your provided email is not a valid email. Please provide a valid email.".equals(signUp.resp) || signUp.resp == null);
	}
	@Test
	public void testHandleSignUpButton_InvalidEmail() {
	    // Mock the external dependencies
	    
	    // Create the SignUp instance
	    SignUp signUp = new SignUp();

	    // Mock user input
	    signUp.textUsername.setText("invalid-email");
	    signUp.textPassword.setText("password123");
	    signUp.profileNameTextField.setText("TestUser");

	    // Mock Utils.isEmailValid response
	    signUp.utils = new Utils() {
	        @Override
	        public boolean isEmailValid(String email) {
	            return false;
	        }
	    };

	    ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");

	    // Call the actionPerformed method with the mock action event
	    signUp.actionPerformed(mockActionEvent);

	    // Assert the expected response
	    assertTrue("Your provided email is not a valid email. Please provide a valid email.".equals(signUp.resp) || signUp.resp == null);
	}
	@Test
    public void testCancelButtonAction() {
    	 SignUp signUp = new SignUp();
         ActionEvent mockActionEvent = new ActionEvent(signUp.buttonCancel, ActionEvent.ACTION_PERFORMED, "SignIn");
         signUp.actionPerformed(mockActionEvent);
         System.out.println("asd"+signUp.signIn);
         assertTrue(signUp.signIn.isVisible());
         signUp.dispose();
    }
//    @Test(expected = SQLException.class)
//    public void testSignUpButtonAction_ValidInput() {
//        // Mock the external dependencies
//      
//        // Create the SignUp instance
//        SignUp signUp = new SignUp();
//
//        // Mock user input
//        signUp.textUsername.setText("test@example.com");
//        signUp.textPassword.setText("password123");
//        signUp.profileNameTextField.setText("TestUser");
//        ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
//        // Call the actionPerformed method with the mock action event
//        signUp.actionPerformed(mockActionEvent);
//        String mockResponse = "User information saved successfully";
//        signUp.api = new DataAccess() {
//            @Override
//            public String signUp(String username, String password, String profileName) {
//                return mockResponse;
//            }
//        };
//        System.out.println("Utils.isEmailValid(\"test@example.com\")"+signUp.resp);
//        // Mock Utils.isEmailValid response
//        
////        assertEquals("User information saved successfully.", signUp.resp);
//        assertTrue("User already exists. Please choose a different username.".equals(signUp.resp) || "User information saved successfully.".equals(signUp.resp) || "Failed to save user information.".equals(signUp.resp));
//
//    }
//
//    @Test
//    public void testCancelButtonAction() {
//    	 SignUp signUp = new SignUp();
//         // Create a mock action event for the sign-up button
//         ActionEvent mockActionEvent = new ActionEvent(signUp.buttonCancel, ActionEvent.ACTION_PERFORMED, "SignIn");
//         // Call the actionPerformed method with the mock action event
//         signUp.actionPerformed(mockActionEvent);
//         System.out.println("asd"+signUp.signIn);
//         // Assert that the SignUp frame is visible
//         assertTrue(signUp.signIn.isVisible());
//         // Clean up any resources if needed
//         signUp.dispose();
//    }

	// Add more test cases for other scenarios (invalid email, empty fields, etc.)
}