package com.example;

public class user {

	public String username;
	public String password;
	public String grant_type;
	public user(String grant_type, String username, String passowrd){
		
		this.grant_type=grant_type;
		this.username = username;
		this.password = password;
	}
}
