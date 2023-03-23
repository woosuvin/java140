package edu.java.contact02;

import java.util.Scanner;

public class ContactMain02 {
	// 상수(constant)
	private static final int MAX_LENGTH = 3; // 연락처 배열의 최대 길이(원소 개수)

	// field
	private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처를 저장할 배열.
	private int count = 0; // 연락처 배열에 현재까지 저장된 연락처의 개수. 배열에 저장될 때마다 값 증가.
	private Scanner scanner = new Scanner(System.in); // 입력 도구. 객체가 만들어져 있음.

	public static void main(String[] args) {
		System.out.println("***** 연락처 프로그램 v0.2 *****");

		ContactMain02 app = new ContactMain02(); // static이 아닌 메서드들을 사용하기 위해 참조변수 생성.

		boolean run = true;
		while (run) {
			// 메인 메뉴 보여주기
			// 메인 메뉴에서 선택된 값

			Menu menu = Menu.getValue(app.showMainMenu());
			
			switch (menu) {
			case QUIT:// 프로그램 종료
				run = false;
				break;
			case CREATE: // 새 연락처 저장
				app.insertNewContact();
				break;
			case ALL: // 전체 목록
				app.selectAllContact();
				break;
			case SELECT: // 배열의 인덱스로 검색
//				app.searhContact();
				app.selectContactByIndex();
				break;
			case UPDATE: // 연락처 이름, 전화번호, 이메일 정보 수정
				app.updateContactByIndex();
				break;
			case DELETE: // 배열의 인덱스로 연락처 삭제하기
				app.deleteContactByIndex();
				break;
			default:
				System.out.print("메뉴를 다시 입력하세요 >>> ");
			}
		}

		System.out.println("******** 프로그램 종료 ********");

	}// main end

	
	
	
	public int showMainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------");
		System.out.println("[0]종료 [1]새 연락처 [2]전체 목록 [3]검색 [4]수정 [5]삭제");
		System.out.println("----------------------------------------------------------");
		System.out.print("선택 >>> ");
		// 콘솔 창에서 입력된 문자열 1개 라인을 정수(int)로 변환.
		return inputInteger();
	}

	public int inputInteger() {
		int result = 0;
		while (true) {
			try {
				result = Integer.parseInt(scanner.nextLine());
				break;
			} catch (NumberFormatException e){
				System.out.print("메뉴를 다시 입력하세요 >>> ");
			}
		}
		return result;
	}
	
	
	
	// 1번
	public void insertNewContact() {
		if (count == MAX_LENGTH) {
			System.out.println("! 저장 공간 부족 !");
			return; // 메서드 종료, 아래 코드 실행 안됨.
		}

		System.out.println();
		System.out.println("--- 새 연락처 저장 ---");
		System.out.print("이름 입력 >>> ");
		String name = scanner.nextLine(); // 공백을 포함해서 엔터가 입력될 때까지 모든 문자열을 읽음.
		System.out.print("번호 입력 >>> ");
		String phone = scanner.nextLine();
		System.out.print("이메일 입력 >>> ");
		String email = scanner.nextLine();

		// 입력받은 정보들로 Contact 타입의 객체 생성.
		Contact c = new Contact(0, name, phone, email);

		// 생성된 Contact 타입의 객체를 배열에 저장.
		contacts[count] = c;

		// 배열에 저장된 원소(연락처) 개수를 1 증가.
		count++;

		System.out.println("! 저장 성공 !");
	}

	// 2번
	public void selectAllContact() {
		System.out.println();
		System.out.println("--- 연락처 목록 ---");
//		for (count = 0; count < MAX_LENGTH; count++) {
//			contacts[count].printInfo();
		for (int i = 0; i < count; i++) {
			contacts[i].printInfo();
		}
	}

	// 3번
//	public void searhContact() {
//		System.out.print("검색 >>> ");
//	    int i = scanner.nextInt();
//	    contacts[i].printInfo();
//	}
	public void selectContactByIndex() {
		System.out.println();
		System.out.println("--- 인덱스 검색 ---");
		System.out.print("검색할 인덱스 입력 >>> ");
		int index = inputInteger();

		if (index >= 0 && index < count) {
			contacts[index].printInfo();
			
		} else {
		System.out.println("! 해당 인덱스에는 연락처 정보가 없습니다 !");
		}
	}

	// 4번
	public void updateContactByIndex() {
			System.out.println();
			System.out.println("--- 연락처 수정 ---");
			System.out.print("수정할 연락처 인덱스 입력 >>> ");
			int index = inputInteger();
			
			if (index < 0 || index >= count) {
				System.out.println("! 해당 인덱스에는 연락처 정보가 없습니다 !");
				return;
			}
			System.out.print("수정 전: ");
			contacts[index].printInfo(); // 수정 전 연락처 출력

			System.out.print("수정할 이름 입력 >>> ");
			String name = scanner.nextLine();
			System.out.print("수정할 전화번호 입력 >>> ");
			String phone = scanner.nextLine();
			System.out.print("수정할 이메일 입력 >>> ");
			String email = scanner.nextLine();

			// 수정할 인덱스의 정보 업데이트
			contacts[index].setName(name);
			contacts[index].setPhone(phone);
			contacts[index].setEmail(email);
//		contacts[index] = new Contact(0, name, phone, email);
			
			System.out.print("수정 후: ");
			contacts[index].printInfo();	
	}

	// 5번
	public void deleteContactByIndex() {
		
			System.out.println();
			System.out.println("--- 연락처 삭제 ---");
			System.out.print("삭제할 연락처 인덱스 입력 >>> ");
			int index = inputInteger();
			
			if (index < 0 || index >= count ) {
				System.out.println("! 해당 인덱스에는 연락처 정보가 없습니다 !");
				return;
			}
			
			for (int i = index; i < count - 1; i++) {
				contacts[i] = contacts[i + 1]; // 뒷쪽 연락처 정보를 한칸 앞으로
			}
			contacts[count - 1] = null; // 삭제 전 배열의 마지막 원소를 null;
			count--; // 배열 원소의 개수를 1 줄임.

			System.out.println("! 삭제 성공 !");		
	}

}
