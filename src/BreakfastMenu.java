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
import javax.swing.JOptionPane;
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


public class BreakfastMenu extends JFrame{


    public static JComboBox comboBox = new JComboBox();
    private JPanel contentPane;
    public static JTextField foodField;

    public static String[][] foodtype=new String[1][7];
    public static int times=0;
    public static void main(String hafeez[])
    {

        BreakfastMenu obj=new BreakfastMenu();
        obj.setVisible(true);




    }
    BreakfastMenu()
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

//        JPanel panel = new JPanel();
//        panel.setBounds(0, 0, 0, 0);
//        panel.setBackground(Color.LIGHT_GRAY);
//        contentPane.add(panel);
//        panel.setLayout(null);


        comboBox.setBounds(369, 213, 133, 22);
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
        foodField.setBounds(369, 278, 133, 20);
        contentPane.add(foodField);
        foodField.setColumns(10);

        JButton Submit = new JButton("Add Food");
        Submit.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Submit.setForeground(Color.WHITE);
        Submit.setBackground(Color.RED);
        Submit.setBounds(388, 365, 114, 23);
        contentPane.add(Submit);
        Submit.addActionListener(new ComboBoxHandler());
        
        JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setEnabled(true);
		lblNewLabel.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\newq.png"));
		lblNewLabel.setBounds(10, 11, 667, 135);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MealMenu mm=new MealMenu();
				mm.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(691, 29, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\CHOCOLATE SPREAD.jpg"));
		btnNewButton_1.setBounds(88, 164, 143, 107);
		contentPane.add(btnNewButton_1);
		
		JButton button_2 = new JButton("");
		button_2.setBorder(null);
		button_2.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\CEREAL.jpg"));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(88, 307, 160, 128);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBorder(null);
		button_3.setBackground(Color.WHITE);
		button_3.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\OMELETTE.png"));
		button_3.setBounds(579, 154, 167, 117);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBorder(null);
		button_4.setBackground(Color.WHITE);
		button_4.setIcon(new ImageIcon("G:\\Java Project\\src\\Pictures\\TEA BISCUIT-1.jpg"));
		button_4.setBounds(579, 318, 167, 128);
		contentPane.add(button_4);
		
		JLabel lblNewLabel_1 = new JLabel("1.Chocolate Spread");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(98, 285, 144, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblOmelette = new JLabel("2.Omelette");
		lblOmelette.setHorizontalAlignment(SwingConstants.CENTER);
		lblOmelette.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOmelette.setBounds(602, 276, 144, 23);
		contentPane.add(lblOmelette);
		
		JLabel lblCereal = new JLabel("3.Cereal ");
		lblCereal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCereal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCereal.setBounds(87, 446, 144, 23);
		contentPane.add(lblCereal);
		
		JLabel lblTeaBiscuits = new JLabel("4.Tea & Biscuits");
		lblTeaBiscuits.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeaBiscuits.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTeaBiscuits.setBounds(616, 457, 144, 23);
		contentPane.add(lblTeaBiscuits);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Food Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(352, 319, 180, 35);
		contentPane.add(lblNewLabel_2);


    }


}

class ComboBoxHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub



        if(BreakfastMenu.times<7) {




            String item=(String)BreakfastMenu.comboBox.getSelectedItem();

            if(item.equals("Monday"))
            {
                if(BreakfastMenu.foodtype[0][0]==null)
                {
                    BreakfastMenu.foodtype[0][0]=BreakfastMenu.foodField.getText();

                    BreakfastMenu.times++;
                    BreakfastMenu.foodField.setText(null);
                }
                else {
                    BreakfastMenu.foodtype[0][0]=BreakfastMenu.foodField.getText();
                    BreakfastMenu.foodField.setText(null);
                }

            }

            else if(item.equals("Tuesday"))
            {
                if(BreakfastMenu.foodtype[0][1]==null)
                {
                    BreakfastMenu.foodtype[0][1]=BreakfastMenu.foodField.getText();

                    BreakfastMenu.times++;
                    BreakfastMenu.foodField.setText(null);
                }
                else {
                    BreakfastMenu.foodtype[0][1]=BreakfastMenu.foodField.getText();
                    BreakfastMenu.foodField.setText(null);
                }


            }

            else if(item.equals("Wednesday"))
            {
                if(BreakfastMenu.foodtype[0][2]==null)
                {
                    BreakfastMenu.foodtype[0][2]=BreakfastMenu.foodField.getText();

                    BreakfastMenu.times++;
                    BreakfastMenu.foodField.setText(null);
                }
                else {
                    BreakfastMenu.foodtype[0][2]=BreakfastMenu.foodField.getText();
                    BreakfastMenu.foodField.setText(null);
                }

            }


            else if(item.equals("Thursday"))
            {
                if(BreakfastMenu.foodtype[0][3]==null)
                {
                    BreakfastMenu.foodtype[0][3]=BreakfastMenu.foodField.getText();

                    BreakfastMenu.times++;
                    BreakfastMenu.foodField.setText(null);
                }
                else {
                    BreakfastMenu.foodtype[0][3]=BreakfastMenu.foodField.getText();
                    BreakfastMenu.foodField.setText(null);
                }

            }


            else if(item.equals("Friday"))
            {
                if(BreakfastMenu.foodtype[0][4]==null)
                {
                    BreakfastMenu.foodtype[0][4]=BreakfastMenu.foodField.getText();

                    BreakfastMenu.times++;
                    BreakfastMenu.foodField.setText(null);
                }
                else {
                    BreakfastMenu.foodtype[0][4]=BreakfastMenu.foodField.getText();
                    BreakfastMenu.foodField.setText(null);
                }


            }


            else if(item.equals("Saturday"))
            {
                if(BreakfastMenu.foodtype[0][5]==null)
                {
                    BreakfastMenu.foodtype[0][5]=BreakfastMenu.foodField.getText();

                    BreakfastMenu.times++;
                    BreakfastMenu.foodField.setText(null);
                }
                else {
                    BreakfastMenu.foodtype[0][5]=BreakfastMenu.foodField.getText();
                    BreakfastMenu.foodField.setText(null);
                }

            }


            else if(item.equals("Sunday"))
            {
                if(BreakfastMenu.foodtype[0][6]==null)
                {
                    BreakfastMenu.foodtype[0][6]=BreakfastMenu.foodField.getText();

                    BreakfastMenu.times++;
                    BreakfastMenu.foodField.setText(null);
                }
                else {
                    BreakfastMenu.foodtype[0][6]=BreakfastMenu.foodField.getText();
                    BreakfastMenu.foodField.setText(null);
                }


            }



            if(BreakfastMenu.times==7)
            {
                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    String url="jdbc:mysql://localhost:3306/patientinfo?characterEncoding=latin1&useConfigs=maxPerformance";
                    Connection con=DriverManager.getConnection(url, "root", "admin");


                    String query="insert into breakfast values(?,?,?,?,?,?,?)";

                    PreparedStatement ps=con.prepareStatement(query);

                    ps.setString(1, BreakfastMenu.foodtype[0][0]);

                    ps.setString(2, BreakfastMenu.foodtype[0][1]);
                    ps.setString(3, BreakfastMenu.foodtype[0][2]);
                    ps.setString(4, BreakfastMenu.foodtype[0][3]);
                    ps.setString(5, BreakfastMenu.foodtype[0][4]);
                    ps.setString(6, BreakfastMenu.foodtype[0][5]);
                    ps.setString(7, BreakfastMenu.foodtype[0][6]);

                    if(ps.executeUpdate()>0)
                    {	
                    	JOptionPane option=new JOptionPane();
                    	JOptionPane.showMessageDialog(option, "Your Report has been send");
                        //System.out.println("Successfully added records....");

                        System.exit(0);
                    }
                }


                catch(Exception es)
                {
                    System.out.println(es);
                }
            }




        }

    }



}