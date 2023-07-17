package com.example.demo.model;

import java.io.Serializable;

public class User implements Serializable {

	private int id;
	private String userName;
	private String passWord;

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
	}

	public User(int id, String userName, String passWord) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}

	public User() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}