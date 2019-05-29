package com.shopping.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Double> hm = new HashMap<String,Double>();
		hm.put("java", new Double(10.0));
		hm.put("C", new Double(20.0));
		hm.put("c++", new Double(30.0));
		hm.put("python", new Double(40.0));
		
		Set<Map.Entry<String,Double>> set = hm.entrySet();
		for(Map.Entry<String,Double> me:set) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		Collections.synchronizedMap(hm);
	}

}
