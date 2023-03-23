package edu.java.contact02;

public enum Menu {
	QUIT, CREATE, ALL, SELECT, UPDATE, DELETE, UNKNOWN;
	
		public static Menu getValue(int n) {
			Menu[] menu = values();
			if(n >=0 && n < menu.length) {
				return menu[n];
			} else {
				return menu[menu.length - 1];
			}
		}
	
}
