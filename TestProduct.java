package com.niit.shopingcart;

public class TestProduct {
	public static void main(String args[])
	{
		Product p1=new Product(200,"sandeep");
		
		Product p2=new Product(300,"sai");
		
		Product p3=new Product(400,"teju");
		
		p1.setPrice(100000);
		p2.setPrice(200000);
		p3.setPrice(300000);
		
		System.out.println(p1.getId()+p1.getName());
		System.out.println("Name:"+p1.getName());
		System.out.println("Price:"+p1.getPrice());
		
		System.out.println("ID:"+p2.getId());
		System.out.println("Name:"+p2.getName());
		System.out.println("Price:"+p2.getPrice());
		
		System.out.println(p3.getId()+p3.getName());
		System.out.println("ID:"+p3.getId());
        System.out.println("Name:"+p3.getName());
		System.out.println("Price:"+p3.getPrice());
		
	}

}
  