package com.springboot.javabasic.enumerations;

public class EnumDemo {

	public static void main(String[] args) {
		Apple ap;

		ap = Apple.RedDel;
		
		System.out.println("Value of ap:"+ap);
		
		ap = Apple.GoldenDel;

		
		if(ap == Apple.valueOf("RedDel"))
		System.out.println("ap contains GoldenDel.\n");
		// Use an enum to control a switch statement.
		switch(ap) {
		case Jonathan:
		System.out.println("Jonathan is red.");
		break;
		case GoldenDel:
		System.out.println("Golden Delicious is yellow.");
		break;
		case RedDel:
		System.out.println("Red Delicious is red.");
		break;
		case Winesap:
		System.out.println("Winesap is red.");
		break;
		case Cortland:
		System.out.println("Cortland is red.");
		break;
		}

	}

}
