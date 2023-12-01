import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class NewJob extends JFrame implements ActionListener {

	JButton newtaskButton, backButton;
	JLabel heading, task, tasktype, startDate, endDate, status, priority, reminder, description;
	JTextField fieldtask, fieldtype, fieldStartDate, endDateField;
	JComboBox statusDropdown, priorityDropdown;
	JRadioButton yesRadioButton, noRadioButton;

	private JPanel panel;
	private JTextArea descriptionField;

	NewJob() {

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);

		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		heading = new JLabel("Add New Job");
		heading.setBounds(270, 16, 173, 40);
		heading.setFont(new Font("Candela", Font.BOLD, 18));
		getContentPane().add(heading);

		// name
		task = new JLabel("Task Name: ");
		task.setBounds(90, 50, 100, 30);
		getContentPane().add(task);
		fieldtask = new JTextField();
		fieldtask.setBounds(90, 80, 100, 30);
		fieldtask.setSize(200, 20);
		fieldtask.setSize(200, 40);
		getContentPane().add(fieldtask);

		// type
		tasktype = new JLabel("Task Type");
		tasktype.setBounds(466, 50, 100, 30);
		getContentPane().add(tasktype);
		fieldtype = new JTextField();
		fieldtype.setBounds(466, 80, 100, 30);
		fieldtype.setSize(200, 40);
		getContentPane().add(fieldtype);

		// start date (calendar)
		startDate = new JLabel(" Start Date: ");
		startDate.setBounds(90, 132, 100, 30);
		getContentPane().add(startDate);

		fieldStartDate = new JTextField();
		fieldStartDate.setBounds(90, 170, 100, 30);
		fieldStartDate.setSize(200, 20);
		getContentPane().add(fieldStartDate);

		// due date (calendar)
		endDate = new JLabel(" End Date: ");
		endDate.setBounds(466, 132, 100, 30);
		getContentPane().add(endDate);

		endDateField = new JTextField();
		endDateField.setBounds(466, 170, 100, 30);
		endDateField.setSize(200, 20);
		getContentPane().add(endDateField);

		// status (drop down)
		status = new JLabel(" Status: ");
		status.setBounds(90, 220, 100, 30);
		getContentPane().add(status);

		String statusList[] = { "Choose Status", "To-Do", "In Progress", "Finished" };
		statusDropdown = new JComboBox(statusList);
		statusDropdown.setBounds(90, 250, 100, 30);
		statusDropdown.setSize(180, 40);
		getContentPane().add(statusDropdown);

		// priority (drop down)
		priority = new JLabel(" Priority: ");
		priority.setBounds(466, 220, 100, 30);
		getContentPane().add(priority);

		String priorityList[] = { "Choose Priority", "Low", "Medium", "High", "Critical" };
		priorityDropdown = new JComboBox(priorityList);
		priorityDropdown.setBounds(466, 250, 100, 30);
		priorityDropdown.setSize(180, 40);
		getContentPane().add(priorityDropdown);

		// reminder (radio box)
//		reminder = new JLabel(" Reminder ?: ");
//		reminder.setBounds(90, 302, 100, 30);
//		getContentPane().add(reminder);
//
//		yesRadioButton = new JRadioButton("Yes");
//		yesRadioButton.setBounds(179, 302, 60, 30);
//		getContentPane().add(yesRadioButton);
//
//		noRadioButton = new JRadioButton("No");
//		noRadioButton.setBounds(237, 302, 60, 30);
//		getContentPane().add(noRadioButton);

		ButtonGroup group = new ButtonGroup();
		group.add(yesRadioButton);
		group.add(noRadioButton);

		// description
		description = new JLabel(" Description : ");
		description.setBounds(90, 307, 100, 30);

		getContentPane().add(description);
		descriptionField = new JTextArea();
		descriptionField.setBounds(90, 349, 400, 59);
		descriptionField.setSize(400, 70);
		getContentPane().add(descriptionField);

		// add task button
		newtaskButton = new JButton("Add Job");
		newtaskButton.setBounds(431, 478, 150, 30);
		newtaskButton.addActionListener(this);
		newtaskButton.setSize(150, 50);
		newtaskButton.setBackground(Color.BLUE);

		getContentPane().add(newtaskButton);

		backButton = new JButton("Back");
		backButton.setBounds(127, 478, 150, 30);
		backButton.addActionListener(this);
		backButton.setSize(150, 50);
		backButton.setBackground(Color.BLUE);
		setVisible(true);
		getContentPane().add(backButton);

		getContentPane().add(panel);
		
		

		setSize(700, 600);
		setLocationRelativeTo(null);
		setTitle("Add New Job");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == newtaskButton) {

			String task_name = fieldtask.getText();
			String task_type = fieldtype.getText();
			String start_date = fieldStartDate.getText();
			String end_date = endDateField.getText();
			String status = (String) statusDropdown.getSelectedItem();
			String priority = (String) priorityDropdown.getSelectedItem();
			String description = descriptionField.getText();
//			String reminderChoice = "";
//			if (yesRadioButton.isSelected()) {
//				reminderChoice = "Yes";
//			} else if (noRadioButton.isSelected()) {
//				reminderChoice = "No";
//			}

			try {
				Conn conn = new Conn();
				String query = "insert into tasks values('" + task_name + "', '" + task_type + "', '" + start_date + "', '"
						+ end_date + "', '" + status + "', '" + priority + "', '" + description + "')";
				conn.stm.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Details are added Successfully");
				setVisible(false);
				new Home();

			} catch (Exception e) {
				e.printStackTrace();
			}

//			

		}
		if (ae.getSource() == backButton) {

			System.out.println("addjobs pressed");
			Home hm = new Home();
			hm.setVisible(true);
			NewJob.this.setVisible(false);

		}

	}
}
