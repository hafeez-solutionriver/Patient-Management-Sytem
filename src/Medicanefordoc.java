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


public class Medicanefordoc extends JFrame{


    public static JComboBox comboBox = new JComboBox();
    private JPanel contentPane;
    public static JTextField foodField;

    public static String[][] foodtype=new String[1][7];
    public static int times=0;
    public static void main(String hafeez[])
    {

        Medicanefordoc obj=new Medicanefordoc();
        obj.setVisible(true);




    }
    Medicanefordoc()
    {
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

        JLabel lblNewLabel = new JLabel("Tab: Fludara");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(71, 138, 103, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblAraC = new JLabel("Ara C");
		lblAraC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAraC.setHorizontalAlignment(SwingConstants.CENTER);
		lblAraC.setBounds(71, 227, 77, 26);
		contentPane.add(lblAraC);
		
		JLabel lblTabArimidex = new JLabel("Tab: Arimidex");
		lblTabArimidex.setHorizontalAlignment(SwingConstants.CENTER);
		lblTabArimidex.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTabArimidex.setBounds(71, 312, 117, 26);
		contentPane.add(lblTabArimidex);
		
		JLabel lblCpsoramorph = new JLabel("Cps:Oramorph");
		lblCpsoramorph.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCpsoramorph.setBounds(271, 138, 117, 26);
		contentPane.add(lblCpsoramorph);
		
		JLabel lblCabparactomal = new JLabel("Cab :Paractomal");
		lblCabparactomal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCabparactomal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCabparactomal.setBounds(271, 227, 117, 26);
		contentPane.add(lblCabparactomal);
		
		JLabel lblTabpixantrone = new JLabel("Tab:Pixantrone");
		lblTabpixantrone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTabpixantrone.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTabpixantrone.setBounds(271, 312, 117, 26);
		contentPane.add(lblTabpixantrone);
		
		JLabel lblCaboncovin = new JLabel("Tab:Oncovin");
		lblCaboncovin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCaboncovin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaboncovin.setBounds(426, 138, 129, 26);
		contentPane.add(lblCaboncovin);
		
		JLabel lblCapsaromasin = new JLabel("Caps:Aromasin");
		lblCapsaromasin.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapsaromasin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCapsaromasin.setBounds(450, 228, 117, 25);
		contentPane.add(lblCapsaromasin);
		
		JLabel lblAzacitidine = new JLabel("Azacitidine\n");
		lblAzacitidine.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAzacitidine.setHorizontalAlignment(SwingConstants.CENTER);
		lblAzacitidine.setBounds(450, 313, 101, 25);
		contentPane.add(lblAzacitidine);
		
		JLabel lblGemzar = new JLabel("Gemzar");
		lblGemzar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGemzar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGemzar.setBounds(600, 138, 77, 26);
		contentPane.add(lblGemzar);
		
		JLabel lblGemzar_1 = new JLabel("Gemtaxol");
		lblGemzar_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGemzar_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGemzar_1.setBounds(600, 227, 77, 26);
		contentPane.add(lblGemzar_1);
		
		JLabel lblFlutamide = new JLabel("Flutamide");
		lblFlutamide.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlutamide.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFlutamide.setBounds(600, 313, 77, 26);
		contentPane.add(lblFlutamide);
		
		JLabel lblNewLabel_1 = new JLabel("Medicane Menu");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(82, 56, 560, 40);
		contentPane.add(lblNewLabel_1);

        comboBox.setBounds(71, 428, 144, 26);
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
        foodField.setBounds(294, 428, 153, 26);
        contentPane.add(foodField);
        foodField.setColumns(10);

        JButton Submit = new JButton("Add Food");
        Submit.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Submit.setForeground(Color.WHITE);
        Submit.setBackground(Color.RED);
        Submit.setBounds(500, 427, 123, 23);
        contentPane.add(Submit);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Patientmenu p = new Patientmenu();
        		p.setVisible(true);
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.RED);
        btnNewButton.setBounds(664, 56, 89, 23);
        contentPane.add(btnNewButton);
        Submit.addActionListener(new ComboBoxHandler());


    }


}
