import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patientmenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patientmenu frame = new Patientmenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Patientmenu() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 827, 547);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(90, 37, 597, 192);
		lblNewLabel.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\newq.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(30, 342, 132, 113);

		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				MealMenu MM= new MealMenu();
				MM.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\meals3.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Meals");
		lblNewLabel_1.setBounds(30, 459, 147, 30);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_1 = new JButton("\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose ();
				ExPractice p=new ExPractice();
				p.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(222, 331, 141, 124);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\Exercise3.png"));
		
		JLabel lblNewLabel_2 = new JLabel("Exercises");
		lblNewLabel_2.setBounds(187, 466, 176, 23);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Medicine");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(384, 463, 163, 23);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Medicanefordoc  Md= new Medicanefordoc();
				Md.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(405, 331, 132, 131);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\pill4.png"));
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.setBounds(585, 24, 215, 36);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Doctorprofile dp=new Doctorprofile();
				dp.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_4.setBackground(Color.RED);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton_4);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Send Report to Patient Family");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_4.setBounds(585, 459, 215, 30);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Rizwan Ali\\Downloads\\1220340-256.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EmailSendingMenu m= new EmailSendingMenu();
				m.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(619, 342, 163, 113);
		btnNewButton_3.setBorder(null);
		contentPane.add(btnNewButton_3);
	}



}
