package sub02;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class Component extends JFrame {

	private JPanel contentPane;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Component frame = new Component();
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
	public Component() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 23));
		lblNewLabel.setBounds(23, 10, 208, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Button 컴포넌트\r\n");
		lblNewLabel_1.setBounds(23, 59, 105, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				JOptionPane.showMessageDialog(null, "버튼 2 클릭...");
			}
		});
		btn1.setBounds(23, 81, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				JOptionPane.showMessageDialog(null, "버튼 3 클릭...", "대화상자 제목", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btn2.setBounds(121, 81, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if (answer == JOptionPane.YES_NO_OPTION) {
					System.out.println("Yes 클릭...");
				} else {
					System.out.println("취소 클릭...");
				}
			}
		});
		
		btn3.setBounds(218, 81, 97, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("버튼 4 클릭...");
			}
		});
		btn4.setBounds(315, 81, 97, 23);
		contentPane.add(btn4);
		
		txtf1 = new JTextField();
		txtf1.setBounds(23, 147, 116, 21);
		contentPane.add(txtf1);
		txtf1.setColumns(10);
		
		JLabel textField컴포넌트 = new JLabel("textField컴포넌트");
		textField컴포넌트.setBounds(23, 122, 116, 15);
		contentPane.add(textField컴포넌트);
		
		txtf2 = new JTextField();
		txtf2.setColumns(10);
		txtf2.setBounds(23, 178, 116, 21);
		contentPane.add(txtf2);
		
		txtf3 = new JTextField();
		txtf3.setColumns(10);
		txtf3.setBounds(23, 209, 116, 21);
		contentPane.add(txtf3);
		
		JLabel lbltxtf1result = new JLabel("결과 : ");
		lbltxtf1result.setBounds(256, 150, 156, 15);
		contentPane.add(lbltxtf1result);
		
		JLabel lbltxtf2result = new JLabel("결과 : ");
		lbltxtf2result.setBounds(256, 181, 145, 15);
		contentPane.add(lbltxtf2result);
		
		JLabel lbltxtf3result = new JLabel("결과 : ");
		lbltxtf3result.setBounds(256, 212, 156, 15);
		contentPane.add(lbltxtf3result);
		
		JButton btntxtf1 = new JButton("확인");
		btntxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf1.getText();
				lbltxtf1result.setText("결 과 : " + txt);
				
			}
		});
		btntxtf1.setBounds(147, 146, 97, 23);
		contentPane.add(btntxtf1);
		
		JButton btntxtf2 = new JButton("확인");
		btntxtf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String txt = txtf2.getText();
				lbltxtf2result.setText("결 과 : " + txt);
			}
		});
		btntxtf2.setBounds(147, 177, 97, 23);
		contentPane.add(btntxtf2);
		
		JButton btntxtf3 = new JButton("확인");
		btntxtf3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text = txtf3.getText();
				lbltxtf3result.setText("결 과 " + text);
			}
		});
		btntxtf3.setBounds(147, 208, 97, 23);
		contentPane.add(btntxtf3);
		
		JCheckBox chk1 = new JCheckBox("등산");
		chk1.setBounds(13, 296, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("여행");
		chk2.setBounds(69, 296, 49, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("운동\r\n");
		chk3.setBounds(121, 296, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("게임");
		chk4.setBounds(182, 296, 49, 23);
		contentPane.add(chk4);
		
		JLabel lblNewLabel_2 = new JLabel("CheckBox 컴포넌트\r\n");
		lblNewLabel_2.setBounds(23, 245, 145, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("취미를 고르세요\r\n");
		lblNewLabel_3.setBounds(23, 270, 135, 15);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chk5 = new JCheckBox("독서");
		chk5.setBounds(245, 296, 57, 23);
		contentPane.add(chk5);
		
		JLabel lblchkresult = new JLabel("결과 : ");
		lblchkresult.setBounds(23, 325, 155, 15);
		contentPane.add(lblchkresult);
		
		JButton btnchk = new JButton("확인");
		btnchk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				List<String> chks = new ArrayList<>();
				
				if (chk1.isSelected()) {
					chks.add(chk1.getText());
					
				} if (chk2.isSelected()) {
					chks.add(chk2.getText());
					
				} if (chk3.isSelected()) {
					chks.add(chk3.getText());
					
				} if (chk3.isSelected()) {
					chks.add(chk3.getText());
					
				} if (chk4.isSelected()) {
					chks.add(chk4.getText());
					
				} if (chk5.isSelected()) {
					chks.add(chk5.getText());
				}
				
				lblchkresult.setText("결과 : " + chks.toString());
				
			}
		});
		btnchk.setBounds(315, 296, 97, 23);
		contentPane.add(btnchk);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 컴포넌트\r\n");
		lblNewLabel_4.setBounds(23, 350, 135, 15);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton rdmale = new JRadioButton("남자");
		rdmale.setBounds(23, 371, 57, 23);
		contentPane.add(rdmale);
		
		JRadioButton rdfemale = new JRadioButton("여자");
		rdfemale.setBounds(82, 371, 57, 23);
		contentPane.add(rdfemale);
		
		JLabel lblgenderresult = new JLabel("결과 :");
		lblgenderresult.setBounds(23, 400, 176, 15);
		contentPane.add(lblgenderresult);
		
		JButton btngender = new JButton("확인");
		btngender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String result = null;
				
				if(rdmale.isSelected()) {
					lblgenderresult.setText("결 과 : 남자");
				} else { 
					lblgenderresult.setText("결 과 :  여자");
				}
					
				
			}
		});
		btngender.setBounds(147, 371, 97, 23);
		contentPane.add(btngender);

	}
}
