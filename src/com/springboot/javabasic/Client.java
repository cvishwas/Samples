package com.springboot.javabasic;

public class Client extends Figure implements Callback {

	Client(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void callback(int param) {
		// TODO Auto-generated method stub
		System.out.println("callback called");
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
