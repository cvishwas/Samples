package com.springboot.javabasic;

class Triangle extends Figure {

	Triangle(double a, double b) { 
		super(a, b);
	}

// override area for rectangle 
	double area() { 
		System.out.println("Inside Area for Triangle.");
		return dim1 * dim2 / 2; 
		}
	
}

