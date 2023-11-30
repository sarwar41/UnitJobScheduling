import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JFrame implements ActionListener {

	JButton addJob, viewJob, updateJob, deleteJob;

	private JPanel panel;

	Home() {

		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setBackground(Color.white);

		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JLabel heading = new JLabel("Jobs Scheduler");
		heading.setBounds(300, 20, 400, 40);
		heading.setFont(new Font("Candela", Font.BOLD, 25));
		add(heading);

		addJob = new JButton("Add New Job");
		addJob.setBounds(50, 80, 150, 40);
		addJob.addActionListener(this);
		add(addJob);

		viewJob = new JButton("View my Jobs");
		viewJob.setBounds(50, 140, 150, 40);
		viewJob.addActionListener(this);
		add(viewJob);

		updateJob = new JButton("Edit Jobs");
		updateJob.setBounds(50, 200, 150, 40);
		updateJob.addActionListener(this);
		add(updateJob);

		deleteJob = new JButton("Delete Jobs");
		deleteJob.setBounds(50, 260, 150, 40);
		deleteJob.addActionListener(this);
		add(deleteJob);

		this.add(this.panel);

		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setTitle("Job Scheduler");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == addJob) {
			System.out.println("addjobs pressed");
			NewJob nj = new NewJob();
			nj.setVisible(true);
			Home.this.setVisible(false);
		} else if (ae.getSource() == viewJob) {
			ViewJob vj = new ViewJob();
			vj.setVisible(true);
			Home.this.setVisible(false);
		} else if (ae.getSource() == updateJob) {

		} else if (ae.getSource() == deleteJob) {

		} else {

		}
	}
}