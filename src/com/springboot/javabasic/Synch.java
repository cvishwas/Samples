package com.springboot.javabasic;

public class Synch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callme target = new Callme();
		Caller obj1 = new Caller(target, "Hello");
		Caller obj2 = new Caller(target, "Thread");
		Caller obj3 = new Caller(target, "Synchronisation");
		
		try{
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e){
			System.out.println("Interrupted");
		}

	}

}
