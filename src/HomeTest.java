
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.awt.event.ActionEvent;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
		// test add job button
		ActionEvent mockActionEvent = new ActionEvent(home.addJob, ActionEvent.ACTION_PERFORMED, "Home");
		home.actionPerformed(mockActionEvent);
	}

	@Test
	public void testUpdateJobButtonAction() {
		// test update job button
		ActionEvent mockActionEvent = new ActionEvent(home.updateJob, ActionEvent.ACTION_PERFORMED, "Home");
		home.actionPerformed(mockActionEvent);
	}

	@Test
	public void testDeleteJobButtonAction() {
		// test delete job button
		ActionEvent mockActionEvent = new ActionEvent(home.deleteJob, ActionEvent.ACTION_PERFORMED, "Home");
		home.actionPerformed(mockActionEvent);
	}

	@Test
	public void testAddJobWithoutData() {
		Home home = new Home();
		home.taskNameField.setText(null);
		home.taskTypeField.setText(null);
		home.stDate.setDate(null);
		home.enDate.setDate(null);
		home.statusDropdown.setSelectedItem(null);
		home.priorityDropdown.setSelectedItem(null);
		home.taskDescField.setText(null);
		home.addJob();
		assertEquals("Please fill in all fields.", home.rsp);
	}

	@Test
	public void testAddJobSuccess() {
		// check job add success
		Home home = new Home();
		home.taskNameField.setText("Test Task");
		home.taskTypeField.setText("Test Type");
		home.stDate.setDate(home.stringToDate("01/12/2023"));
		home.enDate.setDate(home.stringToDate("11/12/2023"));
		home.statusDropdown.setSelectedItem("In Progress");
		home.priorityDropdown.setSelectedItem("High");
		home.taskDescField.setText("Test Description");
		home.addJob();
		assertEquals("Details are added Successfully", home.rsp);
		home.clearAllInput();
	}

	@Test
	public void checkTaskIdBeforeUpdate() {
		//check task_id before update
		Home home = new Home();
		home.sel_task_id = 0;
		home.taskNameField.setText("Updated Task 2");
		home.updateJob();
		assertEquals("Please select a task first to update", home.rsp);
	}

	@Test
	public void checkTaskIdBeforeDelete() {
		//check task_id before delete
		Home home = new Home();
		home.sel_task_id = 0;
		home.taskNameField.setText("Updated Task 2");
		home.deleteJob();
		assertEquals("Please select a task first to delete", home.rsp);

	}

	@Test
	public void testUpdateJobSuccess() {
		//delete job success
		Home home = new Home();
		home.sel_task_id = 80;
		home.taskNameField.setText("Updated Task 2");
		home.updateJob();
		assertEquals("Details are updated Successfully", home.rsp);

	}

	@Test
	public void testUpdateJobFail() {
		//update job Fail
		Home home = new Home();
		home.sel_task_id = 10000000;
		home.taskNameField.setText("Updated Task 2");
		home.updateJob();
		assertEquals("Details are not updated", home.rsp);
	}

	@Test
	public void testDeleteJobSuccess() {
		//delete job success
		Home home = new Home();
		home.sel_task_id = 215;   // need to change id to check ////////////////////////////////////////
		home.deleteJob();
		assertEquals("Task has deleted Successfully", home.rsp);
	}

	@Test
	public void testDeleteJobFail() {
		//delete job fail
		Home home = new Home();
		home.sel_task_id = 10000000;
		home.deleteJob();
		assertEquals("Task has not deleted.", home.rsp);
	}

	@Test
	public void testProfileButtonAction() {
		//check profile button working or not
		ActionEvent mockActionEvent = new ActionEvent(home.profileBtn, ActionEvent.ACTION_PERFORMED, "Profile");
		home.actionPerformed(mockActionEvent);
		assertTrue(home.userProfile.isVisible());
		home.dispose();
	}

	@Test
	public void checkUserId() {
		// check user logged in or not
		Home home = new Home();
		home.user_id = "";
		home.taskNameField.setText("Updated Task 2");
		home.addJob();
		assertEquals("please login to add data", home.rsp);
	}

}