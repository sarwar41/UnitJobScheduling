import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserProfileTest {

	public UserProfile userProfile;

    @Before
    public void setUp() {
    	userProfile = new UserProfile();
//        userProfile.db = Mockito.mock(DataAccess.class);
    }

    @Test
    public void testLoadProfile() throws SQLException {
        userProfile.loadProfile();
        assertEquals("Load Complete", userProfile.rsp);
    }
//
    @Test
    public void testUpdateButtonAction() {
       
    	 ActionEvent mockActionEvent = new ActionEvent(userProfile.updateButton, ActionEvent.ACTION_PERFORMED, "UserProfile");
    	 userProfile.actionPerformed(mockActionEvent);
         System.out.println("resp"+userProfile.rsp);
         assertTrue("Details are updated Successfully".equals(userProfile.rsp));

    }
//
    @Test
    public void testUpdatePasswordButtonAction() {
    	ActionEvent mockActionEvent = new ActionEvent(userProfile.btnUpdatePassword, ActionEvent.ACTION_PERFORMED, "UserProfile");
   	    userProfile.actionPerformed(mockActionEvent);
        System.out.println("resp"+userProfile.rsp);
        assertTrue("New Password has updated succesfully.".equals(userProfile.rsp));
    }

    @Test
    public void testBackButtonAction() {
    	
        ActionEvent mockActionEvent = new ActionEvent(userProfile.backButton, ActionEvent.ACTION_PERFORMED, "Home");
        userProfile.actionPerformed(mockActionEvent);
        System.out.println("userProfile.home.isVisible()"+userProfile.home.isVisible());
        assertTrue(userProfile.home.isVisible());
        // Clean up any resources if needed
        userProfile.dispose();
    }
}