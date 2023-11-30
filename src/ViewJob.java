import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;
import net.proteanit.sql.DbUtils;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.sql.*;
import java.awt.event.*;

public class ViewJob extends JFrame implements ActionListener {

	JTable table;
	Choice jobName;
	JButton search1, update, back;

	private JPanel panel;

	ViewJob() {

		this.panel = new JPanel();
		this.panel.setLayout(null);
		this.panel.setBackground(Color.LIGHT_GRAY);

		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JLabel heading = new JLabel("Your Jobs");
		heading.setBounds(280, 5, 400, 40);
		heading.setFont(new Font("Candela", Font.BOLD, 18));
		add(heading);

		// table

		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JLabel search = new JLabel("Search by the Name:");
		search.setBounds(20, 60, 150, 20);
		add(search);

		jobName = new Choice();
		jobName.setBounds(160, 60, 150, 20);
		add(jobName);

		table = new JTable();

		try {
			Conn con = new Conn();
			ResultSet rs = con.stm.executeQuery("select * from tasks");
			while (rs.next()) {
				jobName.add(rs.getString("name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Conn con = new Conn();
			ResultSet rs = con.stm.executeQuery("select * from tasks");
			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (Exception e) {
			e.printStackTrace();
		}

		JScrollPane jsp = new JScrollPane(table);
		jsp.setBounds(0, 150, 900, 600);
		add(jsp);

		search1 = new JButton("Search");
		search1.setBounds(20, 100, 150, 20);
		search1.setSize(100, 35);
		search1.addActionListener(this);
		add(search1);

		update = new JButton("Update");
		update.setBounds(130, 100, 150, 20);
		update.setSize(100, 35);
		update.addActionListener(this);
		add(update);

		back = new JButton("Back");
		back.setBounds(240, 100, 150, 20);
		back.setSize(100, 35);
		back.addActionListener(this);
		add(back);

		this.add(this.panel);

		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Add New Job");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == search1) {

		} else if (ae.getSource() == update) {

		} else if (ae.getSource() == back) {
			System.out.println("addjobs pressed");
			Home hm = new Home();
			hm.setVisible(true);
			ViewJob.this.setVisible(false);
		} else {

		}

	}

}