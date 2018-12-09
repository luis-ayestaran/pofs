package com.mexicacode.puntoventa.pojos;

public class Product {
	private Long id;
	private String product;
	private String brand;
	private String type;
	
	public Product() {}
	
	public Product(String product,String brand,String type) {
		this.setProduct(product);
		this.setBrand(brand);
		this.setType(type);
	}
	
	public Product(Long id,String product,String brand,String type) {
		this(product,brand,type);
		this.setId(id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String espacio = new String(", ");
		sb.append("[");
		sb.append("ID:");
		sb.append(this.getId());
		sb.append(espacio);
		sb.append("Product:");
		sb.append(this.getProduct());
		sb.append(espacio);
		sb.append("Brand:");
		sb.append(this.getBrand());
		sb.append(espacio);
		sb.append("Type:");
		sb.append(this.getType());
		sb.append("]");
		return sb.toString();
	}
	
}
