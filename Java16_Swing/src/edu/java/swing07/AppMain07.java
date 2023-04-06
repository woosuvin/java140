package edu.java.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 {
	
	Score score = new Score();
	
	private static final String[] COLUMN_NAMES = {"국어", "영어", "수학", "총점", "평균"}; // JTable에서 사용할 컬럼 이름.
	
	private DefaultTableModel model; // 테이블의 행, 열에 대한 정보를 갖는 객체.
	private JFrame frame;
	private JLabel lblKorean;
	private JTextField textKorean;
	private JTextField textEnglish;
	private JTextField textMath;
	private JLabel lblEnglish;
	private JLabel lblMath;
	private JButton btnInsert;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 565, 692);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblKorean = new JLabel("국어");
		lblKorean.setFont(new Font("굴림", Font.PLAIN, 20));
		lblKorean.setHorizontalAlignment(SwingConstants.CENTER);
		lblKorean.setBounds(38, 38, 106, 57);
		frame.getContentPane().add(lblKorean);
		
		lblEnglish = new JLabel("영어");
		lblEnglish.setFont(new Font("굴림", Font.PLAIN, 20));
		lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglish.setBounds(38, 105, 106, 57);
		frame.getContentPane().add(lblEnglish);
		
		lblMath = new JLabel("수학");
		lblMath.setFont(new Font("굴림", Font.PLAIN, 20));
		lblMath.setHorizontalAlignment(SwingConstants.CENTER);
		lblMath.setBounds(38, 172, 106, 57);
		frame.getContentPane().add(lblMath);
		
		textKorean = new JTextField();
		textKorean.setFont(new Font("굴림", Font.PLAIN, 20));
		textKorean.setBounds(156, 38, 362, 57);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);
		
		textEnglish = new JTextField();
		textEnglish.setFont(new Font("굴림", Font.PLAIN, 20));
		textEnglish.setBounds(156, 105, 362, 57);
		frame.getContentPane().add(textEnglish);
		textEnglish.setColumns(10);
		
		textMath = new JTextField();
		textMath.setFont(new Font("굴림", Font.PLAIN, 20));
		textMath.setBounds(156, 172, 362, 57);
		frame.getContentPane().add(textMath);
		textMath.setColumns(10);
		
		btnInsert = new JButton("입력");
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InsertData();
			}
		});
		btnInsert.setFont(new Font("굴림", Font.PLAIN, 20));
		btnInsert.setBounds(38, 251, 187, 57);
		frame.getContentPane().add(btnInsert);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DeleteData();
			}
		});
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 20));
		btnDelete.setBounds(331, 251, 187, 57);
		frame.getContentPane().add(btnDelete);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 337, 480, 286);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		Object[][] data = {}; // 테이블에 사용할 데이터.
		model = new DefaultTableModel(data, COLUMN_NAMES);
		table.setModel(model);
		scrollPane.setViewportView(table);
	}

	private void DeleteData() {
		// 1. 테이블에서 삭제하기 위해 선택된 행의 인덱스를 찾음.
		// 2. 해당 인덱스의 행을 테이블 모델에서 삭제.
		
		int index = table.getSelectedRow();
//		try {
//			model.removeRow(index);
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(frame, "선택하세요" + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
//		}
		
		if (index == -1) {
			JOptionPane.showMessageDialog(frame, "선택하세요", "선택", JOptionPane.WARNING_MESSAGE);
			return; // 메서드 종료
		} else {
			int confirm = JOptionPane.showConfirmDialog(frame, index + "인덱스 : 정말 삭제할까요?", "삭제", JOptionPane.YES_NO_OPTION);
			if (confirm == JOptionPane.YES_OPTION) {
				model.removeRow(index);
			}
		}
	}

	private void InsertData() {
		// 1. JTextField에서 세과목의 점수를 읽음.
		// 2. Score 타입 객체 생성.
		// 3. Jtable에 행(row)을 추가
		
		int korean = 0;
		int english = 0;
		int math = 0;
		
		try {
			korean = Integer.parseInt(textKorean.getText());
			english = Integer.parseInt(textEnglish.getText());
			math = Integer.parseInt(textMath.getText());
			if (korean > 100 || english > 100 || math > 100) {
				JOptionPane.showMessageDialog(frame, "다시 입력하세요", "error", JOptionPane.ERROR_MESSAGE);
				clearAllTextFields();
				return;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, "점수는 반드시 정수로 입력하세요" + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
			clearAllTextFields();
			return;
		} 
		
		Score score = new Score(korean, english, math);
		int total = score.getTotal();
		double mean = score.getMean();
		
//		Object[] row = {korean, english, math, total, mean};
		Object[] row = {score.getKorean(), score.getEnglish(), score.getMath(), score.getTotal(), score.getMean()};
		model.addRow(row);
		
		clearAllTextFields();
		
	}
	
	private void clearAllTextFields() {
		textKorean.setText("");
		textEnglish.setText("");
		textMath.setText("");
	}
	
}
