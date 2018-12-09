package com.mexicacode.puntoventa.pojos;

public class Personal {
	
	private Long id;
	private String name;
	private String lastName;
	private String mothersLastName;
	
	public Personal() {}
	
	public Personal(String name,String lastName,String mothersLastName) {
		this.setName(name);
		this.setLastName(lastName);
		this.setMothersLastName(mothersLastName);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMothersLastName() {
		return mothersLastName;
	}
	public void setMothersLastName(String mothersLastName) {
		this.mothersLastName = mothersLastName;
	}
	
	

}
