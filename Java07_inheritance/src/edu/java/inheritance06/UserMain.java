package edu.java.inheritance06;

public class UserMain {

	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User("aaa", "aaa");
		
		u1.setUserId("aaa");
		u1.setPassword("aaa");
		
		System.out.println("u1: " + u1); // u1.toString()메서드 호출됨.
		System.out.println("u2: " + u2); // u2.toString()메서드 호출됨.
		
		System.out.println("== 연산자: " + (u1 == u2)); // -> false
		System.out.println("equals 메서드: " + u1.equals(u2)); // -> true
		
		System.out.println("u1 hashCode: " + u1.hashCode());
		System.out.println("u2 haseCode: " + u2.hashCode());
		
	}

}
