package com.mexicacode.puntoventa.pojos;

public class User{
	
	private Long id;
	private String username;
	private String password;
	
	public User() {
		
	} 
	
	public User(String username,String password) {
		this();
		this.setUsername(username);
		this.setPassword(password);
	}
	
	public User(Long id, String username,String password) {
		this(username,password);
		this.setId(id);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}

