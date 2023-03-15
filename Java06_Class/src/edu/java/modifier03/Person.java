package edu.java.modifier03;

public class Person {
	// field
	private String name;
	private int age;
	
	// constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// method
	// getter method: 필드의 값을 리턴하는 메서드. parameter 없음.
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// setter method: 필드의 값을 변경하는 메서드. 리턴값 없음. parameter 있음
	public void setAge(int age) {
		if (age >= 0) {
		this.age = age;
		} else {
			System.out.println("음수 나이는 허용되지 않음.");
		}
	}
	
}
