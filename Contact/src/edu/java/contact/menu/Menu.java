package edu.java.contact.menu;

public enum Menu { 
	QUIT, CREATE, ALL, SELECT, UPDATE, DELETE, UNKNOWN; // Menu 타입의 변수들 (class: 변수 선언할 때 사용하는 타입 이름)
	
		public static Menu getValue(int n) {
			Menu[] menu = values(); // Menu.values() 같은 클래스이므로 클래스이름 생략.
			// values(): 모든 enum 클래스가 갖고 있는 static 메서드.
			// values의 리턴 값: {QUIT, CREATE, ALL, SELECT, UPDATE, DELETE, UNKNOWN}. Menu 타입의 배열을 리턴해줌.
			if(n >=0 && n < menu.length) {
				return menu[n];
			} else {
				return menu[menu.length - 1]; // UNKNOWN
			}
		}
	
}
