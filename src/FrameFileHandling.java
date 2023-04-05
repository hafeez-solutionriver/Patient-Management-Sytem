import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameFileHandling {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameFileHandling window = new FrameFileHandling();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameFileHandling () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	 PrintWriter out=null;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JTextPane textPane = new JTextPane();
		textPane.setBounds(194, 82, 154, 20);
		frame.getContentPane().add(textPane);
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(44, 82, 111, 20);
		frame.getContentPane().add(lblNewLabel);
		
		final JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(194, 113, 154, 20);
		frame.getContentPane().add(textPane_1);
		
		
		
		JLabel lblCcaste = new JLabel("Caste");
		lblCcaste.setBackground(Color.LIGHT_GRAY);
		lblCcaste.setBounds(44, 113, 111, 20);
		frame.getContentPane().add(lblCcaste);
		
		JButton btnNewButton = new JButton("Enter");
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					 out=new PrintWriter("G:\\Java Project\\src\\hafeez.txt");
					textPane.write(out);
						
						
					
					}
					catch(IOException e1) {
						System.out.println(e1);
					}
				
				
				
				
				try {
					
					//PrintWriter out=new PrintWriter("D:\\hafeez.txt");
					textPane_1.write(out);
						
						
					out.close();
					System.exit(0);
					System.out.println(System.currentTimeMillis());
					}
					catch(IOException e2) {
						System.out.println(e2);
					}
				
			}
		});
		btnNewButton.setBounds(277, 180, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
