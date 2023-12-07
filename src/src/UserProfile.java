package src;
import java.awt.Color;
//import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.ResultSet;
//import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import javax.swing.table.TableColumn;
//import javax.swing.table.TableColumnModel;

public class UserProfile extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel nameLabel, emailLabel;
	public JTextField nameTextField;
	public JTextField emailTextField;
	public JButton updateButton;
	public JButton backButton;
	public JButton btnUpdatePassword;
	public JPasswordField oldPasstextField, newPasstextField;
	public String user_id;
	public String user_pass;
	public DataAccess api;
	public Home home;
	public String rsp = null;
	public UserProfile() {
		
		Utils utils = new Utils();
		try {
			String resp = utils.loadUserloggedInData();
			user_id = resp;
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as needed
        }

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);

		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		nameLabel = new JLabel("Name:");
		nameLabel.setBounds(138, 227, 100, 30);
		getContentPane().add(nameLabel);

		nameTextField = new JTextField();
		nameTextField.setBounds(250, 232, 200, 20);
		getContentPane().add(nameTextField);

		emailLabel = new JLabel("Email:");
		emailLabel.setBounds(138, 184, 100, 30);
		getContentPane().add(emailLabel);

		emailTextField = new JTextField();
		emailTextField.setBounds(250, 189, 200, 20);
		getContentPane().add(emailTextField);

		backButton = new JButton("Back");
		backButton.setBackground(Color.BLUE);
		backButton.setBounds(842, 19, 124, 40);
		backButton.addActionListener(this);
		getContentPane().add(backButton);

		updateButton = new JButton("Update");
		updateButton.setBackground(Color.BLUE);
		updateButton.setBounds(250, 307, 124, 40);
		updateButton.addActionListener(this);
		getContentPane().add(updateButton);

		JLabel profileHeaderLabel = new JLabel("Profile Information");
		profileHeaderLabel.setBounds(138, 119, 131, 30);
		getContentPane().add(profileHeaderLabel);

		JLabel lblOldPassword = new JLabel("Old Password:");
		lblOldPassword.setBounds(621, 184, 100, 30);
		getContentPane().add(lblOldPassword);

		oldPasstextField = new JPasswordField();
		oldPasstextField.setBounds(733, 189, 200, 20);
		getContentPane().add(oldPasstextField);

		newPasstextField = new JPasswordField();
		newPasstextField.setBounds(733, 232, 200, 20);
		getContentPane().add(newPasstextField);

		JLabel lblNewPassword = new JLabel("New Password:");
		lblNewPassword.setBounds(621, 227, 100, 30);
		getContentPane().add(lblNewPassword);

		btnUpdatePassword = new JButton("Update Password");
		btnUpdatePassword.setBackground(Color.BLUE);
		btnUpdatePassword.setBounds(733, 307, 124, 40);
		btnUpdatePassword.addActionListener(this);
		getContentPane().add(btnUpdatePassword);

		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setBounds(621, 119, 131, 30);
		getContentPane().add(lblChangePassword);
		//
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setTitle("User Profile");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		loadProfile();

	}

	//
	void loadProfile() {
		try {
			api = new DataAccess();
	        String query = "select user_name, profile_name, user_password from users WHERE user_id = '" + user_id + "' ";
	        ResultSet rs = api.executeQuery(query);
	        if (rs != null) {
	            while (rs.next()) {
	                user_pass = rs.getString("user_password");
	                nameTextField.setText(rs.getString("profile_name"));
	                emailTextField.setText(rs.getString("user_name"));
	                rsp = "Load Complete";
	            }
	        } else {
	            // Handle the case where the ResultSet is null (or empty) appropriately
	            rsp = "No user found";
	        }
	    } catch (Exception e) {
	        e.printStackTrace();  // Consider logging the exception instead of just printing the stack trace
	        rsp = "Error loading profile";  // Set an appropriate error message
	    }
	}
	//
	void updateProfileInfo() {
		api = new DataAccess();
		String email = emailTextField.getText();
		String name = nameTextField.getText();

//		DataAccess db = new DataAccess();
		String updateQuery = "update users set profile_name='" + name + "', user_name='" + email
				+ "' where user_id=" + user_id;

		int resp = api.executeQueryUpdate(updateQuery);
		if (resp > 0) {
			JOptionPane.showMessageDialog(null, "Details are updated Successfully");
			loadProfile();
			rsp =  "Details are updated Successfully";
		} else {
			JOptionPane.showMessageDialog(null, "Details are not updated");
			rsp =  "Details are not updated";
		}
	}
	//
	void updateProfilePassword() {
		api = new DataAccess();
		String old_pass = String.valueOf(oldPasstextField.getPassword());
		String new_pass = String.valueOf(newPasstextField.getPassword());

//		DataAccess db = new DataAccess();
		if (!new_pass.isEmpty() && !old_pass.isEmpty()) {
			if (api.passwordHashing(old_pass).equals(user_pass)) {

				String updateQuery = "UPDATE users SET " + "user_password='" + api.passwordHashing(new_pass) + "' "
						+ "WHERE user_id=" + user_id;

				int resp = api.executeQueryUpdate(updateQuery);
				if (resp > 0) {
					JOptionPane.showMessageDialog(null, "New Password has updated succesfully.");
					rsp =  "New Password has updated succesfully.";
					loadProfile();
				} else {
					JOptionPane.showMessageDialog(null, "Password has not updated successfully");

				}
			} else {
				JOptionPane.showMessageDialog(null, "Old password doesn't match");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Please enter your old and new password");
		}
	}

	//
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == updateButton) {
			updateProfileInfo();
		} else if (ae.getSource() == btnUpdatePassword) {
			updateProfilePassword();
			
		} else if (ae.getSource() == backButton) {
			home = new Home();
			home.setVisible(true);
			UserProfile.this.setVisible(false);
		} else {

		}
	}
}
