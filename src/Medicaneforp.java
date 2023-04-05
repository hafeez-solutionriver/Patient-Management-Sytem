import java.awt.BorderLayout;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Medicaneforp extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medicaneforp frame = new Medicaneforp();
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
	public Medicaneforp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 430);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medicane Menu\r\n");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 38, 387, 57);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(93, 129, 356, 197);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Display Medicine");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					String url="jdbc:mysql://localhost:3306/patientinfo?characterEncoding=latin1&useConfigs=maxPerformance";
                    Connection con=DriverManager.getConnection(url, "root", "admin");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("select * from medicine");
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
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton_1.setBounds(178, 95, 172, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose ();
				PatientmenuforP pm = new PatientmenuforP();
				pm.setVisible(true);
			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(443, 11, 89, 23);
		contentPane.add(btnNewButton);
	}
}
