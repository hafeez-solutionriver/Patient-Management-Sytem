import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class BreakFastforp extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakFastforp frame = new BreakFastforp();
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
	public BreakFastforp() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 437);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 206, 528, 90);
		contentPane.add(scrollPane);
		 
		
		
		JButton btnNewButton = new JButton("Display Food");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					String url="jdbc:mysql://localhost:3306/patientinfo?characterEncoding=latin1&useConfigs=maxPerformance";
                    Connection con=DriverManager.getConnection(url, "root", "admin");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from breakfast");
                    Object data[][]=new Object[1][7];
            		
            		
                    
                    while(rs.next()) {
                    			
                    	data[0][0]=rs.getString(1);
                    	data[0][1]=rs.getString(2);
                    	data[0][2]=rs.getString(3);
                    	data[0][3]=rs.getString(4);
                    	data[0][4]=rs.getString(5);
                    	data[0][5]=rs.getString(6);
                    	data[0][6]=rs.getString(7);
        
                    	
                    }
                    
                    String head[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
                    table = new JTable(data,head);
            		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            		table.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
            		scrollPane.setViewportView(table);
            		con.close();
            		
				}
				
				catch (Exception e1) {
					System.out.print(e1);
				}
				
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(203, 97, 181, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Breakfast Menu");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 35, 452, 50);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			
				MealsmenuforPatient p = new MealsmenuforPatient();
				
				p.setVisible(true);
				
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(459, 35, 99, 30);
		contentPane.add(btnNewButton_1);
	}
}
