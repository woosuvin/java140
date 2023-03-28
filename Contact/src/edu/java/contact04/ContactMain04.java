package edu.java.contact04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.java.contact.menu.Menu;
import edu.java.contact.model.Contact;


// MVC(Model - View - Controller) 아키텍쳐에서 View에 해당하는 클래스.
// UI(User Interface)를 담당하는 클래스.


public class ContactMain04 {
	
	private Scanner scanner = new Scanner(System.in);
	private ContactDaoImpl dao = ContactDaoImpl.getInstance();

	public static void main(String[] args) {
		System.out.println("***** 연락처 프로그램 v0.4 *****");
		
		ContactMain04 app = new ContactMain04(); // -> ContactMain04의 static이 아닌 필드와 메서드들을 사용하기 위해서는 객체가 생성되어 있어야 함.
		
		
		boolean run = true;
		while(run) {
			int n = app.showMainMenu();
			Menu menu = Menu.getValue(n);
			switch (menu) {
			case QUIT:
				run = false;
				break; // switch 케이스 끝냄
			case CREATE:
				app.insertNewContact();
				break;
			case ALL:
				app.selectAllContacts();
				break;
			case SELECT:
				app.selectContactByIndex();
				break;
			case UPDATE:
				app.updateContact();
				break;
			case DELETE:
				app.deleteContact();
				break;
			default:
				System.out.print("다시 입력하세요 >>> ");				
			}
		} // end while
		
		System.out.println("******** 프로그램 종료 ********");

	} // end main


	private int showMainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("----------------------------------------------------------");
		System.out.print("선택 >>> ");
		int n = inputNumber();
		return n;
	}

	private int inputNumber() {
		while (true) {
			try {
				int n = Integer.parseInt(scanner.nextLine());
				return n;
			} catch (NumberFormatException e) {
				System.out.print("다시 입력하세요 >>> ");
			}
		}
	}
	
	private void insertNewContact() {
		System.out.println("\n--- 새 연락처 저장 ---");
		 
		System.out.print("이름 입력 >>> ");
		String name = scanner.nextLine();
		System.out.print("번호 입력 >>> ");
		String phone = scanner.nextLine();
		System.out.print("이메일 입력 >>> ");
		String email = scanner.nextLine();
		
//		contact.add(new Contact(0, name, phone, email));
		Contact contact = new Contact(0, name, phone, email);
		dao.create(contact); 
		
		System.out.println("! 저장 성공 !");
	}
	
	private void selectAllContacts() {
		System.out.println("\n--- 연락처 전체 목록 ---");
		List<Contact> contacts = dao.read(); // View(UI)는 Controller의 메서드를 호출해서 출력에 필요한 데이터를 리턴 받음.
		
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}
	
	private void selectContactByIndex() {
		System.out.println("\n--- 인덱스 검색 ---");
		System.out.print("검색할 인덱스 입력 >>> ");
		int index = inputNumber();
		
		Contact contact = dao.read(index); // View에서는 Controller의 메서드를 호출해서 인덱스 검색 결과를 리턴받음.
		
		if (contact != null) {
			System.out.println(contact);
		} else {
			System.out.println("! 해당 인덱스에는 연락처 정보가 없습니다 !");
		}
	}
	
	private void updateContact() {
		System.out.println("\n--- 인덱스 수정 ---");
		System.out.print("수정할 인덱스 입력 >>> ");
		int index = inputNumber();
		
		if (!dao.isValidIndex(index)) { // 유효하지 않은 인덱스이면
			System.out.println("! 해당 인덱스에는 연락처 정보가 없습니다 !");
			return; // 메서드 종료
		}
		Contact before = dao.read(index);
		System.out.println("수정 전 > " + before);
		
		System.out.print("이름 > ");
		String name = scanner.nextLine();
		System.out.print("번호 > ");
		String phone = scanner.nextLine();
		System.out.print("이메일 > ");
		String email = scanner.nextLine();
		
		Contact after = new Contact(0, name, phone, email); 
		int result = dao.update(index, after);
		if (result == 1) {
			System.out.println("! 업데이트 성공 !");
		} else {
			System.out.println("! 업데이트 실패 !");
		}
		
	}

	private void deleteContact() {
		System.out.println("\n--- 인덱스 삭제 ---");
		System.out.print("삭제할 인덱스 입력 >>> ");
		int index = inputNumber();
		
		if (!dao.isValidIndex(index)) { // 유효하지 않은 인덱스이면
			System.out.println("! 해당 인덱스에는 연락처 정보가 없습니다 !");
			return; // 메서드 종료
		}
		
		int result = dao.delete(index);
		
		if (result == 1) {
			System.out.println("! 삭제 성공 !");
		} else {
			System.out.println("! 삭제 실패 !");
		}
	}
	
	
	
	
}