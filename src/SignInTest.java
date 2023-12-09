import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.awt.event.ActionEvent;

@RunWith(MockitoJUnitRunner.class)
public class SignInTest {

	@Test
	public void testSignInButtonAction() {
		//check sign in success
		SignIn signIn = new SignIn();
		signIn.textUsername.setText("sarwar@gmail.com");
		signIn.textPassword.setText("asd");
		ActionEvent mockActionEvent = new ActionEvent(signIn.buttonLogin, ActionEvent.ACTION_PERFORMED, "SignIn");
		signIn.actionPerformed(mockActionEvent);
	
		assertTrue(signIn.home.isVisible());
		signIn.dispose();
	}

	@Test
	public void testSignUpButtonAction() {
		//check sign up page navigate
		SignIn signIn = new SignIn();
		ActionEvent mockActionEvent = new ActionEvent(signIn.buttonSignup, ActionEvent.ACTION_PERFORMED, "SignUp");
		signIn.actionPerformed(mockActionEvent);
		assertTrue(signIn.signup.isVisible());
		signIn.dispose();
	}
	@Test
	public void checkEmailandPasswordNotEmpty() {
		SignIn signIn = new SignIn();
		signIn.textUsername.setText(null);
		signIn.textPassword.setText(null);
		ActionEvent mockActionEvent = new ActionEvent(signIn.buttonLogin, ActionEvent.ACTION_PERFORMED, "SignUp");
		signIn.actionPerformed(mockActionEvent);
		assertEquals("Please fill in all fields.", signIn.resp);
	}
	@Test
	public void checkEmailVerified() {
		SignIn signIn = new SignIn();
		signIn.textUsername.setText("invalidEmail");
		signIn.textPassword.setText("asd");
		ActionEvent mockActionEvent = new ActionEvent(signIn.buttonLogin, ActionEvent.ACTION_PERFORMED, "SignUp");
		signIn.actionPerformed(mockActionEvent);
		assertEquals("Your provided email is not a valid email, Please Provide a valid email.", signIn.resp);
	}
	@Test
	public void checkSignInError() {
		SignIn signIn = new SignIn();
		signIn.textUsername.setText("invalidEmail@gmail.com");
		signIn.textPassword.setText("asd");
		ActionEvent mockActionEvent = new ActionEvent(signIn.buttonLogin, ActionEvent.ACTION_PERFORMED, "SignUp");
		signIn.actionPerformed(mockActionEvent);
		assertEquals("You've provided wrong email and password", signIn.resp);
	}
}