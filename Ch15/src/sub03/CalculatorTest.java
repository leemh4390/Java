package sub03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
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
	public CalculatorTest() {
		setTitle("나의 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 305, 75);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBounds(12, 95, 68, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(92, 95, 68, 61);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBounds(171, 95, 68, 61);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(14, 166, 68, 61);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(94, 166, 68, 61);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(173, 166, 68, 61);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBounds(14, 236, 68, 61);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("2");
		btnNewButton_7.setBounds(94, 237, 68, 61);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("3");
		btnNewButton_8.setBounds(173, 237, 68, 61);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("/");
		btnNewButton_9.setBounds(251, 95, 68, 61);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("X");
		btnNewButton_10.setBounds(253, 166, 68, 61);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("-");
		btnNewButton_11.setBounds(253, 236, 68, 61);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("0");
		btnNewButton_12.setBounds(14, 307, 68, 61);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("c");
		btnNewButton_13.setBounds(94, 308, 68, 61);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.setBounds(173, 308, 68, 61);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		btnNewButton_15.setBounds(253, 307, 68, 61);
		contentPane.add(btnNewButton_15);
	}

}
