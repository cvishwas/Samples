package com.springboot.javabasic;

public class DeadLockB {

	synchronized void methB(DeadLockA a){
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered DeadLockB.meth");
		
		try{
			Thread.sleep(1000);
		}catch(Exception ex){
			System.out.println("DeadLockB interrupted");
		}
		System.out.println("Before calling meth2A");
		a.meth2A();		
	}
	
	synchronized void meth2B(){
		System.out.println("Inside meth2B");
	}
	

}
