package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain04 {

	private JFrame frame;
	private JButton btnNext;
	private JButton btnPre;
	private JLabel lblImage;
	
	private ImageIcon[] images = {new ImageIcon("images/image01.jpg"), new ImageIcon("images/image02.jpg"), 
			new ImageIcon("images/image03.jpg"), new ImageIcon("images/image04.jpg"), new ImageIcon("images/image05.jpg")};
	
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
		
		
		
		
		lblImage = new JLabel("New label");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(100, 100, 400, 400);
		frame.getContentPane().add(lblImage);
		
		btnPre = new JButton("<");
		btnPre.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnClick(e);
			}
		});
		btnPre.setBounds(79, 700, 97, 23);
		frame.getContentPane().add(btnPre);
		
		btnNext = new JButton(">");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnClick(e);
			}
		});
		btnNext.setBounds(403, 700, 97, 23);
		frame.getContentPane().add(btnNext);
		
	}

	protected void btnClick(ActionEvent e) {
		Object source = e.getSource();
		
			System.out.println(source == btnNext);
			if (source == btnNext) {
				if (count == images.length - 1) {
					count = 0; 
				}else {
					count ++;
				}
			} else if (source == btnPre) {
				if (count == 0) {
					count = images.length - 1; 
				} else {
					count --;
				}
			}
		
		lblImage.setIcon(images[count]);
		System.out.println(count);
	}

	

}
