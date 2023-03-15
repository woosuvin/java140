package edu.java.modifier03;

public class User {
	// field
	private int userNo;
	private String userId;
	private String password;
	
	// argument 3개를 갖는 생성자
	public User(int userNo, String userId, String password) {
		this.userNo = userNo;
		this.userId = userId;
		this.password = password;
	}
	
	// getter method
	public int getUserNo() {
		return this.userNo;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	// setter method
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
