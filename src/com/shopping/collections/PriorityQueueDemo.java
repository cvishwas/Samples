package com.shopping.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("C");
		pq.add("C++");
		pq.add("Java");
		pq.add("Python");
		
		System.out.println("Head of the element = "+pq.peek());
		Iterator it = pq.iterator();
		while(it.hasNext())
            System.out.println(it.next()); 
		
		Iterator<String> itr2 = pq.iterator(); 
        while (itr2.hasNext()) 
            System.out.println(itr2.next()); 
  
        pq.poll();
        pq.remove("Java"); 
        System.out.println("after removing Java with" + 
                           " remove function:"); 
        Iterator<String> itr3 = pq.iterator(); 
        while (itr3.hasNext()) 
            System.out.println(itr3.next()); 
  
 
        boolean b = pq.contains("C"); 
        System.out.println ( "Priority queue contains C " + 
                             "or not?: " + b); 
  
 
        Object[] arr = pq.toArray(); 
        System.out.println ( "Value in array: "); 
        for (int i = 0; i<arr.length; i++) 
          System.out.println ( "Value: " + arr[i].toString()) ; 
	

	}

}
