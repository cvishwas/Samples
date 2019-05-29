package com.shopping.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("F");
		l1.add("B");
		l1.add("D");
		l1.add("E");
		l1.add("s");
		l1.addFirst("A");
		l1.addLast("Z");
		l1.add(1,"A2");
		System.out.println("Contents of l1:"+l1);
		l1.remove("E");
		l1.remove(2);
		System.out.println("Contents of l1 after removal:"+l1);
		

	}

}
