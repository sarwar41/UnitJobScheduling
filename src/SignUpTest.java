

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;

@RunWith(MockitoJUnitRunner.class)
public class SignUpTest {
	@Test
	public void testSignUp_UserAlreadyExists() {
		//check all ready exits user
		SignUp signUp = new SignUp();
		signUp.textUsername.setText("sarwar@gmail.com");
		signUp.textPassword.setText("asd");
		signUp.profileNameTextField.setText("sarwar");
		
		ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
		signUp.actionPerformed(mockActionEvent);
		
		assertEquals("User already exists. Please choose a different username.", signUp.resp);
	}

	@Test
	public void testSignUp_SuccessfulSignUp() {
		//test sign up success
		SignUp signUp = new SignUp();
		signUp.textUsername.setText("testnewuser1@example.com"); // change email address .
		signUp.textPassword.setText("password");
		signUp.profileNameTextField.setText("TestUser");
		ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
		signUp.actionPerformed(mockActionEvent);
		assertEquals("User information saved successfully.", signUp.resp);
	}

	@Test
	public void testHandleSignUpButton_InvalidInput() {
		//email valid check
		SignUp signUp = new SignUp();
		signUp.textUsername.setText("");
		signUp.textPassword.setText("");
		signUp.profileNameTextField.setText("TestUser");

		ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
		signUp.actionPerformed(mockActionEvent);
		
		assertTrue("Please fill in all fields.".equals(signUp.resp)
				|| signUp.resp == null);
	}

	@Test
	public void testHandleSignUpButton_InvalidEmail() {
		//email valid check
		SignUp signUp = new SignUp();
		signUp.textUsername.setText("invalid-email");
		signUp.textPassword.setText("password123");
		signUp.profileNameTextField.setText("TestUser");
		
		ActionEvent mockActionEvent = new ActionEvent(signUp.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
		signUp.actionPerformed(mockActionEvent);
		assertTrue("Your provided email is not a valid email. Please provide a valid email.".equals(signUp.resp)
				|| signUp.resp == null);
	}

	@Test
	public void testCancelButtonAction() {
		SignUp signUp = new SignUp();
		ActionEvent mockActionEvent = new ActionEvent(signUp.buttonCancel, ActionEvent.ACTION_PERFORMED, "SignIn");
		signUp.actionPerformed(mockActionEvent);
		System.out.println("asd" + signUp.signIn);
		assertTrue(signUp.signIn.isVisible());
		signUp.dispose();
	}
}