package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class AppMain03 {

	private JFrame frame;
	private JTextField textInput1;
	private JTextField textInput2;
	private JTextArea resultArea;
	private JButton btnAdd;
	private JButton btnSubtract;
	private JButton btnMultiply;
	private JButton btnDivision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 642);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNum1 = new JLabel("num1");
		lblNum1.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setBounds(45, 50, 110, 55);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("num2");
		lblNum2.setFont(new Font("D2Coding", Font.BOLD, 20));
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setBounds(45, 115, 110, 55);
		frame.getContentPane().add(lblNum2);
		
		textInput1 = new JTextField();
		textInput1.setFont(new Font("굴림", Font.BOLD, 20));
		textInput1.setHorizontalAlignment(SwingConstants.CENTER);
		textInput1.setBounds(194, 49, 279, 55);
		frame.getContentPane().add(textInput1);
		textInput1.setColumns(10);
		
		textInput2 = new JTextField();
		textInput2.setFont(new Font("굴림", Font.BOLD, 20));
		textInput2.setHorizontalAlignment(SwingConstants.CENTER);
		textInput2.setBounds(194, 114, 279, 56);
		frame.getContentPane().add(textInput2);
		textInput2.setColumns(10);
		
		btnAdd = new JButton("+");
		btnAdd.setFont(new Font("굴림", Font.BOLD, 20));
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnAdd.setBounds(45, 206, 97, 60);
		frame.getContentPane().add(btnAdd);
		
		btnSubtract = new JButton("-");
		btnSubtract.setFont(new Font("굴림", Font.BOLD, 20));
		btnSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnSubtract.setBounds(158, 206, 97, 60);
		frame.getContentPane().add(btnSubtract);
		
		btnMultiply = new JButton("x");
		btnMultiply.setFont(new Font("굴림", Font.BOLD, 20));
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnMultiply.setBounds(267, 206, 97, 60);
		frame.getContentPane().add(btnMultiply);
		
		btnDivision = new JButton("/");
		btnDivision.setFont(new Font("굴림", Font.BOLD, 20));
		btnDivision.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnDivision.setBounds(376, 206, 97, 60);
		frame.getContentPane().add(btnDivision);
		
		resultArea = new JTextArea();
		resultArea.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 20));
		resultArea.setBounds(45, 301, 428, 246);
		frame.getContentPane().add(resultArea);
	}

	protected void handleButtonClick(ActionEvent event) {
//		System.out.println(event.getSource());
		// -> argument로 전달된 ActionEvent 객체에서 이벤트가 발생한 GUI 컴포넌트 정보를 알 수 있다.
		
		// JTextField에 입력된 문자열을 읽어서 double 타입으로 변환.
		double num1 = 0;
		double num2 = 0;
		try {
			num1 = Double.parseDouble(textInput1.getText());
			num2 = Double.parseDouble(textInput2.getText());
			
		} catch (NumberFormatException e) {
			resultArea.setText("숫자를 입력하세요");
			return; // 메서드 종료
		}
		
		double result = 0; // 사칙 연산 결과를 저장할 변수
		String op = ""; // 사칙 연산자 문자열을 저장할 변수(+ - x /)
		Object source = event.getSource(); // 이벤트가 발생한 컴포넌트.
		if (source == btnAdd) {
			result = num1 + num2;
			op = "+";
		} else if (source == btnSubtract) {
			result = num1 - num2;
			op = "-";
		} else if (source == btnMultiply) {
			result = num1 * num2;
			op = "x";
		} else if (source == btnDivision) {
			result = num1 / num2;
			op = "/";
		}
		String msg = String.format("%f %s %f = %f", num1, op, num2, result);
		resultArea.setText(msg);
	}

	

	


//	protected void handleBtnDivisionClick() {
//		try {
//			double num1 = Double.parseDouble(textInput1.getText());
//			double num2 = Double.parseDouble(textInput2.getText());
//			double result = num1 / num2;
//			resultArea.setText(String.valueOf(result));
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

//	protected void handleBtnMultiplyClick() {
//		try {
//			double num1 = Double.parseDouble(textInput1.getText());
//			double num2 = Double.parseDouble(textInput2.getText());
//			double result = num1 * num2;
//			resultArea.setText(String.valueOf(result));
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

//	protected void handleBtnSubtractClick() {
//		try {
//			double num1 = Double.parseDouble(textInput1.getText());
//			double num2 = Double.parseDouble(textInput2.getText());
//			double result = num1 - num2;
//			resultArea.setText(String.valueOf(result));
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

//	protected void handleBtnAddClick() {
//		try {
//			double num1 = Double.parseDouble(textInput1.getText());
//			double num2 = Double.parseDouble(textInput2.getText());
//			double result = num1 + num2;
//			resultArea.setText(String.valueOf(result));
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}
