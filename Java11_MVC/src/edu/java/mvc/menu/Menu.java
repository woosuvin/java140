package edu.java.mvc.menu;

public enum Menu {
	QUIT, CREATE_POST, ALL_POST, SELECT_POST, UPDATE_POST, DELETE_POST, UNKNOWN; // Menu 타입 변수
	
	public static Menu getValue(int n) {
		Menu[] menu = values(); 
		if(n >= 0 && n < menu.length) {
			return menu[n];
		} else {
			return menu[menu.length - 1]; // UNKNOWN
		}
	}
}
