import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MealMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MealMenu frame = new MealMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public MealMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 520);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\newq.png"));
		lblNewLabel.setBounds(10, 11, 543, 142);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				BreakfastMenu dm = null;
				dm = new BreakfastMenu();
				dm.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\cup.png"));
		btnNewButton.setBounds(59, 241, 131, 142);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			LUnch l  = new LUnch();
			l.setVisible(true);

				
			}
		});
		button.setBackground(Color.WHITE);
		button.setBorder(null);
		button.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\lunch.png"));
		button.setBounds(268, 241, 162, 142);
		contentPane.add(button);
		
		JButton button_1 = new JButton();
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Dinner d = new Dinner();
				d.setVisible(true);

			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBorder(null);
		button_1.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\Dinner.png"));
		button_1.setBounds(476, 241, 162, 142);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("Breakfast");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(89, 394, 88, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLunch = new JLabel("Lunch");
		lblLunch.setHorizontalAlignment(SwingConstants.CENTER);
		lblLunch.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLunch.setBounds(309, 394, 88, 23);
		contentPane.add(lblLunch);
		
		JLabel lblDinner = new JLabel("Dinner");
		lblDinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblDinner.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDinner.setBounds(511, 394, 88, 23);
		contentPane.add(lblDinner);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Patientmenu dm = new Patientmenu();
				dm.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(563, 32, 89, 31);
		contentPane.add(btnNewButton_1);
	}
}
