package edu.java.inheritance06;

import java.util.Objects;

public class User {
	// field
	private String userId;
	private String password;
	
	// constructor (1) 기본 (2) argument 2개
	public User() {}
	
	public User(String userId, String password) {
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
	@Override
	public String toString () {
		String s = String.format("User(userId = %s, password = %s)", this.userId, this.password);
		return s;
	}

	// equals() override: 두 객체의 userId가 같으면 true, 그렇지 않으면 false.
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof User) {
			User other = (User) obj;
			result = (this.userId.equals(other.userId)) && (this.password.equals(other.password));
		}
		return result;
	}
	
	// hashCode() override : userId
	@Override
	public int hashCode() {
//		return Objects.hash(userId);
		return userId.hashCode();
	}
	
	
	
}
