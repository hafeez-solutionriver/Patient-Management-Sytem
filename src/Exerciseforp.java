import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;



import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Exerciseforp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exerciseforp frame = new Exerciseforp();
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
	public Exerciseforp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setResizable(false);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Exercise Menu\r\n");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(90, 21, 387, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose ();
				PatientmenuforP pm = new PatientmenuforP();
				pm.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(446, 21, 89, 23);
		contentPane.add(btnNewButton);
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(137, 153, 328, 201);
		contentPane.add(textArea);
		JButton btnNewButton_1 = new JButton("Display");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Scanner read=new Scanner(new FileInputStream("E:\\GROUP G\\src\\Exercises\\ExerciseInfo.txt"));
					
					while(read.hasNextLine()) {
						
						textArea.append(read.nextLine()+"\n");
					}
					read.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
				
			}
		});
		btnNewButton_1.setBounds(222, 89, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
