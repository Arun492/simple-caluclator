package caluclator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class CaluclatorClass extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtMxbxn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaluclatorClass frame = new CaluclatorClass();
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
	double num,ans;
	int caluclation,f;
	
	public void arithimatic_operation()
	{
		switch(caluclation)
		{
			case 1:
				if(ans!=Double.parseDouble(txtMxbxn.getText()))
					ans= num + Double.parseDouble(txtMxbxn.getText());
					txtMxbxn.setText(Double.toString(ans));
					break;
				
				
			case 2:
				if(ans!=Double.parseDouble(txtMxbxn.getText()))
					ans= num - Double.parseDouble(txtMxbxn.getText());
					txtMxbxn.setText(Double.toString(ans));
					break;
				
			case 3:
				if(ans!=Double.parseDouble(txtMxbxn.getText()))
					ans= num * Double.parseDouble(txtMxbxn.getText());
					txtMxbxn.setText(Double.toString(ans));
					break;
				
			case 4:
				if(ans!=Double.parseDouble(txtMxbxn.getText()))
					ans= num / Double.parseDouble(txtMxbxn.getText());
					txtMxbxn.setText(Double.toString(ans));
					break;
			case 5:
				txtMxbxn.setText(Double.toString(ans));
				break;
		}
	}
	
	public CaluclatorClass() {
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Arun's caluclator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 421);
		getContentPane().setLayout(null);
		
		txtMxbxn = new JTextField();
		txtMxbxn.setBackground(Color.WHITE);
		txtMxbxn.setEditable(false);
		txtMxbxn.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMxbxn.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtMxbxn.setBounds(23, 31, 322, 42);
		getContentPane().add(txtMxbxn);
		txtMxbxn.setColumns(10);
		
		JButton btnNewButton = new JButton("Del");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length;
				int number;
				length = txtMxbxn.getText().length();
				number = txtMxbxn.getText().length() - 1;
				String store;
				
				if(length > 0)
				{
					StringBuilder back= new StringBuilder(txtMxbxn.getText());
					back.deleteCharAt(number);
					store = back.toString();
					txtMxbxn.setText(store);
				}
				
			}
		});
		


		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBounds(169, 10, 176, 13);
		getContentPane().add(lblNewLabel);
		
		btnNewButton.setBounds(194, 96, 65, 33);
		getContentPane().add(btnNewButton);
		
		JButton btnC = new JButton("AC");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMxbxn.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(108, 94, 65, 33);
		getContentPane().add(btnC);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(txtMxbxn.getText());
				caluclation =1;
				txtMxbxn.setText("");
				lblNewLabel.setText(num + "+");
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBounds(280, 94, 65, 33);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("7");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"7");	
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(23, 153, 65, 33);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("8");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"8");	
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(108, 153, 65, 33);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("9");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"9");	
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(194, 153, 65, 33);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(txtMxbxn.getText());
				caluclation =2;
				txtMxbxn.setText("");
				lblNewLabel.setText(num + "-");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(280, 153, 65, 33);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("4");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"4");	
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(23, 212, 65, 33);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("5");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"5");	
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(108, 212, 65, 33);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("6");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"6");	
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(194, 212, 65, 33);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(txtMxbxn.getText());
				caluclation =3;
				txtMxbxn.setText("");
				lblNewLabel.setText(num + "*");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(280, 212, 65, 33);
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("1");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"1");		
				
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(23, 270, 65, 33);
		getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("2");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"2");	
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBounds(108, 270, 65, 33);
		getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("3");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"3");	
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(194, 270, 65, 33);
		getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(txtMxbxn.getText());
				caluclation =4;
				txtMxbxn.setText("");
				lblNewLabel.setText(num + "/");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(280, 270, 65, 33);
		getContentPane().add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText("0");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +"0");	
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(23, 330, 65, 33);
		getContentPane().add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
					txtMxbxn.setText(".");
					f=0;
				}
				else
					txtMxbxn.setText(txtMxbxn.getText() +".");	
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_14.setBounds(108, 330, 65, 33);
		getContentPane().add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithimatic_operation();
				lblNewLabel.setText("");
				num=0;
				f=1;
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_15.setBounds(280, 330, 65, 33);
		getContentPane().add(button_15);
		
		JButton btnAns = new JButton("Ans");
		btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMxbxn.setText("Ans");
				caluclation =5;
			}
		});
		btnAns.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAns.setBounds(194, 330, 65, 33);
		getContentPane().add(btnAns);
		
		JButton btnAc = new JButton("ON");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMxbxn.setText("");
				ans=0;
			}
		});
		btnAc.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAc.setBounds(23, 94, 65, 33);
		getContentPane().add(btnAc);
		
		
	}
}
