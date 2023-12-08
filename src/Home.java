
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Home extends JFrame implements ActionListener {

	public JButton addJob;
	public JButton updateJob;
	public JButton deleteJob;
	public JButton profileBtn;
	public JPanel panel;
	public JTable table;
	public DefaultTableModel tableModel;
	public JScrollPane scrollPane;
	public JLabel taskNameLabel, taskTypeLabel, taskDescLabel, taskStartLabel, taskEndLabel, status, priority,
			lblScheduledBy;
	public JTextField taskNameField, taskTypeField, taskStartField, taskEndField;
	public JComboBox statusDropdown, priorityDropdown, scheduleDropdown;
	public JTextArea taskDescField;
	public int sel_task_id;
	public String user_id;
	public String rsp = null;
	public UserProfile  userProfile;
	
	public Home() {
		//load user_id
		user_id = Utils.loadUserloggedInData();
		//
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);

		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		JLabel heading = new JLabel("Job Scheduler");
		heading.setBounds(255, 0, 201, 40);
		heading.setFont(new Font("Candela", Font.BOLD, 25));
		getContentPane().add(heading);

		addJob = new JButton("Add Job");
		addJob.setBounds(537, 538, 124, 40);
		addJob.addActionListener(this);
		getContentPane().add(addJob);

		updateJob = new JButton("Update Job");
		updateJob.setBounds(673, 538, 124, 40);
		updateJob.addActionListener(this);
		getContentPane().add(updateJob);

		deleteJob = new JButton("Delete Job");
		deleteJob.setBounds(809, 538, 124, 40);
		deleteJob.addActionListener(this);
		getContentPane().add(deleteJob);
		//
		lblScheduledBy = new JLabel(" Scheduled By: ");
		lblScheduledBy.setBounds(17, 60, 100, 30);
		getContentPane().add(lblScheduledBy);
		//
		String scheduleList[] = { "Priority", "Deadline", "Both" };
		scheduleDropdown = new JComboBox<Object>(scheduleList);
		scheduleDropdown.setBounds(113, 55, 180, 40);
		getContentPane().add(scheduleDropdown);
		//
		getContentPane().add(panel);

		table = new JTable();
		table.setBounds(16, 61, 1, 1);
		table.setSize(getPreferredSize());
		//
		Vector<String> columns = new Vector<String>();
		columns.add("Task id");
		columns.add("Name");
		columns.add("Type");
		columns.add("Description");
		columns.add("Status");
		columns.add("Start Date");
		columns.add("End Date");
		columns.add("Priority");

		try {
		    DataAccess data = new DataAccess();
		    tableModel = new DefaultTableModel(data.scheduleTasks(data.getAllJobs(user_id), "Priority"), columns);
	        table = new JTable(tableModel) {
	            private static final long serialVersionUID = 1L;

	            public boolean isCellEditable(int row, int column) {
	                return column == 0;
	            }
	        };
		} catch (Exception e) {
		    e.printStackTrace();
		}
		// Get the TableColumnModel
		TableColumnModel columnModel = table.getColumnModel();
		// Hide the "Task id" column
		TableColumn taskIDColumn = columnModel.getColumn(0);
		columnModel.removeColumn(taskIDColumn);

		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(17, 112, 489, 633);
//		panel.add(scrollPane);
//		
//		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
//		scrollPane_1.setBounds(17, 60, 541, 472);
		getContentPane().add(scrollPane);

		taskNameLabel = new JLabel("Task Name: ");
		taskNameLabel.setBounds(530, 112, 100, 30);
		getContentPane().add(taskNameLabel);

		taskNameField = new JTextField();
		taskNameField.setBounds(530, 142, 200, 30);
		getContentPane().add(taskNameField);

		taskTypeLabel = new JLabel("Task Type");
		taskTypeLabel.setBounds(764, 112, 100, 30);
		getContentPane().add(taskTypeLabel);

		taskTypeField = new JTextField();
		taskTypeField.setBounds(764, 142, 200, 30);
		getContentPane().add(taskTypeField);

		taskStartLabel = new JLabel(" Start Date: ");
		taskStartLabel.setBounds(530, 194, 100, 30);
		getContentPane().add(taskStartLabel);

		taskStartField = new JTextField();
		taskStartField.setBounds(530, 232, 200, 30);
		getContentPane().add(taskStartField);

		taskEndLabel = new JLabel(" End Date: ");
		taskEndLabel.setBounds(764, 194, 100, 30);
		getContentPane().add(taskEndLabel);

		taskEndField = new JTextField();
		taskEndField.setBounds(764, 232, 200, 30);
		getContentPane().add(taskEndField);

		status = new JLabel(" Status: ");
		status.setBounds(537, 264, 100, 30);
		getContentPane().add(status);

		String statusList[] = { "Choose Status", "To-Do", "In Progress", "Finished" };
		statusDropdown = new JComboBox<Object>(statusList);
		statusDropdown.setBounds(537, 294, 180, 40);
		getContentPane().add(statusDropdown);

		priority = new JLabel(" Priority: ");
		priority.setBounds(764, 264, 100, 30);
		getContentPane().add(priority);

		String priorityList[] = { "Low", "Medium", "High" };
		priorityDropdown = new JComboBox<Object>(priorityList);
		priorityDropdown.setBounds(764, 294, 180, 40);
		getContentPane().add(priorityDropdown);

		taskDescLabel = new JLabel(" Description : ");
		taskDescLabel.setBounds(537, 351, 100, 30);
		getContentPane().add(taskDescLabel);

		taskDescField = new JTextArea();
		taskDescField.setBackground(new Color(255, 255, 255));
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		taskDescField
				.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		taskDescField.setBounds(537, 393, 400, 70);
		getContentPane().add(taskDescField);

		profileBtn = new JButton("Profile");
		profileBtn.setBackground(Color.BLUE);
		profileBtn.setBounds(850, 11, 124, 40);
		profileBtn.addActionListener(this);
		getContentPane().add(profileBtn);

		//
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setTitle("Job Scheduler");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//
		// Add ListSelectionListener to the table
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int selectedRow = table.getSelectedRow();

				if (selectedRow >= 0) {
					// Get data from the selected row
					String taskName = (String) tableModel.getValueAt(selectedRow, 1);
					String taskType = (String) tableModel.getValueAt(selectedRow, 2);
					String startDate = (String) tableModel.getValueAt(selectedRow, 5);
					String endDate = (String) tableModel.getValueAt(selectedRow, 6);
					String status = (String) tableModel.getValueAt(selectedRow, 4);
					String priority = (String) tableModel.getValueAt(selectedRow, 7);
					String description = (String) tableModel.getValueAt(selectedRow, 3);
					sel_task_id = Integer.parseInt((String) tableModel.getValueAt(selectedRow, 0));
					// Set values in your GUI components
					taskNameField.setText(taskName);
					taskTypeField.setText(taskType);
					taskStartField.setText(startDate);
					taskEndField.setText(endDate);
					statusDropdown.setSelectedItem(status);
					priorityDropdown.setSelectedItem(priority);
					taskDescField.setText(description);
				}
			}
		});

		scheduleDropdown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//
				refreshTable();
			}
		});
	}

	//
	public void refreshTable() {
		try {
			DataAccess data = new DataAccess();
			Vector<String> columns = new Vector<String>();
			columns.add("Task id");
			columns.add("Name");
			columns.add("Type");
			columns.add("Description");
			columns.add("Status");
			columns.add("Start Date");
			columns.add("End Date");
			columns.add("Priority");
			System.out.println("scheduleDropdown performed" + (String) scheduleDropdown.getSelectedItem());
			// Update the table model with the new data
			tableModel.setDataVector(
					data.scheduleTasks(data.getAllJobs(user_id), (String) scheduleDropdown.getSelectedItem()),
					columns);
			// Get the TableColumnModel
			TableColumnModel columnModel = table.getColumnModel();
			// Hide the "Task id" column
			TableColumn taskIDColumn = columnModel.getColumn(0);
			columnModel.removeColumn(taskIDColumn);
			// Notify the table that the data has changed
			tableModel.fireTableDataChanged();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//
	public void addJob() {
		String name = taskNameField.getText();
		String type = taskTypeField.getText();
		String startdate = taskStartField.getText();
		String enddate = taskEndField.getText();
		String status = (String) statusDropdown.getSelectedItem();
		String priority = (String) priorityDropdown.getSelectedItem();
		String description = taskDescField.getText();

		try {
			if(user_id.isEmpty()) {
				rsp = "please login to add data";
				return;
			}
			DataAccess api = new DataAccess();
			String insertQuery = "INSERT INTO tasks (name, type, startdate, enddate, status, priority, description, user_id) "
					+ "VALUES ('" + name + "', '" + type + "', '" + startdate + "', '" + enddate + "', '" + status
					+ "', '" + priority + "', '" + description + "','" + user_id + "')";

			boolean resp = api.queryUpdate(insertQuery);
			if (resp) {
				rsp = "Details are added Successfully";
				JOptionPane.showMessageDialog(null,rsp );
				refreshTable();
			} else {
				rsp = "Details are not added";
				JOptionPane.showMessageDialog(null, rsp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//
	public void updateJob() {
		String name = taskNameField.getText();
		String type = taskTypeField.getText();
		String startdate = taskStartField.getText();
		String enddate = taskEndField.getText();
		String status = (String) statusDropdown.getSelectedItem();
		String priority = (String) priorityDropdown.getSelectedItem();
		String description = taskDescField.getText();

		try {
			if (sel_task_id > 0) {
				DataAccess api = new DataAccess();
				String updateQuery = "UPDATE tasks SET " + "name='" + name + "', " + "type='" + type + "', "
						+ "startdate='" + startdate + "', " + "enddate='" + enddate + "', " + "status='" + status
						+ "', " + "priority='" + priority + "', " + "description='" + description + "' "
						+ "WHERE task_id=" + sel_task_id;
				boolean resp = api.queryUpdate(updateQuery);
				if (resp) {
					rsp = "Details are updated Successfully";
					JOptionPane.showMessageDialog(null,rsp );
					refreshTable();
				} else {
					rsp = "Details are not updated";
					JOptionPane.showMessageDialog(null, rsp);
				}
				
			} else {
				rsp = "Please select a task first to update";
				JOptionPane.showMessageDialog(null, rsp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//
	public void deleteJob() {
		// to delete a task
		if (sel_task_id > 0) {

			int confirmResult = JOptionPane.showConfirmDialog(null,
					"Are you sure you want to delete this selected Task ?", "Confirmation", JOptionPane.YES_NO_OPTION);
			if (confirmResult == JOptionPane.YES_OPTION) {
				DataAccess api = new DataAccess();
				String deleteQuery = "DELETE FROM tasks WHERE task_id = " + sel_task_id;

				boolean resp = api.queryUpdate(deleteQuery);
				if (resp) {
					rsp = "Task has deleted Successfully";
					JOptionPane.showMessageDialog(null,rsp );
					refreshTable();
				} else {
					rsp = "Task has not deleted.";
					JOptionPane.showMessageDialog(null,rsp );
				}
			}

		} else {
			rsp ="Please select a task first to delete";
			JOptionPane.showMessageDialog(null, rsp);
		}
	}

	//
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == addJob) {
			addJob();
		} else if (ae.getSource() == updateJob) {
			updateJob();
		} else if (ae.getSource() == deleteJob) {
			deleteJob();
		} else if (ae.getSource() == profileBtn) {
			userProfile = new UserProfile();
			userProfile.setVisible(true);
			Home.this.setVisible(false);

		} else {

		}
	}


}
