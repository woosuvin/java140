package edu.java.inheritance06;

public class UserMain {

	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User("aaa", "aaa");
		
		u1.setUserId("aaa");
		u1.setPassword("aaa");
		
		System.out.println("u1: " + u1);
		System.out.println("u2: " + u2);
		
		System.out.println("equals: " + u1.equals(u2));
		
		System.out.println("u1 hashCode: " + u1.hashCode());
		System.out.println("u2 haseCode: " + u2.hashCode());
		
	}

}
