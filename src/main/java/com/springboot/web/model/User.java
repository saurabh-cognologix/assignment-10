package com.springboot.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
	
	@Id
	private String userName;
	private String password;

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public User() {
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

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}

}
