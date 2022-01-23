package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CalculatorGui {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGui window = new CalculatorGui();
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
	public CalculatorGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 335, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 299, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("B");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if (textField.getText().length()>0)
				{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace=str.toString();
				textField.setText(backSpace);
				}
			}
		});
		btnNewButton.setBounds(10, 132, 67, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(10, 195, 67, 53);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(10, 258, 67, 53);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(10, 321, 67, 53);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setBounds(10, 384, 67, 53);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnB = new JButton("C");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(null);
			}
		});
		btnB.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnB.setBounds(90, 132, 67, 53);
		frame.getContentPane().add(btnB);
		
		JButton btnNewButton_1_1 = new JButton("8");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(90, 195, 67, 53);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_1.setBounds(90, 258, 67, 53);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("2");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_1.setBounds(90, 321, 67, 53);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton(".");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4_1.setBounds(90, 384, 67, 53);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_6 = new JButton("00");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6.setBounds(167, 132, 67, 53);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_1_2 = new JButton("9");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBounds(167, 195, 67, 53);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_2.setBounds(167, 258, 67, 53);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("3");
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_3_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_3_2.setBounds(167, 321, 67, 53);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("=");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
				result=first+second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}

				else if(operation=="-")
				{
				result=first-second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}

				else if(operation=="*")
				{
				result=first*second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}

				else if(operation=="/")
				{
				result=first/second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}

				else if(operation=="%")
				{
				result=first%second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}
			}
		});
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_2.setBounds(167, 384, 67, 53);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_7 = new JButton("+");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(242, 132, 67, 53);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_1_3 = new JButton("-");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_3.setBounds(242, 195, 67, 53);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_3 = new JButton("*");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
				}
		});
		btnNewButton_2_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_3.setBounds(242, 258, 67, 53);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_3_3 = new JButton("/");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3_3.setBounds(242, 321, 67, 53);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_4_3 = new JButton("%");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnNewButton_4_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4_3.setBounds(242, 384, 67, 53);
		frame.getContentPane().add(btnNewButton_4_3);
	}
}
