
import javax.swing.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;

class SignIn extends JFrame implements ActionListener {

	private JPanel panel;
	private JLabel labelUsername, labelPassword, labelimg;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JButton buttonLogin, buttonSignup;

	public SignIn() {
		this.InitializeComponents();
	}

	private void InitializeComponents() {
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

		labelimg = new JLabel("");
		Image img = new ImageIcon(getClass().getResource("/applogin.png")).getImage();
		labelimg.setIcon(new ImageIcon(img));
		labelimg.setBounds(60, 136, 150, 150);
		panel.add(labelimg);
		
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
			String password = textPassword.getText();

			Utils utils = new Utils();
			boolean email_verified = utils.isEmailValid(username);
			if (!email_verified) {
				JOptionPane.showMessageDialog(null,
						"Your provided email is not a valid email, Please Provide a valid email.", "Message",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			DataAccess api = new DataAccess();
			boolean resp = api.isUserValid(username, password);
			if (resp) {
				utils.saveUserloggedInData("yes");
				Home hm = new Home();
				hm.setVisible(true);
				SignIn.this.setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null, "You've entered wrong email and password", "Message",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}
		if (ae.getSource() == buttonSignup) {

			SignUp su = new SignUp();
			su.setVisible(true);
			SignIn.this.setVisible(false);
		}

	}
}