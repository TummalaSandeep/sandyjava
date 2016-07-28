package com.niit.shopingcart;

public class Supplier {
private int id;
private String name;
private int address;
 private Product product;
private void Product(int id,String name,int address)
{
	this.id=id;
	this.name=name;
	this.address=address;
	this.product=product;
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
public int getAddress() {
	return address;
}
public void setAddress(int address) {
	this.address = address;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
}

 