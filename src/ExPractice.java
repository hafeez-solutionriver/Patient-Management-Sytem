import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class ExPractice extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JTextField day;
	private JTextField time;
	int count=0;
	int[] exData=new int[7];
	
	 public static JComboBox comboBox = new JComboBox();
	    
	    public static JTextField foodField;

	    public static String[][] foodtype=new String[1][7];
	    public static int[][] duration=new int[1][7];
	    public static int times=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExPractice frame = new ExPractice();
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
	public ExPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 481);
		contentPane = new JPanel();
		setResizable(false);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.RED, 8));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.addMouseListener(this);
		
		JLabel e1 = new JLabel("");
		e1.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\1.gif"));
		e1.setForeground(SystemColor.windowBorder);
		e1.setBackground(SystemColor.menuText);
		e1.setBounds(10, 36, 128, 118);
		contentPane.add(e1);
		
		JLabel e2 = new JLabel("");
		e2.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\2.gif"));
		e2.setBounds(148, 43, 116, 104);
		contentPane.add(e2);
		
		JLabel e3 = new JLabel("");
		e3.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\3.gif"));
		e3.setBounds(478, 70, 94, 82);
		contentPane.add(e3);
		
		JLabel e4 = new JLabel("");
		e4.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\4.gif"));
		e4.setBounds(330, 65, 94, 104);
		contentPane.add(e4);
		
		JLabel e5 = new JLabel("");
		e5.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\5.gif"));
		e5.setBounds(26, 165, 128, 111);
		contentPane.add(e5);
		
		JLabel e6 = new JLabel("");
		e6.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\6.gif"));
		e6.setBounds(340, 153, 128, 111);
		contentPane.add(e6);
		
		JLabel e7 = new JLabel("");
		e7.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\7.gif"));
		e7.setBounds(160, 165, 107, 86);
		contentPane.add(e7);
		
		JLabel e8 = new JLabel("");
		e8.setIcon(new ImageIcon("E:\\GROUP G\\src\\Exercises\\8.gif"));
		e8.setBounds(478, 163, 128, 113);
		contentPane.add(e8);
		
		JLabel Day = new JLabel("Day:");
		Day.setForeground(new Color(0, 0, 0));
		Day.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Day.setHorizontalAlignment(SwingConstants.CENTER);
		Day.setBounds(73, 354, 81, 17);
		contentPane.add(Day);
		
		JLabel lblNewLabel_1 = new JLabel("Time (minutes)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(73, 382, 94, 22);
		contentPane.add(lblNewLabel_1);
		

		
		
	
		
		day=new JTextField("Enter correspondence  exercise number:");
		day.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		day.setBackground(SystemColor.controlHighlight);
		day.addMouseListener(this); 

		
		day.setBounds(196, 352, 247, 20);
		contentPane.add(day);
		day.setColumns(10);
		
		time = new JTextField("How many minutes patient do Exercise ?");
		time.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		time.setColumns(10);
		time.setBackground(SystemColor.controlHighlight);
		time.setBounds(196, 387, 247, 20);
		contentPane.add(time);
		
		JLabel n1 = new JLabel("1");
		n1.setBounds(54, 22, 12, 14);
		contentPane.add(n1);
		
		JLabel n2 = new JLabel("2");
		n2.setBounds(198, 18, 18, 14);
		contentPane.add(n2);
		
		JLabel n3 = new JLabel("3");
		n3.setBounds(355, 22, 12, 14);
		contentPane.add(n3);
		
		JLabel n4 = new JLabel("4");
		n4.setBounds(529, 22, 12, 14);
		contentPane.add(n4);
		
		JLabel n5 = new JLabel("5");
		n5.setBounds(54, 262, 12, 14);
		contentPane.add(n5);
		
		JLabel n6 = new JLabel("6");
		n6.setBounds(204, 262, 12, 14);
		contentPane.add(n6);
		
		JLabel n7 = new JLabel("7");
		n7.setBounds(355, 262, 12, 14);
		contentPane.add(n7);
		
		JLabel n8 = new JLabel("8");
		n8.setBounds(529, 262, 12, 14);
		contentPane.add(n8);
		
		/*
		 * 
		 *
		 */
		
		
		String[] days = {"TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY",""};
		JButton submit = new JButton("Add");
		submit.setBackground(Color.RED);
		submit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		submit.setForeground(Color.WHITE);
		
		int duration[]=new int[7];
		Day.setText("Monday");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean isThrown=false;
				try {
					exData[count]=Integer.parseInt(day.getText());
					
					Day.setText(days[count]);
					
					duration[count]=Integer.parseInt(time.getText());
					
					
					
					
				}
				catch(Exception e1)
				{
			
					System.out.println(e1);
					isThrown=true;
				}
				finally {
					
					if(isThrown)
					{
						day.setText("Enter a valid number!");
						
						
					}
					
					}
				if(!isThrown) {
				day.setText("Enter correspondence  exercise number:");
				time.setText("How many minutes patiend do ?");
				count++;
				
				
				if(count>6)
				{
					
					 try {
							PrintWriter pw=new PrintWriter(new FileOutputStream("E:\\GROUP G\\src\\Exercises\\ExerciseInfo.txt",true));
							
							
							String[] week= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
							
							for(int i=0;i<7;i++)
							{
								
									pw.write(week[i]+" "+":"+" "+"Exercise:"+" "+exData[i]+" "+" for ...."+" "+duration[i]+" "+"Minutes"+"\n");
								
							}
							
							
							pw.close();
							
							
							}
						
						catch(IOException i)
						{
							
							System.out.println(i);
							
						}
					
					dispose();
					
				}
				
			}
			}
		});
		submit.setBounds(500, 364, 86, 28);
		contentPane.add(submit);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Patientmenu pm = new Patientmenu();
				pm.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(26, 320, 116, 23);
		contentPane.add(btnNewButton);
	time.addMouseListener(this);
	
	
	

   
		
		//TextPrompt tpFortextField=new TextPrompt("Enter exercise correspondence number:",textField);
		
		
		
		
	
	
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		
		if((day.getText().equals("Enter correspondence  exercise number:") ||day.getText().equals("Enter a valid number!")  )&& e.getSource()==day )
		day.setText(null);
		
		if(time.getText().equals("How many minutes patiend do ?") && e.getSource()==time)
				time.setText(null);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
