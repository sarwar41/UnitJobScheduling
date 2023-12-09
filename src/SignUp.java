

import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel labelUsername, labelPassword, labelimg;
	public JTextField textUsername;
	public JPasswordField textPassword;
	public JButton buttonSignup;
	public JButton buttonCancel;
	public JTextField profileNameTextField;
	public SignIn signIn;
	public String resp = null;

	public SignUp() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);

		labelUsername = new JLabel("Email");
		labelUsername.setBounds(257, 173, 47, 20);
		panel.add(labelUsername);

		textUsername = new JTextField();
		textUsername.setBounds(354, 173, 175, 20);
		panel.add(textUsername);

		labelPassword = new JLabel("Password");
		labelPassword.setBounds(257, 205, 65, 20);
		panel.add(labelPassword);

		textPassword = new JPasswordField();
		textPassword.setBounds(354, 205, 175, 20);
		panel.add(textPassword);

//		panel.add(buttonCancel);
//		panel.add(buttonSignup);
		

//		labelimg = new JLabel("");
//		Image img = new ImageIcon(getClass().getResource("/applogin.png")).getImage();
//		if (img != null) {
//		    labelimg.setIcon(new ImageIcon(img));
//		    labelimg.setBounds(60, 136, 150, 150);
//			panel.add(labelimg);
//		} else {
//		    System.err.println("Image not found!");
//		}
		
		// back to sign up button
		buttonCancel = new JButton("Already Have an account? SignIn");
		buttonCancel.setBounds(207, 322, 322, 30);
		panel.add(buttonCancel);
		buttonCancel.addActionListener(this);

		// sign in button
		buttonSignup = new JButton("Sign Up");
		buttonSignup.setBounds(384, 267, 120, 30);
		panel.add(buttonSignup);

		profileNameTextField = new JTextField();
		profileNameTextField.setBounds(354, 136, 175, 20);
		panel.add(profileNameTextField);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(257, 136, 85, 20);
		panel.add(lblUserName);
		buttonSignup.addActionListener(this);

		getContentPane().add(panel);
		
		setSize(700, 600);
		setLocationRelativeTo(null);
		setTitle("User Signup");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == buttonSignup) {

			String username = textUsername.getText();
			String password = String.valueOf(textPassword.getPassword());
			String profile_name = profileNameTextField.getText();
			//
			handleSignUpButton(username, password, profile_name);

		}
		if (ae.getSource() == buttonCancel) {

			signIn = new SignIn();
			signIn.setVisible(true);
			SignUp.this.setVisible(false);
		}

	}

	//
	public void handleSignUpButton(String username, String password, String profileName) {
		if (username.isEmpty()) {
			showMessage("Please enter your email address.");
			return ;
		} else if (password.isEmpty()) {
			showMessage("Please enter your password.");
			return ;
		} else {
			boolean emailVerified = Utils.isEmailValid(username);
			if (!emailVerified) {
				showMessage("Your provided email is not a valid email. Please provide a valid email.");
				return;
			}
			DataAccess api = new DataAccess();
			resp = api.signUp(username, password, profileName);
			showMessage(resp);
		}
	}
	//
	void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}