package Test;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import src.DataAccess;
import src.Home;
import src.Utils;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class HomeTest {
    @Mock
    DataAccess mockDataAccess;

    @Mock
    Utils mockUtils;

    private Home home;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        home = new Home();
        home.setVisible(false);
    }

    @Test
    public void testAddJobButtonAction() {
    	ActionEvent mockActionEvent = new ActionEvent(home.addJob, ActionEvent.ACTION_PERFORMED, "Profile");
  	    home.actionPerformed(mockActionEvent);
//    	home.addJob();
    }

    @Test
    public void testUpdateJobButtonAction() {
    	ActionEvent mockActionEvent = new ActionEvent(home.updateJob, ActionEvent.ACTION_PERFORMED, "Profile");
  	    home.actionPerformed(mockActionEvent);
//    	home.updateJob();
    }

    @Test
    public void testDeleteJobButtonAction() {
    	ActionEvent mockActionEvent = new ActionEvent(home.deleteJob, ActionEvent.ACTION_PERFORMED, "Profile");
  	    home.actionPerformed(mockActionEvent);
//    	home.deleteJob();
    }

    @Test
    public void testAddJobSuccess() {
        Home home = new Home();
        home.taskNameField.setText("Test Task");
        home.taskTypeField.setText("Test Type");
        home.taskStartField.setText("2023-01-01");
        home.taskEndField.setText("2023-01-10");
        home.statusDropdown.setSelectedItem("In Progress");
        home.priorityDropdown.setSelectedItem("High");
        home.taskDescField.setText("Test Description");
        home.addJob();
        assertEquals("Details are added Successfully", home.rsp);
    }
//    @Test
//    public void testAddJobFail() {
//        Home home = new Home();
//        home.taskNameField.setText("Test Task");
//        home.taskTypeField.setText("Test Type");
//        home.taskStartField.setText("2023-01-01");
//        home.taskEndField.setText("2023-01-10");
//        home.statusDropdown.setSelectedItem("In Progress");
//        home.priorityDropdown.setSelectedItem("High");
//        home.taskDescField.setText("Test Description");
//        home.addJob();
//        assertEquals("Details are added Successfully", home.rsp);
//    }
    @Test
    public void checkTaskIdBeforeUpdate() {
        Home home = new Home();
        home.sel_task_id = 0;
        home.taskNameField.setText("Updated Task 2");
        home.updateJob();
        assertEquals("Please select a task first to update", home.rsp);
       
    }
    @Test
    public void checkTaskIdBeforeDelete() {
        Home home = new Home();
        home.sel_task_id = 0;
        home.taskNameField.setText("Updated Task 2");
        home.deleteJob();
        assertEquals("Please select a task first to delete", home.rsp);
       
    }
    @Test
    public void testUpdateJobSuccess() {
        Home home = new Home();
        home.sel_task_id = 2;
        home.taskNameField.setText("Updated Task 2");
        home.updateJob();
        assertEquals("Details are updated Successfully", home.rsp);
       
    }
    @Test
    public void testUpdateJobFail() {
        Home home = new Home();
        home.sel_task_id = 10000000;
        home.taskNameField.setText("Updated Task 2");
        home.updateJob();
        assertEquals("Details are not updated", home.rsp);
       
    }
    @Test
    public void testDeleteJobSuccess() {
        Home home = new Home();
        home.sel_task_id = 8;
        home.deleteJob();
        assertEquals("Task has deleted Successfully", home.rsp);
    }
    @Test
    public void testDeleteJobFail() {
        Home home = new Home();
        home.sel_task_id = 10000000;
        home.deleteJob();
        assertEquals("Task has not deleted.", home.rsp);
    }

    @Test
    public void testProfileButtonAction() {
	    ActionEvent mockActionEvent = new ActionEvent(home.profileBtn, ActionEvent.ACTION_PERFORMED, "Profile");
	    home.actionPerformed(mockActionEvent);
	    assertTrue(home.userProfile.isVisible());
	    home.dispose();
    }
    @Test
    public void checkUserId() {
        Home home = new Home();
        home.user_id = "";
        home.taskNameField.setText("Updated Task 2");
        home.addJob();
        assertEquals("please login to add data", home.rsp);
       
    }
    
}