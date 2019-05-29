package com.shopping.collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> vals = new ArrayList<Double>();
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		System.out.println("Contents of vals\n");
		
		Spliterator<Double> si = vals.spliterator();
		while(si.tryAdvance((n) -> System.out.println(n)));
		System.out.println("------------");
		
		si = vals.spliterator();
		ArrayList<Double> sqrt = new ArrayList<Double>();
		while(si.tryAdvance((n) -> sqrt.add(Math.sqrt(n))));
		
		System.out.println("Contents of sqrt\n");
		si = sqrt.spliterator();
		si.forEachRemaining((n) -> System.out.println(n));
		System.out.println("------------");
		si.characteristics();
		

	}

}
