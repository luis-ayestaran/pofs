package com.mexicacode.puntoventa.pojos;

public class UserProfile {
	private Long id;
	private User user;
	private Personal personal;
	private UserGroup userGroup;
	
	public UserProfile() {}
	
	public UserProfile(User user,Personal personal,UserGroup userGroup) {
		this.setUser(user);
		this.setPersonal(personal);
		this.setUserGroup(userGroup);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public UserGroup getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}
	
	
}
