package com.springboot.generics;

//A simple generic class.
//Here, T is a type parameter that
//will be replaced by a real type
//when an object of type Gen is created.
class Gen<T , V> {
	T ob1;
	V ob2;// declare an object of type T
	// Pass the constructor a reference to
	// an object of type T.

	Gen(T o1,V o2) {
		ob1 = o1;
		ob2 = o2;
	}

	// Return ob.
	T getOb1() {
		return ob1;
	}
	
	V getOb2() {
		return ob2;
	}
	// Show type of T.

	void showType() {
		System.out.println("Type of First object is " + ob1.getClass().getName());
		System.out.println("Type of second object is " + ob2.getClass().getName());
	}
}
