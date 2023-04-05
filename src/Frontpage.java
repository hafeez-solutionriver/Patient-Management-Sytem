import java.lang.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JDesktopPane;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Frontpage {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  EventQueue.invokeLater(new Runnable() { public void run() { try { Frontpage
		  window = new Frontpage(); window.frame.setVisible(true); } catch (Exception e) 
		  { e.printStackTrace(); }
		  }}
		  );
		 
	}

	/**
	 * Create the application.
	 */
	public Frontpage() {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setSize(936, 622);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 8));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(20, 11, 964, 163);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\newq.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Select your Role");
		lblNewLabel_1.setBounds(186, 185, 638, 128);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(100, 313, 249, 194);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Doctorprofile dp=new Doctorprofile();
				dp.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("G:\\Java Project\\src\\pictures\\iconfinder_doctor_63121.png"));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(717, 313, 234, 194);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setIcon(new ImageIcon("G:\\Java Project\\src\\pictures\\iconfinder_Patient_5958347.png"));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Disease d= new Disease();
				d.setVisible(true);
				
				
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Doctor\r\n");
		lblNewLabel_2.setBounds(130, 502, 192, 25);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("Patient");
		lblNewLabel_3.setBounds(761, 495, 143, 38);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		panel.setLayout(null);
		panel.add(lblNewLabel_1);
		panel.add(btnNewButton);
		panel.add(btnNewButton_1);
		panel.add(lblNewLabel_2);
		panel.add(lblNewLabel_3);
		panel.add(lblNewLabel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1000, 725);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}

