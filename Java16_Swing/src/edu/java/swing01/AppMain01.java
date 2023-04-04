package edu.java.swing01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AppMain01 {

	private JFrame frame; // null; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Thread를 이벤트큐에 등록 -> JRE이 thread를 실행 -> run() 메서드 호출.
		EventQueue.invokeLater(new Runnable() { // thread 만들기 위한 메서드 new Thread(new Runnable() {@Override public void run() {} });
			public void run() {
				try {
					AppMain01 window = new AppMain01(); // 생성자 호출
					window.frame.setVisible(true); // 생성된 JFrame이 화면에 보임.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 기본 생성자 - Create the application.
	 */
	public AppMain01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(); // JFrame 객체 생성 -> 필드에 할당.
		frame.setBounds(300, 300, 600, 400); // JFrame의 시작 좌표(x, y), 크기(가로, 세로)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // -> JFrame 우상단의 닫기 버튼(x)의 기능 정의 -> 프로그램 종료.
		
		JLabel lblText = new JLabel("안녕하세요, Swing~"); // 자바에 객체 생성
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setFont(new Font("D2Coding", Font.ITALIC, 32));
		frame.getContentPane().add(lblText, BorderLayout.CENTER); // 생성된 자바 객체를 JFrame의(frame) ContentPane에 add
	}

}
