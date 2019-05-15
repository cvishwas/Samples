package com.shopping.beans;

public class Product {
	private int id;
	private String name;
	private String sku;
	private String vendorName;
	private double price;
	
	public Product(){
		name = "xxx";
		price = 10.0;
	}
	
	public Product(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", sku=" + sku + ", vendorName=" + vendorName + ", price="
				+ price + "]";
	}
	
	

}
