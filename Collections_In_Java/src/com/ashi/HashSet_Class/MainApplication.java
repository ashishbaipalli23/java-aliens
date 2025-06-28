package com.ashi.HashSet_Class;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainApplication {

	
	public static void main(String[] args) {

		
		HashSet<Integer> set = new HashSet<Integer>(); //creates a hashset with default capacity 16 and loadfactor 0.75
		
		
		
		HashSet<Integer> set1 = new HashSet<Integer>(10);//crates a hashset with default capacity 10 and loadfactor 0.75
		
		
		HashSet<Integer> set2 = new HashSet<Integer>(5, 0.5f);//crates a hashset with default capacity 5 and loadfactor 1
		
		List<String> list = List.of("A","B","A","C","B");
		
		HashSet<String> set3 = new HashSet<String>(list);
		System.out.println(set3); //remove duplicates and  insertion order no guarantee
		
		
		
		//methods in HashSet
		
		System.out.println("set3.contains(\"A\") :"+set3.contains("A"));
		
		System.out.println("set3.isEmpty() :"+set3.isEmpty());
		
		System.out.println("set :"+set3);
		System.out.println("set3.size() :"+set3.size());
		
		System.out.println("set3.remove(\"A\") :"+set3.remove("A"));
		
		System.out.println("set :"+set3);
		
		System.out.println("set3.contains(\"A\") :"+set3.contains("A"));
		
		System.out.println("set3.clear()");
		
		set3.clear();//Removes all of the elements from this set. The set will be empty after this call returns.
		
		System.out.println("set :"+set3);
		
		
		
//		HashSet<Integer> set4 = (HashSet<Integer>) Set.of(1,2,3,4,5);
//		System.out.println("set4 :"+set4);   //java.lang.ClassCastException: class java.util.ImmutableCollections$SetN cannot be cast to class java.util.HashSet (java.util.ImmutableCollections$SetN and java.util.HashSet are in module java.base of loader 'bootstrap')
//		
//		
		
	  HashSet<Integer> set5 = new HashSet<Integer>(Set.of(1,2,3,4,5));
	  System.out.println("set5 :"+set5);
	  
		Iterator<Integer> iterator = set5.iterator();
		//set5.add(9); if new element added then ConcurrentModificationExceptions
		//set5.remove(1);same 
		set5.add(5); // no execption 5 is already present
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			if (integer == 4) {
				iterator.remove();
			}

		}
		 System.out.println("set5 :"+set5);
		
		
		
	}
}
