package edu.java.list04;

public class User {
	// fields
	private String id;
	private String password;
	
	// constructor
	public User() {}
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	// getter & setter
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// toString override
	@Override
	public String toString() {
		return "User (id= " + this.id + ", password= " + this.password + ")";
	}
	
	
	
}
