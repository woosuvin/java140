package edu.java.contact06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import edu.java.contact.model.Contact;
import edu.java.contact05.ContactDaoImpl;
import java.awt.Font;

public class ContactMain06 {
	private static final String[] COLUMN_NAMES= {"이름", "전화번호"}; // 테이블 컬럼 이름
	
	private JFrame frame;
	private JPanel buttonPanel;
	private JButton btnInsert;
	private JButton btnSearch;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JScrollPane scrollPane;
	private JTable table;
	private DefaultTableModel model; // 테이블의 데이터, 컬럼 이름 등을 관리하는 객체.
	private final ContactDaoImpl dao = ContactDaoImpl.getInstance(); // 연락처 정보 관리하는 객체(Controller)

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain06 window = new ContactMain06(); // 생성자 호출
					window.frame.setVisible(true); // 프레임에 보여줌.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void notifyContactCreated() { // ContactCreatedFrame에서 새 연락처 저장을 성공했을 때 호출할 메서드
		resetTableModel();
		JOptionPane.showMessageDialog(frame, "새 연락처 저장 성공");
	}

	public void notifyContactUpdated() { // ContactUpdateFrame에서 연락처 업데이트를 성공했을 때 호출할 메서드.
		resetTableModel();
		JOptionPane.showMessageDialog(frame, "연락처 수정 성공");
	}
	
	private void resetTableModel() { // JTable을 새로 그림.
		model = new DefaultTableModel(null, COLUMN_NAMES); // 데이터가 비워진 모델을 새로 생성하고
		loadContactData(); // 파일에 저장된 데이터를 다시 읽고 테이블 모델에 추가.
		table.setModel(model); // 새롭게 만들어진 테이블 모델을 테이블에 세팅.
	}
	
	/**
	 * Create the application.
	 */
	public ContactMain06() {
		initialize(); // 화면에 보여질 GUI 컴포넌트를 생성하고 초기화. initialize가 끝나야 테이블이 만들어지고 화면에 보여짐.
		loadContactData(); // 파일에 저장된 연락처 데이터 로딩(테이블 초기화). 
		
	}
	
	private void loadContactData() {
		List<Contact> list = dao.read();
		for (Contact x : list) {
			Object[] row = {x.getName(), x.getPhone()};
			model.addRow(row);
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("연락처 v0.6");
		
		buttonPanel = new JPanel();
		frame.getContentPane().add(buttonPanel, BorderLayout.NORTH);
		
		btnInsert = new JButton("새 연락처");
		btnInsert.setFont(new Font("굴림", Font.PLAIN, 15));
		btnInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // 이벤트가 발생하면 JRE이 호출해주는 메서드.
				ContactCreateFrame.showContactCreateFrame(frame, ContactMain06.this); // ContactMain06의 인스턴스 주소 (frame의 좌표 알기 위해, ContactMain06에서 public으로 공개된 것들을 보여주기 위해_
				// this -> ActionListener 타입의 익명 객체 (익명클래스니까)
				// ContactMain06.this -> ContactMain06 타입의 객체
			}
		});
		buttonPanel.add(btnInsert);
		
		btnSearch = new JButton("검색");
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 15));
		buttonPanel.add(btnSearch);
		
		btnUpdate = new JButton("수정");
		btnUpdate.setFont(new Font("굴림", Font.PLAIN, 15));
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
				
			}
		});
		buttonPanel.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 15));
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteContact();
			}
		});
		buttonPanel.add(btnDelete);
		
		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(); // JTable 타입의 객체 생성
		table.setFont(new Font("굴림", Font.PLAIN, 12));
		model = new DefaultTableModel(null, COLUMN_NAMES); // TableModel 객체 생성
		table.setModel(model); // TableModel 객체를 테이블에 세팅
		// TODO 테이블 컬럼 이름의 폰트 변경
		// TODO 테이블 데이터 행의 폰트 변경
		scrollPane.setViewportView(table); // 테이블을 스크롤페인에 넣음
	}

	private void updateContact() {
		int row = table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(frame, "선택하세요", "수정", JOptionPane.WARNING_MESSAGE);
			return;
		}
		// ContactUpdateFrame을 생성해서 업데이트 창을 띄움.
		// 새 창의 부모 컴포넌트  -> 업데이트 창을 띄울 좌표를 계산하기 위해서
		// 선택된 테이블 행 인덱스 -> 업데이트 창에서 수정 전의 연락처를 출력하기 위해서.
		// ContactMain의 주소 전달 -> 업데이트 성공했을 때 업데이트 창이 메인 창에게 알려주기 위해서.
		ContactUpdateFrame.showContactUpdateFrame(frame, row, ContactMain06.this);
	}

	private void deleteContact() {
		// 테이블에서 선택된 행의 인덱스를 찾음.
		int row = table.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(frame, "선택하세요", "삭제", JOptionPane.WARNING_MESSAGE);
			return;
		}
		int confirm = JOptionPane.showConfirmDialog(frame, "삭제하겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.NO_OPTION) {
			return;
		}
		dao.delete(row); // 리스트에서 연락처 삭제, 파일 업데이트.
		model.removeRow(row); // JTable에서 행 삭제.
		
		JOptionPane.showMessageDialog(frame, "삭제 성공");
	}
	

}
