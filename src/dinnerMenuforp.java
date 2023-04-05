import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class dinnerMenuforp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dinnerMenuforp frame = new dinnerMenuforp();
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
	public dinnerMenuforp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setResizable(false);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 163, 530, 114);
		contentPane.add(scrollPane);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		
		JButton btnNewButton = new JButton("Display Food");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					String url="jdbc:mysql://localhost:3306/patientinfo?characterEncoding=latin1&useConfigs=maxPerformance";
                    Connection con=DriverManager.getConnection(url, "root", "admin");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from lunch");
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
                    JTable table = new JTable(data,head);
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
		
		JLabel lblNewLabel = new JLabel("Dinner Menu");
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
