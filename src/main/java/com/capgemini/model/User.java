package com.capgemini.model;

public class User {
	// should be auto-generated
	private Long userId;
	// need to unique and should not allow null value. store email in userName
	private String userName;
	// you as developer define password complexity
	private String password;
	
	public User() {
		
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
