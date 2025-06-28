package com.ashi.LinkedHashSet_Class;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class MainApplication {

	public static void main(String[] args) {

		LinkedHashSet<String> set1 = new LinkedHashSet<>();

		LinkedHashSet<String> set2 = new LinkedHashSet<>(100); // capacity = 100
		
		LinkedHashSet<String> set3 = new LinkedHashSet<>(100, 0.5f);

		LinkedHashSet<String> set4 = new LinkedHashSet<>(Arrays.asList("Java", "Spring", "Java"));

		
		
		
		//every methods same has set and hashset
		
		
		
		//insertion Order preserved 
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(List.of(1,21,3,2,1,1,2,2,1,2,2,21,2));
		System.out.println(set);
		
		List<String> names = Arrays.asList("Java", "Spring", "Java", "Hibernate");

		Set<String> uniqueNames = new LinkedHashSet<>(names);
		System.out.println(uniqueNames); // [Java, Spring, Hibernate]

		
		
		
		
		
		
	}
}
