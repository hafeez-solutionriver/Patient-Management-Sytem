import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class LUnch extends JFrame{


    public static JComboBox comboBox = new JComboBox();
    private JPanel contentPane;
    public static JTextField foodField;

    public static String[][] foodtype=new String[1][7];
    public static int times=0;
    public static void main(String hafeez[])
    {

        LUnch obj=new LUnch();
        obj.setVisible(true);




    }
    LUnch()
    {
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 819, 549);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new LineBorder(Color.RED, 8));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        comboBox.setBackground(Color.WHITE);
        comboBox.setForeground(Color.RED);
        comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));

//        JPanel panel = new JPanel();
//        panel.setBounds(0, 0, 0, 0);
//        panel.setBackground(Color.LIGHT_GRAY);
//        contentPane.add(panel);
//        panel.setLayout(null);
        
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\newq.png"));
		lblNewLabel.setBounds(10, 11, 574, 135);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\turkey Bolognese With Tricolor Salad.jpg"));
		lblNewLabel_1.setBounds(56, 157, 121, 101);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\Chicken Tacos With Mango & Jicama.jpg"));
		label.setBounds(568, 157, 121, 101);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\Minestrone With Squash, Beans & Kale.jpg"));
		label_1.setBounds(43, 310, 112, 101);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\Waldorf Chicken Salad.jpg"));
		label_2.setBounds(568, 301, 121, 101);
		contentPane.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("Turkey Bolognese ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(44, 269, 121, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblChickenTacos = new JLabel("Chicken Tacos ");
		lblChickenTacos.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblChickenTacos.setHorizontalAlignment(SwingConstants.CENTER);
		lblChickenTacos.setBounds(578, 269, 121, 21);
		contentPane.add(lblChickenTacos);
		
		JLabel lblMinestrone = new JLabel("Minestrone");
		lblMinestrone.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinestrone.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblMinestrone.setBounds(34, 422, 121, 21);
		contentPane.add(lblMinestrone);
		
		JLabel lblWaldorfChickenSalad = new JLabel("Waldorf Chicken Salad.");
		lblWaldorfChickenSalad.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblWaldorfChickenSalad.setHorizontalAlignment(SwingConstants.CENTER);
		lblWaldorfChickenSalad.setBounds(556, 422, 147, 21);
		contentPane.add(lblWaldorfChickenSalad);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				MealMenu mm=new MealMenu();
				mm.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(568, 22, 89, 23);
		contentPane.add(btnNewButton);


        comboBox.setBounds(299, 212, 133, 22);
        contentPane.add(comboBox);


        comboBox.addItem("Monday");
        comboBox.addItem("Tuesday");
        comboBox.addItem("Wednesday");
        comboBox.addItem("Thursday");
        comboBox.addItem("Friday");
        comboBox.addItem("Saturday");
        comboBox.addItem("Sunday");

        foodField = new JTextField();
        foodField.setFont(new Font("Tahoma", Font.PLAIN, 11));
        foodField.setBounds(299, 279, 133, 20);
        contentPane.add(foodField);
        foodField.setColumns(10);

        JButton Submit = new JButton("Add Food");
        Submit.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Submit.setForeground(Color.WHITE);
        Submit.setBackground(Color.RED);
        Submit.setBounds(299, 365, 114, 23);
        contentPane.add(Submit);
        Submit.addActionListener(new ComboBoxHandler());


    }



}