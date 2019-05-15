package com.springboot.javabasic;

public class DeadLock implements Runnable{
	DeadLockA a = new DeadLockA();
	DeadLockB b = new DeadLockB();
	
	DeadLock(){
		Thread.currentThread().setName("MainDeadLockThread");
		Thread t = new Thread(this,"RacingThread");
		t.start();
		
		a.methA(b);
		System.out.println("In Main thread");
	}

	@Override
	public void run() {
		b.methB(a);
		System.out.println("In Other thread");
		
	}
	
	public static void main(String args[]){
		new DeadLock();
	}

}
