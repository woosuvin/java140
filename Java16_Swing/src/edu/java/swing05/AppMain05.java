package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {
	// field
	private JFrame frame;
	private JRadioButton rbPackage;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbabstract;
	private JCheckBox cbFinal;
	private JCheckBox cbStatic;
	private JComboBox<String> comboBox;
	private JRadioButton rbPrivate;
	private JTextArea textArea;
	private JScrollPane scrollPane;
	private JButton btnInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 535, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbPrivate = new JRadioButton("private");
		rbPrivate.setSelected(true);
		rbPrivate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPrivate);
		rbPrivate.setFont(new Font("굴림", Font.BOLD, 16));
		rbPrivate.setBounds(35, 35, 108, 70);
		frame.getContentPane().add(rbPrivate);
		
		
		rbPackage = new JRadioButton("package");
		rbPackage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPackage);
		rbPackage.setFont(new Font("굴림", Font.BOLD, 16));
		rbPackage.setBounds(147, 35, 108, 70);
		frame.getContentPane().add(rbPackage);
		
		
		rbProtected = new JRadioButton("protected");
		rbProtected.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbProtected);
		rbProtected.setFont(new Font("굴림", Font.BOLD, 16));
		rbProtected.setBounds(259, 35, 108, 70);
		frame.getContentPane().add(rbProtected);
		
		
		rbPublic = new JRadioButton("public");
		rbPublic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPublic);
		rbPublic.setFont(new Font("굴림", Font.BOLD, 16));
		rbPublic.setBounds(371, 35, 108, 70);
		frame.getContentPane().add(rbPublic);
		
		
		cbabstract = new JCheckBox("abstract");
		cbabstract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbabstract.setFont(new Font("굴림", Font.BOLD, 16));
		cbabstract.setBounds(35, 107, 108, 70);
		frame.getContentPane().add(cbabstract);
		
		
		cbFinal = new JCheckBox("final");
		cbFinal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbFinal.setFont(new Font("굴림", Font.BOLD, 16));
		cbFinal.setBounds(147, 107, 108, 70);
		frame.getContentPane().add(cbFinal);
		
		
		cbStatic = new JCheckBox("static");
		cbStatic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbStatic.setFont(new Font("굴림", Font.BOLD, 16));
		cbStatic.setBounds(259, 107, 108, 70);
		frame.getContentPane().add(cbStatic);
		
		
		comboBox = new JComboBox<>();
		String[] emails = {"naver.com", "gmail.com", "kakao.com"};
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(emails);
		comboBox.setModel(model);
//		comboBox.setModel(new DefaultComboBoxModel(new String[] {"naver.com", "gmail.com", "kakao.com"}));
		comboBox.setFont(new Font("굴림", Font.BOLD, 16));
		comboBox.setBounds(35, 183, 220, 36);
		frame.getContentPane().add(comboBox);
		
		btnInfo = new JButton("확인");
		btnInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				printInfo();
			}
		});
		btnInfo.setFont(new Font("굴림", Font.BOLD, 16));
		btnInfo.setBounds(371, 183, 108, 36);
		frame.getContentPane().add(btnInfo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 229, 444, 186);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.BOLD, 20));
		scrollPane.setViewportView(textArea);
	}


	private void handleRadioButtonClick(ActionEvent event) {
		JRadioButton btn = (JRadioButton) event.getSource(); // 클릭 이벤트가 발생한 이벤트 소스(라디오버튼)을 찾음. (라디오버튼에서 발생한 이벤트e의 getSource)
		String btnText = btn.getText(); // 라디오버튼의 텍스트를 찾음.
		boolean selected = btn.isSelected(); // 라디오버튼의 선택(체크) 여부를 확인.
		textArea.setText(btnText + " : " + selected); // 결과를 JTextArea에 출력.
	}
	
	
	private void handleCheckBoxClick(ActionEvent event) {
		JCheckBox chbox = (JCheckBox) event.getSource(); // 클릭 이벤트가 발생한 이벤트 소스(체크박스)를 찾음.
		String text = chbox.getText(); // 체크박스의 텍스트를 찾음.
		boolean selected = chbox.isSelected(); // 체크박스의 체크(선택) 여부를 확인.
		textArea.setText(text + " : " + selected); // 결과를 JTextArea에 출력.
	}
	
	
	private void printInfo() { // 라디오버튼, 체크박스, 콤보박스의 상태를 JTextArea에 출력
		StringBuffer buffer = new StringBuffer(); // textArea에 출력할 문자열을 저장하기 위해 생성자 호출.
		
		// 어떤 라디오버튼이 선택됐는지 체크.
		if (rbPrivate.isSelected()) {
			buffer.append(rbPrivate.getText());
		} else if (rbPackage.isSelected()) {
			buffer.append(rbPackage.getText());
		} else if (rbProtected.isSelected()) {
			buffer.append(rbProtected.getText());
		} else if (rbPublic.isSelected()) {
			buffer.append(rbPublic.getText());
		}
		buffer.append(" 라디오 버튼 선택됨\n");
		
		// 체크박스들의 선택 여부를 확인.
		if (cbabstract.isSelected()) {
			buffer.append(cbabstract.getText()).append(" ");
		}
		if (cbFinal.isSelected()) {
			buffer.append(cbFinal.getText()).append(" ");
		}
		if (cbStatic.isSelected()) {
			buffer.append(cbStatic.getText()).append(" ");
		}
		buffer.append("체크 박스 선택됨\n");
		
		// 콤보박스에서 선택된 아이템 찾기
		String item = (String) comboBox.getSelectedItem();
		buffer.append(item);
		buffer.append(" 콤보 박스 선택됨\n");
		
		// 버퍼의 내용을 textArea에 출력
		textArea.setText(buffer.toString());
	}
	
	
} // end class AppMain05
