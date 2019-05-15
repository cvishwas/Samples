package com.shopping.dao;

import com.shopping.beans.Product;

public class ProductSave {
	
	public void prodSave(){
		Product product = new Product();
		product.setName("Iphone");
		System.out.println(product);
	}
	
	public int prodSave(Product a){
		a.setName("Iphone");
		System.out.println(a);
		return 0;
	}	
	
	public static void main(String args[]){
	
		Product product = new Product();
//		product.setName("Iphone");
		System.out.println("Constructor 1->"+product);
		
		Product product1 = new Product("GGG",500);
		System.out.println("Constructor 2->"+product1);
	}

}
