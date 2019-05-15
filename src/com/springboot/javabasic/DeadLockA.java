package com.springboot.javabasic;

public class DeadLockA {
	synchronized void methA(DeadLockB b){
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered DeadLockA.meth");
		
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.println("DeadLockA interrupted");
		}
		System.out.println("Before calling meth2B");
		b.meth2B();
	}
	
	synchronized void meth2A(){
		System.out.println("Inside meth2A");
	}

}
