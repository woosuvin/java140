package edu.java.inheritance06;

import java.util.Objects;

public class User {
	// field
	private String userId;
	private String password;
	
	// constructor (1) 기본 (2) argument 2개. 생성자 쓸 때 리턴타입 쓰면 안됨.
	public User() {}
	
	public User(String userId, String password) {
//		super(); -> 조상 클래스(object) 기본 생성자 호출. 생략 가능.
		this.userId = userId;
		this.password = password;
	}
	
	// getter setter method
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// toString() override: "User(userId=..., password=...)"
//	@Override
//	public String toString () {
//		String s = String.format("User(userId = %s, password = %s)", this.userId, this.password);
//		return s;
//	}
	@Override
	public String toString() {
		return "User(userId= " + this.userId + ", password= " + this.password + ")";
	}
	
	
	
	// equals() override: 두 객체의 userId가 같으면 true, 그렇지 않으면 false.
	@Override
	public boolean equals(Object obj) { // argument는 object
		boolean result = false;
		if (obj instanceof User) { // obj가 User 클래스에 생성된 객체이면
			User other = (User) obj; // obj를 User타입으로 변환(casting) 후 other에 저장.
			result = (this.userId != null && this.userId.equals(other.userId)); // other.userId = ((User) obj).userId 
		}            // this.userId가 null이 아님을 검사해야됨. 안그러면 null point exception
		             // this.userId의 문자열과 other.userId의 문자열이 같은지 검사
		return result;
	}
	


	// hashCode() override : userId -> equals()리턴값이 true이면 hashCode()의 리턴값이 같아야 함.
	@Override
	public int hashCode() {
//		return Objects.hash(this.userId);
//		return userId.hashCode();
		if (this.userId == null) { // this.userId가 null이 아님을 검사해야됨. 안그러면 null point exception
			return 0;
		} else {
			return this.userId.hashCode();
		}
	}
	
	
	
}
