package com.shopping.collections;

import java.util.Comparator;

import com.shopping.beans.Product;

class ProductComparator implements Comparator<Product>{

	public int compare(Product p1, Product p2){
		if(p1.getDiscountPercentage() > p2.getDiscountPercentage())
			return 1;
		else
			return -1;
			
	}


}