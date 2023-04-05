import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;



import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientmenuforP extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientmenuforP frame = new PatientmenuforP();
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
	public PatientmenuforP() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setResizable(false);
		setBounds(100, 100, 827, 547);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(108, 26, 597, 192);
		lblNewLabel.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\newq.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(30, 342, 147, 113);

		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				MealsmenuforPatient  Mp= new MealsmenuforPatient();
				
				Mp.setVisible(true);
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
				dispose();
				Exerciseforp ep = new Exerciseforp();
				ep.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(373, 331, 141, 124);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\Exercise3.png"));
		
		JLabel lblNewLabel_2 = new JLabel("Exercises");
		lblNewLabel_2.setBounds(338, 466, 176, 23);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Medicine");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(599, 459, 163, 23);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Medicaneforp mp=new Medicaneforp();
				mp.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(606, 324, 132, 131);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\pill4.png"));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
	}

//	private void Disease() {
//		Meal 
//		
	//}

}
