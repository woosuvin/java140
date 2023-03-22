package edu.java.inheritance09;

import java.util.Scanner;

enum Menu {
	// enum 열거형 상수(public static final Menu 타입 변수) 선언
	QUIT, CREATE, READ_ALL, READ_BY_INDEX, UPDATE, DELETE, UNKNOWN;

	/** 
	 * 정수가 입력되면, 그 정수에 해당하는 열거형 상수를 리턴.
	 * 0 -> QUIT, 1 -> CREATE, 2 -> READ_ALL, 3 -> READ_BY_INDEX, 4 -> UPDATE, 5 -> DELETE, 그 이외의 정수들인 경우에는 UNKNOWN을 리턴
	 * @param n 정수(int)
	 * @return Menu 타입의 열거형 상수.
	 */
//	public static Menu getValue(int n) {
//		if (n >= 0 && n <= 6) {
//			Menu[] m = Menu.values();
//			int index = n;
//			for (Menu x : m) {
//				x = m[index];
//			}
//			return m[index];
//		} else {
//			return UNKNOWN;
//		}
//	}
	
	public static Menu getValue(int n) {
		Menu[] menu = values(); // values()는 Enum 클래스에서 상속받은 메서드.
		int length = menu.length;
		if (n >= 0 && n < length) {
			return menu[n];
		} else {
			return menu[length - 1]; // return UNKNOWN
		}
	}


	
	
}

public class MenuTest {
	

	public static void main(String[] args) {
		Singleton s = Singleton.INSTANCE;
		// -> enum 타입이 열거형 상수를 1개만 가지고 있으면,
		//    그 enum 타입에 할당할 수 있는 객체는 오직 1개만 있게 됨.
		// -> 싱글톤 객체
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================================");
		System.out.println("0.QUIT  1.CREATE  2.READ_ALL  3.READ_BY_INDEX  4.UPDATE  5.DELETE");
		System.out.println("==================================================================");
		System.out.print("메뉴 선택 >>> ");
		int n = Integer.parseInt(sc.nextLine()); // 콘솔창에서 입력받은 정수
		
		
		

//		Menu m = Menu.CREATE;
		Menu menu = Menu.getValue(n); // 정수(int)를 전달하면 Menu의 상수들 중 하나를 리턴.
		
		
		
		switch (menu) {
		case QUIT:
			System.out.println(menu.name());
			break;
		case CREATE:
			System.out.println(menu.name());
			break;
		case READ_ALL:
			System.out.println(menu.name());
			break;
		case READ_BY_INDEX:
			System.out.println(menu.name());
			break;
		case UPDATE:
			System.out.println(menu.name());
			break;
		case DELETE:
			System.out.println(menu.name());
			break;
		default:
			System.out.println(menu.name());
		}

	}

}
