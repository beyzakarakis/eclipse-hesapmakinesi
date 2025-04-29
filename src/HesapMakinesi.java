import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class HesapMakinesi extends JFrame {

	private JPanel contentPane;
	private JButton btn9;
	private JTextField ekran;
	
	String operator;
	double num1, num2, result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
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
	public HesapMakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBounds(42, 453, 189, 72);
		contentPane.add(btn0);
		
		JButton btnpound = new JButton(".");
		btnpound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + ".");
			}
		});
		btnpound.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnpound.setBounds(241, 453, 95, 72);
		contentPane.add(btnpound);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "1");

			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(42, 368, 95, 72);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "2");

			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(140, 368, 95, 72);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "3");

			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(241, 368, 95, 72);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "4");

			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(42, 286, 95, 72);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "5");

			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(140, 286, 95, 72);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "6");

			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(241, 286, 95, 72);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "7");

			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(42, 204, 95, 72);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "8");

			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(140, 204, 95, 72);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(ekran.getText() + "9");

			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(241, 204, 95, 72);
		contentPane.add(btn9);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!ekran.getText().equals("")) {
					
					num2 = Integer.parseInt(ekran.getText());
					
					if(operator == "add") {
						result = num1 + num2;
						ekran.setText(Double.toString(result));
					}
					if(operator == "sub") {
						result = num1 - num2;
						ekran.setText(Double.toString(result));

					}
					if(operator == "multiply") {
						result = num1 * num2;
						ekran.setText(Double.toString(result));

					}
					if(operator == "divide") {
						result = num1 / num2;
						ekran.setText(Double.toString(result));

					}
					
				}
				
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnequal.setBounds(346, 453, 95, 72);
		contentPane.add(btnequal);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!ekran.getText().equals("")) {
					num1 = Integer.parseInt(ekran.getText());
					operator = "add";
					ekran.setText("");
				}
				
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnadd.setBounds(346, 368, 95, 72);
		contentPane.add(btnadd);
		
		JButton btnsubt = new JButton("-");
		btnsubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!ekran.getText().equals("")) {
					num1 = Integer.parseInt(ekran.getText());
					operator = "sub";
					ekran.setText("");
				}
				
			}
		});
		btnsubt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnsubt.setBounds(346, 286, 95, 72);
		contentPane.add(btnsubt);
		
		JButton btnmulti = new JButton("*");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!ekran.getText().equals("")) {
					num1 = Integer.parseInt(ekran.getText());
					operator = "multiply";
					ekran.setText("");
				}
				
			}
		});
		btnmulti.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnmulti.setBounds(346, 204, 95, 72);
		contentPane.add(btnmulti);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!ekran.getText().equals("")) {
					num1 = Integer.parseInt(ekran.getText());
					operator = "divide";
					ekran.setText("");
				}
				
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btndivide.setBounds(346, 122, 95, 72);
		contentPane.add(btndivide);
		
		JButton btngeri = new JButton("<-");
		btngeri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btngeri.setBounds(241, 122, 95, 72);
		contentPane.add(btngeri);
		
		JButton btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ekran.setText(" ");
				num1 = 0;
				num2 = 0;
				result = 0;
				operator = " ";
			}
		});
		btnAc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAc.setBounds(42, 122, 189, 72);
		contentPane.add(btnAc);
		
		ekran = new JTextField();
		ekran.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ekran.setBounds(42, 40, 399, 72);
		contentPane.add(ekran);
		ekran.setColumns(10);
	}
}
