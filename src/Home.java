import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

	JButton addJob, viewJob, updateJob, deleteJob, profileBtn;
	private JPanel panel;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel taskNameLabel, taskTypeLabel, taskDescLabel, taskStartLabel, taskEndLabel, status, priority;
	private JTextField taskNameField, taskTypeField, taskStartField, taskEndField;
	private JComboBox statusDropdown, priorityDropdown;
	private JTextArea taskDescField;
	private int sel_task_id;
	private String user_id;

	Home() {
		Utils utils = new Utils();
		String resp = utils.loadUserloggedInData();
		user_id = resp;
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

		viewJob = new JButton("View my Jobs");
		viewJob.setBounds(537, 617, 124, 40);
		viewJob.addActionListener(this);
		getContentPane().add(viewJob);

		updateJob = new JButton("Update Job");
		updateJob.setBounds(673, 538, 124, 40);
		updateJob.addActionListener(this);
		getContentPane().add(updateJob);

		deleteJob = new JButton("Delete Job");
		deleteJob.setBounds(809, 538, 124, 40);
		deleteJob.addActionListener(this);
		getContentPane().add(deleteJob);

		getContentPane().add(panel);

//		table = new JTable();
//		table.setBounds(16, 61, 1, 1);
//		table.setSize(getPreferredSize());
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
		DataAccess data = new DataAccess();
		tableModel = new DefaultTableModel(data.getAllTasks(user_id), columns);
		table = new JTable(tableModel) {
			public boolean isCellEditable(int row, int column) {
				if (column == 0)
					return true;
				else
					return false;
			}
//			@Override
//            public TableCellRenderer getCellRenderer(int row, int column) {
//                if (column == 0) {
//                    return new DefaultTableCellRenderer() {
//                        @Override
//                        public Component getTableCellRendererComponent(JTable table, Object value,
//                                                                       boolean isSelected, boolean hasFocus,
//                                                                       int row, int column) {
//                            return new JLabel(""); // Empty JLabel to hide the cell content
//                        }
//                    };
//                }
//                return super.getCellRenderer(row, column);
//            }
		};
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
		statusDropdown = new JComboBox(statusList);
		statusDropdown.setBounds(537, 294, 180, 40);
		getContentPane().add(statusDropdown);

		priority = new JLabel(" Priority: ");
		priority.setBounds(764, 264, 100, 30);
		getContentPane().add(priority);

		String priorityList[] = { "Choose Priority", "Low", "Medium", "High", "Critical" };
		priorityDropdown = new JComboBox(priorityList);
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
	}

	//
	private void refreshTable() {
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

			// Update the table model with the new data
			tableModel.setDataVector(data.getAllTasks(user_id), columns);
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
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == addJob) {

			String name = taskNameField.getText();
			String type = taskTypeField.getText();
			String startdate = taskStartField.getText();
			String enddate = taskEndField.getText();
			String status = (String) statusDropdown.getSelectedItem();
			String priority = (String) priorityDropdown.getSelectedItem();
			String description = taskDescField.getText();
//			String reminderChoice = "";
//			if (yesRadioButton.isSelected()) {
//				reminderChoice = "Yes";
//			} else if (noRadioButton.isSelected()) {
//				reminderChoice = "No";
//			}

			try {
				DataAccess db = new DataAccess();
				String insertQuery = "INSERT INTO tasks (name, type, startdate, enddate, status, priority, description) "
						+ "VALUES ('" + name + "', '" + type + "', '" + startdate + "', '" + enddate + "', '" + status
						+ "', '" + priority + "', '" + description + "')";

				int resp = db.executeQueryUpdate(insertQuery);
				if (resp > 0) {
					JOptionPane.showMessageDialog(null, "Details are added Successfully");
					refreshTable();
				} else {
					JOptionPane.showMessageDialog(null, "Details are not added");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (ae.getSource() == updateJob) {
			String name = taskNameField.getText();
			String type = taskTypeField.getText();
			String startdate = taskStartField.getText();
			String enddate = taskEndField.getText();
			String status = (String) statusDropdown.getSelectedItem();
			String priority = (String) priorityDropdown.getSelectedItem();
			String description = taskDescField.getText();
//			String reminderChoice = "";
//			if (yesRadioButton.isSelected()) {
//				reminderChoice = "Yes";
//			} else if (noRadioButton.isSelected()) {
//				reminderChoice = "No";
//			}

			try {
				if (sel_task_id > 0) {
					DataAccess db = new DataAccess();
					String updateQuery = "UPDATE tasks SET " + "name='" + name + "', " + "type='" + type + "', "
							+ "startdate='" + startdate + "', " + "enddate='" + enddate + "', " + "status='" + status
							+ "', " + "priority='" + priority + "', " + "description='" + description + "' "
							+ "WHERE task_id=" + sel_task_id;

					int resp = db.executeQueryUpdate(updateQuery);
					if (resp > 0) {
						JOptionPane.showMessageDialog(null, "Details are updated Successfully");
						refreshTable();
					} else {
						JOptionPane.showMessageDialog(null, "Details are not updated");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Please select a task first to update");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (ae.getSource() == deleteJob) {

			// to delete a task
			if (sel_task_id > 0) {

				int confirmResult = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to delete this selected Task ?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (confirmResult == JOptionPane.YES_OPTION) {
					DataAccess db = new DataAccess();
					String deleteQuery = "DELETE FROM tasks WHERE task_id = " + sel_task_id;

					int resp = db.executeQueryUpdate(deleteQuery);
					if (resp > 0) {
						JOptionPane.showMessageDialog(null, "Task has deleted Successfully");
						refreshTable();
					} else {
						JOptionPane.showMessageDialog(null, "Task has not deleted.");
					}
				}

			} else {
				JOptionPane.showMessageDialog(null, "Please select a task first to delete");
			}

		} else if (ae.getSource() == profileBtn) {
			

		} else {

		}
	}
}
