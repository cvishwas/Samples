package com.springboot.concurrent;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable{
	String name;
	Semaphore sem;
	
	DecThread(Semaphore s, String n){
		sem = s;
		name = n;
		new Thread(this).start();
	}

	public void run() {
		System.out.println("Starting thread "+name);
		
		try {
			System.out.println(name + " Waiting to acquire permit ");
			sem.acquire();
			System.out.println(name + " Acquired permit ");
			for(int i=0;i < 5;i++) {
				System.out.println(name + ":" + " Before decrement" + Shared.count);
				Shared.count--;
				System.out.println(name + ":" + Shared.count);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sem.release();
			System.out.println(name + "'s permit released ");
		}
	}
}
