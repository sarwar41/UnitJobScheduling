import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;


@RunWith(MockitoJUnitRunner.class)
public class UserProfileTest {

	@Test
	public void testUpdateProfileButtonAction_ValidInput() {
		// update profile info success
		UserProfile userProfile = new UserProfile();
		userProfile.user_id = "1702078692096";	// need to change user id
		userProfile.emailTextField.setText("sarwar@gmail.com");
		userProfile.nameTextField.setText("Md Sarwar Hoshen");
//		when(mockDataAccess.executeQueryUpdate(anyString())).thenReturn(1);
		ActionEvent mockActionEvent = new ActionEvent(userProfile.updateButton, ActionEvent.ACTION_PERFORMED, "Update");
		userProfile.actionPerformed(mockActionEvent);
		assertEquals("Details are updated Successfully", userProfile.respN);
		userProfile.dispose();
	}

	@Test
	public void testUpdatePasswordButtonAction_ValidInput() {
		// password update valid
		UserProfile userProfile = new UserProfile();
		
		userProfile.user_id = "1702078692096"; // need to change user id
		userProfile.oldPasstextField.setText("asd"); // need to change user password
		userProfile.newPasstextField.setText("asd"); // need to change user password
		userProfile.user_pass = "688787d8ff144c502c7f5cffaafe2cc588d86079f9de88304c26b0cb99ce91c6";

		ActionEvent mockActionEvent = new ActionEvent(userProfile.btnUpdatePassword, ActionEvent.ACTION_PERFORMED,
				"UpdatePassword");
		userProfile.actionPerformed(mockActionEvent);
		assertEquals("New Password has updated succesfully.", userProfile.respN);
		userProfile.dispose();
	}

	@Test
	public void testBackButtonAction() {
		UserProfile userProfile = new UserProfile();
		ActionEvent mockActionEvent = new ActionEvent(userProfile.backButton, ActionEvent.ACTION_PERFORMED, "Home");
		userProfile.actionPerformed(mockActionEvent);
		assertTrue(userProfile.home.isVisible());
		userProfile.dispose();
	}

	@Test
	public void testLoadProfile() {
		UserProfile userProfile = new UserProfile();
		userProfile.user_id = "1702078692096";
		userProfile.loadProfile();
		assertEquals("Load Complete", userProfile.rsp);
	}

	@Test
	public void testLoadProfileFail() {
		UserProfile userProfile = new UserProfile();
		userProfile.user_id = "";
		userProfile.loadProfile();
		System.out.println("userProfile.rsp"+userProfile.rsp);
		assertEquals("No Complete", userProfile.rsp);
	}

	@Test
	public void testupdateProfilePasswordFail() {
		UserProfile userProfile = new UserProfile();
		userProfile.oldPasstextField.setText("asd");
		userProfile.newPasstextField.setText("asd");
		userProfile.user_pass = "688787d8ff144c502c7f5cffaafe2cc588d86079f9de88304c26b0cb99ce91c6";
		userProfile.user_id = "";
		userProfile.updateProfilePassword();
		assertEquals("New Password has not updated.", userProfile.respN);
	}
	@Test
	public void testupdateProfilePasswordFieldCheck() {
		UserProfile userProfile = new UserProfile();
		userProfile.oldPasstextField.setText("");
		userProfile.newPasstextField.setText("asd");
		userProfile.user_id = "1702078692096";
		userProfile.updateProfilePassword();
		assertEquals("Please enter your old and new password", userProfile.respN);
	}
	@Test
	public void testupdateProfileOldPasswordFieldCheck() {
		UserProfile userProfile = new UserProfile();
		userProfile.oldPasstextField.setText("asdf");
		userProfile.newPasstextField.setText("asd");
		userProfile.user_id = "1702078692096";
		userProfile.updateProfilePassword();
		assertEquals("Old password doesn't match.", userProfile.respN);
	}
	@Test
	public void updateProfileInfoFail() {

		UserProfile userProfile = new UserProfile();
		userProfile.user_id = "";
		userProfile.emailTextField.setText("test@example.com");
		userProfile.nameTextField.setText("TestUser");
		userProfile.updateProfileInfo();
		assertEquals("Details are not updated", userProfile.respN);
	}
}