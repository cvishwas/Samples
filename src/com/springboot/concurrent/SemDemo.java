package com.springboot.concurrent;

import java.util.concurrent.Semaphore;

public class SemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore sem = new Semaphore(2);
		new IncThread(sem,"A");
		new DecThread(sem,"B");
		new IncThread(sem,"C");
		new DecThread(sem,"D");
		new IncThread(sem,"E");
		new DecThread(sem,"F");		
	}

}
