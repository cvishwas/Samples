package com.springboot.javabasic;

public class Callme {
	void call(String msg){
		System.out.println("["+msg);
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.println("Interrupted me");
		}
		System.out.println("]");
	}

}
