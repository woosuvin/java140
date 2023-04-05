package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class AppMain04 {

	private JFrame frame;
	private JButton btnNext;
	private JButton btnPre;
	private JLabel lblImage;
	
	private ImageIcon[] images = {new ImageIcon("images/image01.jpg"), new ImageIcon("images/image02.jpg"), 
			new ImageIcon("images/image03.jpg"), new ImageIcon("images/image04.jpg"), new ImageIcon("images/image05.jpg")};
	
	private static final String[] IMAGES = { // 이미지 파일의 경로들을 저장하는 배열.
			"images/image01.jpg",
			"images/image02.jpg",
			"images/image03.jpg",
			"images/image04.jpg",
			"images/image05.jpg"
	};
	private int curIndex; // 현재 화면에 보여지는 이미지 파일의 인덱스
	
	private int count = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
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
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		lblImage = new JLabel(new ImageIcon(IMAGES[curIndex])); // new ImageIcon("images/image01.jpg") 첫 화면에 현재 인덱스의 사진을 보여줌.
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(100, 100, 400, 400);
		frame.getContentPane().add(lblImage);
		
		btnPre = new JButton("<");
		btnPre.setFont(new Font("굴림", Font.BOLD, 21));
		btnPre.addActionListener(new ActionListener() { // btnPre버튼이 클릭될 때 자동으로 호출되는 메서드
			@Override
			public void actionPerformed(ActionEvent e) {
//				btnClick(e);
				showPreImage();
			}
		});
		btnPre.setBounds(12, 668, 180, 55);
		frame.getContentPane().add(btnPre);
		
		
		btnNext = new JButton(">");
		btnNext.setFont(new Font("굴림", Font.BOLD, 20));
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				btnClick(e);
				showNextImage();
			}
		});
//		btnNext.addActionListener(e -> showNextImage()); -> 람다표현식 사용 (actionListener 메서드는 이벤트e가 전달됐을 때 showNextImage를 호출한다.)
		btnNext.setBounds(392, 668, 180, 55);
		frame.getContentPane().add(btnNext);
		
	}

	
	protected void showPreImage() {
		if (curIndex == 0) {
			curIndex = IMAGES.length - 1;
		}
		curIndex--;
		lblImage.setIcon(new ImageIcon(IMAGES[curIndex]));
	}
	
	protected void showNextImage() {
		if (curIndex == IMAGES.length - 1) {
			curIndex = 0;
		}
		curIndex++;
		lblImage.setIcon(new ImageIcon(IMAGES[curIndex]));
	}


//	protected void btnClick(ActionEvent e) {
//		Object source = e.getSource();
//		
//			System.out.println(source == btnNext);
//			if (source == btnNext) {
//				if (count == images.length - 1) {
//					count = 0; 
//				}else {
//					count ++;
//				}
//			} else if (source == btnPre) {
//				if (count == 0) {
//					count = images.length - 1; 
//				} else {
//					count --;
//				}
//			}
//		
//		lblImage.setIcon(images[count]);
//		System.out.println(count);
//	}

	

}
