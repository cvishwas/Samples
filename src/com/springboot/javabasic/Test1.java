package com.springboot.javabasic;

import java.util.Scanner;

public class Test1 {
	public static void main(String args[]){

		 Scanner scan = new Scanner(System.in);
		    System.out.println("Please Input a number between 1 and 5");
		    int num = scan.nextInt();
		        
		    if (num == 1) {
		        System.out.println("You Selected if Statement");
		    }
		    else if (num == 2) {
		        System.out.println("You Selected switch Statement");
		    }
		    else if (num == 3) {
		        System.out.println("You Selected while Statement");
		    }
		    else if (num == 4) {
		        System.out.println("You Selected do-while Statement");
		    }
		    else if (num == 5) {
		        System.out.println("You Selected for Statement");
		    }
		    else {
		        System.out.println("Please ONLY enter Integer between 1 and 5!!");
		    }
	

	}

}
