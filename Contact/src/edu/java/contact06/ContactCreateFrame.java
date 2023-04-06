package edu.java.contact06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.contact.model.Contact;
import edu.java.contact05.ContactDaoImpl;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactCreateFrame extends JFrame {
	
	private final ContactDaoImpl dao = ContactDaoImpl.getInstance();
	private JPanel contentPane;
	private JPanel panel;
	private JPanel buttonPanel;
	private JLabel lblName;
	private JTextPane textName;
	private JTextPane textPhone;
	private JLabel lblPhone;
	private JLabel lblEmail;
	private JTextPane textEmail;
	private JButton btnCreate;
	private JButton btnCancel;
	
	private Component parent; // 부모 컴포넌트(JFrame)를 저장하기 위한 필드.
	private ContactMain06 app; // notifyContactCreated 메서드를 가지고 있는 객체.

	/**
	 * Launch the application.
	 */
	public static void showContactCreateFrame(Component parent, ContactMain06 app) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactCreateFrame frame = new ContactCreateFrame(parent, app); // 생성자 호출
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
	public ContactCreateFrame(Component parent, ContactMain06 app) {
		this.parent = parent; // jframe의 좌표를 알고난 후에 initialize 생성해야됨
		this.app = app;
		initialize(); // GUI 컴포넌트들을 생성하고 초기화.
	}
	
	public void initialize() {
		setTitle("새 연락처 저장");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 닫기x 버튼의 기본 동작을 현재 창만 닫기(Dispose)로 설정.
		
		// JFrame이 화면에 보이는 좌표
		int x = 100;
		int y = 100;
		if (parent != null) {
			x = parent.getX();
			y = parent.getY();
		}
		setBounds(x, y, 450, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblName = new JLabel("이름");
		lblName.setFont(new Font("굴림", Font.BOLD, 15));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(12, 10, 80, 30);
		panel.add(lblName);
		
		textName = new JTextPane();
		textName.setFont(new Font("굴림", Font.BOLD, 15));
		textName.setBounds(104, 10, 308, 30);
		panel.add(textName);
		
		lblPhone = new JLabel("전화번호");
		lblPhone.setFont(new Font("굴림", Font.BOLD, 15));
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setBounds(12, 50, 80, 30);
		panel.add(lblPhone);
		
		textPhone = new JTextPane();
		textPhone.setFont(new Font("굴림", Font.BOLD, 15));
		textPhone.setBounds(104, 50, 308, 30);
		panel.add(textPhone);
		
		lblEmail = new JLabel("이메일");
		lblEmail.setFont(new Font("굴림", Font.BOLD, 15));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(12, 90, 80, 30);
		panel.add(lblEmail);
		
		textEmail = new JTextPane();
		textEmail.setFont(new Font("굴림", Font.BOLD, 15));
		textEmail.setBounds(104, 90, 308, 30);
		panel.add(textEmail);
		
		buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		btnCreate = new JButton("저장");
		btnCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				createNewContact();
			}
		});
		btnCreate.setFont(new Font("굴림", Font.BOLD, 13));
		buttonPanel.add(btnCreate);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose(); // 현재 창 닫기
			}
		});
		btnCancel.setFont(new Font("굴림", Font.BOLD, 13));
		buttonPanel.add(btnCancel);
	}

	private void createNewContact() {
		// JTextField에서 이름, 전화번호, 이메일을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		// Contact 타입 객체 생성.
		Contact contact = new Contact(0, name, phone, email);
		// List에 추가. 파일 업데이트. -> DAO
		dao.create(contact);
		// ContactMain에게 새 연락처가 저장됐다고 알려줌.
		app.notifyContactCreated();		
		// 현재창 닫기
		dispose();
		
	}
}
