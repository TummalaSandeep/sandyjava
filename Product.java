package com.niit.shopingcart;

public class Product {
private int id;
private String name;
public int price;
public Product(int id,String name)
{
	this.id=id;
	this.name=name;
	this.price=price;


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

public int getPrice(){
	return price;
}
public void setPrice(int price){
	this.price=price;
	

}
	}   