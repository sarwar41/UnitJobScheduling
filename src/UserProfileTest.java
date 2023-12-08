import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;


@RunWith(MockitoJUnitRunner.class)
public class UserProfileTest {

	@Test
	public void testUpdateProfileButtonAction_ValidInput() {

		DataAccess mockDataAccess = Mockito.mock(DataAccess.class);
		UserProfile userProfile = new UserProfile();
		userProfile.api = mockDataAccess;
		userProfile.user_id = "1701989664305";
		userProfile.emailTextField.setText("test@example.com");
		userProfile.nameTextField.setText("TestUser");
//		when(mockDataAccess.executeQueryUpdate(anyString())).thenReturn(1);
		ActionEvent mockActionEvent = new ActionEvent(userProfile.updateButton, ActionEvent.ACTION_PERFORMED, "Update");
		userProfile.actionPerformed(mockActionEvent);
		assertEquals("Details are updated Successfully", userProfile.respN);
		userProfile.dispose();
	}

	@Test
	public void testUpdatePasswordButtonAction_ValidInput() {

		DataAccess mockDataAccess = Mockito.mock(DataAccess.class);
		UserProfile userProfile = new UserProfile();
		userProfile.api = mockDataAccess;
		userProfile.user_id = "1701989664305";
		userProfile.oldPasstextField.setText("asd");
		userProfile.newPasstextField.setText("asd");
		userProfile.user_pass = "688787d8ff144c502c7f5cffaafe2cc588d86079f9de88304c26b0cb99ce91c6";
//		when(mockDataAccess.passwordHashing(anyString())).thenReturn("hashedPassword");
//		when(mockDataAccess.executeQueryUpdate(anyString())).thenReturn(1);

		ActionEvent mockActionEvent = new ActionEvent(userProfile.btnUpdatePassword, ActionEvent.ACTION_PERFORMED,
				"UpdatePassword");
		userProfile.actionPerformed(mockActionEvent);
		assertEquals("New Password has updated succesfully.", userProfile.respN);
//		verify(mockDataAccess, times(1)).passwordHashing(anyString());
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
		userProfile.user_id = "1701989664305";
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


//	public void updateProfilePassword() {
//		api = new DataAccess();
//		String old_pass = String.valueOf(oldPasstextField.getPassword());
//		String new_pass = String.valueOf(newPasstextField.getPassword());
//
////		DataAccess db = new DataAccess();
//		if (!new_pass.isEmpty() && !old_pass.isEmpty()) {
//			if (api.passwordHashing(old_pass).equals(user_pass)) {
//
//				String updateQuery = "UPDATE users SET " + "user_password='" + api.passwordHashing(new_pass) + "' "
//						+ "WHERE user_id=" + user_id;
//
//				int resp = api.executeQueryUpdate(updateQuery);
//				if (resp > 0) {
//					JOptionPane.showMessageDialog(null, "New Password has updated succesfully.");
//					respN =  "New Password has updated succesfully.";
//					loadProfile();
//				} else {
//					JOptionPane.showMessageDialog(null, "Password has not updated.");
//					respN =  "New Password has not updated.";
//				}
//			} else {
//				respN =  "Old password doesn't match.";
//				JOptionPane.showMessageDialog(null, "Old password doesn't match.");
//			}
//		} else {
//			respN =  "Please enter your old and new password";
//			JOptionPane.showMessageDialog(null, "Please enter your old and new password");
//		}
//	}
//	@Test
//	public void testupdateProfilePasswordSuccess() {
//		UserProfile userProfile = new UserProfile();
//		userProfile.oldPasstextField.setText("asd");
//		userProfile.newPasstextField.setText("asd");
//		userProfile.user_id = "1701989664305";
//		userProfile.updateProfilePassword();
//		assertEquals("New Password has updated succesfully.", userProfile.respN);
//	}
	@Test
	public void testupdateProfilePasswordFail() {
		UserProfile userProfile = new UserProfile();
		userProfile.oldPasstextField.setText("asd");
		userProfile.newPasstextField.setText("asd");
		userProfile.user_pass = "688787d8ff144c502c7f5cffaafe2cc588d86079f9de88304c26b0cb99ce91c6";
		userProfile.user_id = "";
		userProfile.updateProfilePassword();
		System.out.println("userProfile.respN"+userProfile.respN);
		assertEquals("New Password has not updated.", userProfile.respN);
	}
	@Test
	public void testupdateProfilePasswordFieldCheck() {
		UserProfile userProfile = new UserProfile();
		userProfile.oldPasstextField.setText("");
		userProfile.newPasstextField.setText("asd");
		userProfile.user_id = "1701989664305";
		userProfile.updateProfilePassword();
		assertEquals("Please enter your old and new password", userProfile.respN);
	}
	@Test
	public void testupdateProfileOldPasswordFieldCheck() {
		UserProfile userProfile = new UserProfile();
		userProfile.oldPasstextField.setText("asdf");
		userProfile.newPasstextField.setText("asd");
		userProfile.user_id = "1701989664305";
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