package Test;
import src.DataAccess;
import src.SignIn;
import src.UserProfile;

//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import java.awt.event.ActionEvent;
//import java.sql.SQLException;
//
//public class UserProfileTest {
//
//	public UserProfile userProfile;
//
//    @Before
//    public void setUp() {
//    	userProfile = new UserProfile();
////        userProfile.db = Mockito.mock(DataAccess.class);
//    }
//
//    @Test
//    public void testLoadProfile() throws SQLException {
//        userProfile.loadProfile();
//        assertEquals("Load Complete", userProfile.rsp);
//    }
////
//    @Test
//    public void testUpdateButtonAction() {
//       
//    	 ActionEvent mockActionEvent = new ActionEvent(userProfile.updateButton, ActionEvent.ACTION_PERFORMED, "UserProfile");
//    	 userProfile.actionPerformed(mockActionEvent);
//         System.out.println("resp"+userProfile.rsp);
//         assertTrue("Details are updated Successfully".equals(userProfile.rsp));
//
//    }
////
//    @Test
//    public void testUpdatePasswordButtonAction() {
//    	ActionEvent mockActionEvent = new ActionEvent(userProfile.btnUpdatePassword, ActionEvent.ACTION_PERFORMED, "UserProfile");
//   	    userProfile.actionPerformed(mockActionEvent);
//        System.out.println("resp"+userProfile.rsp);
//        assertTrue("New Password has updated succesfully.".equals(userProfile.rsp));
//    }
//
//    @Test
//    public void testBackButtonAction() {
//    	
//        ActionEvent mockActionEvent = new ActionEvent(userProfile.backButton, ActionEvent.ACTION_PERFORMED, "Home");
//        userProfile.actionPerformed(mockActionEvent);
//        System.out.println("userProfile.home.isVisible()"+userProfile.home.isVisible());
//        assertTrue(userProfile.home.isVisible());
//        // Clean up any resources if needed
//        userProfile.dispose();
//    }
//}
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.event.ActionEvent;

public class UserProfileTest {

    @Test
    public void testUpdateProfileButtonAction_ValidInput() {
        // Mock the external dependencies
        DataAccess mockDataAccess = Mockito.mock(DataAccess.class);
     
        // Create the UserProfile instance
        UserProfile userProfile = new UserProfile();
        userProfile.api = mockDataAccess;

        // Mock user input
        userProfile.emailTextField.setText("test@example.com");
        userProfile.nameTextField.setText("TestUser");

        // Mock database response
        when(mockDataAccess.executeQueryUpdate(anyString())).thenReturn(1);

        // Create a mock action event for the update button
        ActionEvent mockActionEvent = new ActionEvent(userProfile.updateButton, ActionEvent.ACTION_PERFORMED, "Update");

        // Call the actionPerformed method with the mock action event
        userProfile.actionPerformed(mockActionEvent);

        // Assert that the database update was called
        verify(mockDataAccess, times(1)).executeQueryUpdate(anyString());

        // Clean up any resources if needed
        userProfile.dispose();
    }

    @Test
    public void testUpdatePasswordButtonAction_ValidInput() {
        // Mock the external dependencies
        DataAccess mockDataAccess = Mockito.mock(DataAccess.class);

        // Create the UserProfile instance
        UserProfile userProfile = new UserProfile();
        userProfile.api = mockDataAccess;

        // Mock user input
        userProfile.oldPasstextField.setText("oldPassword");
        userProfile.newPasstextField.setText("newPassword");

        // Mock database response
        when(mockDataAccess.passwordHashing(anyString())).thenReturn("hashedPassword");
        when(mockDataAccess.executeQueryUpdate(anyString())).thenReturn(1);

        // Create a mock action event for the update password button
        ActionEvent mockActionEvent = new ActionEvent(userProfile.btnUpdatePassword, ActionEvent.ACTION_PERFORMED, "UpdatePassword");

        // Call the actionPerformed method with the mock action event
        userProfile.actionPerformed(mockActionEvent);

        // Assert that the password hashing and database update were called
        verify(mockDataAccess, times(1)).passwordHashing(anyString());
//        verify(mockDataAccess, times(1)).executeQueryUpdate(anyString());

        // Clean up any resources if needed
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
}