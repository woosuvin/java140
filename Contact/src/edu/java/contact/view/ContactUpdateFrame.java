package edu.java.contact.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.java.contact.model.Contact;
import edu.java.contact.controller.ContactDaoImpl;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUpdateFrame extends JFrame {

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
	private int cid; // 업데이트 할 연락처의 cid(PK)를 저장하기 위한 필드/.
	private ContactMain app; // 업데이트 성공 후 알림 메스드를 호출하기 위한 객체.
	
	private final ContactDaoImpl dao = ContactDaoImpl.getInstance();

	/**
	 * Launch the application.
	 */
	public static void showContactUpdateFrame(Component parent, int cid, ContactMain app) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUpdateFrame frame = new ContactUpdateFrame(parent, cid, app);
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
	public ContactUpdateFrame(Component parent, int cid, ContactMain app) {
		this.parent = parent; // jframe의 좌표를 알고난 후에 initialize 생성해야됨
		this.cid = cid;
		this.app = app;
		initialize(); // GUI 컴포넌트들을 생성하고 초기화.
		readContact();
	}
	
	private void readContact() {
		Contact contact = dao.read(cid);
		textName.setText(contact.getName());
		textPhone.setText(contact.getPhone());
		textEmail.setText(contact.getEmail());
	}

	public void initialize() {
		setTitle("연락처 업데이트");
		
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
		
		btnCreate = new JButton("수정");
		btnCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
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

	private void updateContact() {
		// JTextField에서 업데이트 정보들을 읽음.
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		Contact contact = new Contact(cid, name, phone, email);
		int confirm = JOptionPane.showConfirmDialog(ContactUpdateFrame.this, "업데이트 할까요?", "수정", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			dao.update(contact); // 리스트 수정하고, 파일에 업데이트.
			app.notifyContactUpdated(); // ContactMain 프레임에 있는 테이블을 갱신하기 위해서
			dispose(); // 현재 창 닫기
		}
	}

	
}
