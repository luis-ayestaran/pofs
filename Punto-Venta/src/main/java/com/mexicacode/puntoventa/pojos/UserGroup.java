package com.mexicacode.puntoventa.pojos;

public class UserGroup {
	private Long id;
	private String group;
	
	public UserGroup() {}
	
	public UserGroup(String group) {
		this.setGroup(group);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	
	
}
