package com.springboot.javabasic;

public class Client extends Figure implements Callback {

	@Override
	public void callback(int param) {
		// TODO Auto-generated method stub
		System.out.println("callback called");
	}

}
