
import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import java.io.IOException;

public class SignIn extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel labelUsername, labelPassword, labelimg;
	public JTextField textUsername;
	public JPasswordField textPassword;
	public JButton buttonLogin;
	public JButton buttonSignup;
	public DataAccess api;
	public SignUp signup;
	public Home home;
	public String resp = null;

	public SignIn() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);

		labelUsername = new JLabel("Email");
		labelUsername.setBounds(295, 173, 47, 20);
		panel.add(labelUsername);

		textUsername = new JTextField();
		textUsername.setBounds(354, 173, 150, 20);
		panel.add(textUsername);

		labelPassword = new JLabel("Password");
		labelPassword.setBounds(277, 225, 65, 20);
		panel.add(labelPassword);

		textPassword = new JPasswordField();
		textPassword.setBounds(354, 225, 150, 20);
		panel.add(textPassword);

//		panel.add(buttonSignup);
//		panel.add(buttonLogin);

//		labelimg = new JLabel("");
//		Image img = new ImageIcon(getClass().getResource("/applogin.png")).getImage();
//		labelimg.setIcon(new ImageIcon(img));
//		labelimg.setBounds(60, 136, 150, 150);
//		panel.add(labelimg);

		// back to sign up button
		buttonSignup = new JButton("Don't have an account? Create a New Account.");
		buttonSignup.setBounds(207, 322, 322, 30);
		panel.add(buttonSignup);
		buttonSignup.addActionListener(this);

		// sign in button
		buttonLogin = new JButton("Sign In");
		buttonLogin.setBounds(384, 267, 120, 30);
		panel.add(buttonLogin);
		buttonLogin.addActionListener(this);

		getContentPane().add(panel);
		setSize(700, 600);
		setLocationRelativeTo(null);
		setTitle("User Signup");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == buttonLogin) {

			String username = textUsername.getText();
			@SuppressWarnings("deprecation")
			String password = textPassword.getText();
			System.out.println("username" + username + password);

			if (username.isEmpty() || password.isEmpty()) {
				showMessage("Please fill in all fields.");
				return;
			}
			boolean email_verified = Utils.isEmailValid(username);
			if (!email_verified) {

				showMessage("Your provided email is not a valid email, Please Provide a valid email.");
				return;
			}
			try {
				api = new DataAccess();
				String resp = api.isUserValid(username, password);
				if (!resp.isEmpty()) {
					Utils.saveUserloggedInData(resp);
					home = new Home();
					home.setVisible(true);
					SignIn.this.setVisible(false);
				} else {
					showMessage("You've provided wrong email and password");

				}
			} catch (Exception ex) {
			}

		}
		if (ae.getSource() == buttonSignup) {

			signup = new SignUp();
			signup.setVisible(true);
			SignIn.this.setVisible(false);
		}

	}

	//
	void showMessage(String message) {
		resp = message;
		JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
}