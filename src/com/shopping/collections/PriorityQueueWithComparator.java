package com.shopping.collections;

import java.util.PriorityQueue;

import com.shopping.beans.Product;

public class PriorityQueueWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Product> pq = new PriorityQueue<Product>(5,new ProductComparator());
		
		Product p1 = new Product("p1",10);
		Product p2 = new Product("p2",1);
		Product p3 = new Product("p3",2);
		Product p4 = new Product("p4",4);
		Product p5 = new Product("p5",7);
		pq.add(p1);
		pq.add(p2);
		pq.add(p3);
		pq.add(p4);
		pq.add(p5);
		while(!pq.isEmpty())
			System.out.println("Head Of the elment ="+pq.poll());

	}

}
