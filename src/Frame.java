import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setTitle("Patient Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon icon = new ImageIcon("src//Meals//medical-history.png");
		lblNewLabel.setBounds(260, 11, 200, 200);
		Image img = icon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(img));

		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				hide();
				new BreakFastforp();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);

		btnNewButton.setBounds(59, 241, 131, 142);
		 icon = new ImageIcon("src//Meals//english-breakfast.png");
		Image imgBreak = icon.getImage().getScaledInstance(btnNewButton.getWidth(), btnNewButton.getHeight(), Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(imgBreak));
		contentPane.add(btnNewButton);
		
		JButton button = new JButton();
		button.setBackground(Color.WHITE);
		button.setBorder(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				hide();
				new LUnch();
			}
		});
		button.setBounds(268, 241, 162, 142);
		icon = new ImageIcon("src//Meals//lunch-time.png");
		Image imgLunch = icon.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
		button.setIcon(new ImageIcon(imgLunch));

		contentPane.add(button);
		
		JButton button_1 = new JButton();
		button_1.setBackground(Color.WHITE);
		button_1.setBorder(null);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				hide();
				new Dinner();
			}
		});
		button_1.setBounds(476, 241, 162, 142);
		icon = new ImageIcon("src//Meals//meal.png");
		Image imgDinner = icon.getImage().getScaledInstance(button_1.getWidth(), button_1.getHeight(), Image.SCALE_SMOOTH);
		button_1.setIcon(new ImageIcon(imgDinner));


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
	}
}
